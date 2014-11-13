<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="jsp.rejestracja.Rejestracja"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>MASKOTKA</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="a.css" type="text/css" /> 
</head>
<body>
	<div class="przesuniecie">
		<img src="http://cdn.bulbagarden.net/upload/thumb/7/72/613Cubchoo.png/180px-613Cubchoo.png" height='300' width='300'>
	</div>
	<div class="przesuniecie2">
		<img src="http://cdn.bulbagarden.net/upload/thumb/7/72/613Cubchoo.png/180px-613Cubchoo.png" height='300' width='300'>
	</div>
	
	<%
		if(session.getAttribute("theName") == null)
		{	out.println("<br/><br/><div class='glowna'><div class='reszta'><h2>MASKOTKA</h2></div>");
			out.println("<div class='napisyProjekt2'>Musisz się zalogować aby przejśc na tą strone.<br/>" 
					+ "Stona automatycznie przejdzie do formularza logowania</div></div>");
			
			out.println("<script  type='text/javascript'>"
					+"setTimeout(function(){location.href='logowanie.jsp';},3000)" 
					+"</script>");
			return;
		}
		
	%>
	<div class="glowna">
	<div class="linki">
	
		<a href="http://localhost:8080/servletjspdemo/formularz.jsp"  class="btn btn-primary active">Strona Główna</a>
		<a href="http://localhost:8080/servletjspdemo/wyswie.jsp" class="btn btn-primary active">Lista maskotek</a>
		<a href ="http://localhost:8080/servletjspdemo/wylogowanie.jsp" class="btn btn-primary active">Wyloguj</a>
		
	
	</div> <br/>

		<jsp:useBean id="pluszak" class="com.example.servletjspdemo.domain.Maskotka" scope="session" />
		
		<jsp:setProperty name="pluszak" property="*" /> 
		<jsp:useBean id="rejestruj" class="jsp.rejestracja.Rejestracja" scope="session" />
		<jsp:useBean id="pamiec1" class="com.example.servletjspdemo.service.Pamiec" scope="application" />
		<jsp:useBean id="pamiec" class="jsp.pamiecrejestracji.PamiećRejestracji" scope="application" />

<div class="witaj">
	<a href ="http://localhost:8080/servletjspdemo/profil.jsp" class="btn btn-primary active">Twój profil</a>
</div>
<div class="data">
<c:set var="now" value="<%=new java.util.Date()%>" />
<b><fmt:formatDate type="date" 
            dateStyle="medium"
            value="${now}" /></b>
</div>
<div class="powitanie">
	<b>Witaj 
	<% 
	 for(Rejestracja rejestracja : pamiec.getAll())
	   {
		   if(session.getAttribute("theName").equals(rejestracja.getLogin()))
			{
			   out.print(rejestracja.getImie());
			}
		}
	%>
</b>
</div>	
<div class="reszta">
	<h2>MASKOTKA</h2>
</div>	
<br />

<div class="napisyProjekt2">
	<c:if test="${pageContext.request.method=='POST'}">
      <c:if test="${param.guess!='Zwierzątko'}">
      Jesteś w błędzie!<br />
      Zostaniesz za to wylogowany :)
       <script  type="text/javascript"> 
    setTimeout(function(){location.href="wylogowanie.jsp";}, 2000);
	</script>
	
	
      <br />
      <br />

    
      </c:if>

      <c:if test="${param.guess=='Zwierzątko'}">Zgadłeś
      <br />
      <br />

      
      </c:if>
    </c:if>
</div>
    <form method="post">
    <div class="czcionka">Zgadnij mojego ulubionego pluszaka?</div>
    <div class="radio">
 		<input type="radio"  name="guess" value="Mis" checked/> Mis<br />
  		<input type="radio"  name="guess" value="Zwierzątko" /> Zwierzątko<br />
  		<input type="radio"  name="guess" value="Postać z bajki" /> Postać z bajki<br />
  		<input type="radio"  name="guess" value="Postać z filmu" /> Postać z filmu<br />
  		<input type="radio"  name="guess" value="Pacynka" /> Pacynka<br /><br /> 
	</div>
	<div class="reszta">
    	<input type="submit" class="btn btn-primary active" value="Spróbuj!" />
	</div>
    <br />
    </form>
	</div>
</body>
</html>