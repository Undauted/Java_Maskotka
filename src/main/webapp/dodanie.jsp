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
		
		<jsp:useBean id="pamiec1" class="com.example.servletjspdemo.service.Pamiec" scope="application" />
		<jsp:useBean id="pamiec" class="jsp.pamiecrejestracji.PamiećRejestracji" scope="application" />

<div class="witaj">
	<a href ="http://localhost:8080/servletjspdemo/profil.jsp" class="btn btn-primary active">Twój profil</a>
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
	<% 
	
	  pamiec1.dodaj(pluszak);
	
	  
	%>
	<div class="czcionka">
		<p>Dane o maskotce zostały dodane poprawnie ;) </p>
	</div>
	
	<div class="imie">
	<div class="czcionka">
	  Imie :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	  		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	  <input type="text" name="imie" id="my-textbox" required size="30" value="${pluszak.getImie()}" readonly /><br /><br />
	</div> 
	</div>
	<div class="czcionka">
		Rodzaj maskotki: 
	</div>
	<div class="dodanierodzaj">
		<input type="radio"  name="rodzaj" value="${pluszak.getRodzaj()}" checked/> ${pluszak.getRodzaj()}
	</div>
	
	<div class="czcionka">
		Materiał wykonania:
	</div>
	
	<div class="dodaniematerial">
		<select name="material"  required size="1" >
			<option value="${pluszak.getMaterial()}" >${pluszak.getMaterial()}</option>
		</select>
	</div>
	<div class="czcionka">
		<p>Interakywna: </p>
	</div>
	<div class="dodaniematerial">
		<input type="radio"  name="interaktywna" value="${pluszak.getInteraktywna()}" checked/> ${pluszak.getInteraktywna()}
	</div>
	<div class="czcionka">
		Zdjęcie:
	</div>
	<div class="zdjecie">
		<img src="${pluszak.getZdjecie()}"  height="55" width="55" alt="Brak zdjęcia">
	</div> <br/>
	<div class="listaDodanie">
	  <a href="wyswie.jsp" class="btn btn-primary btn-large active">Lista maskotek</a>
	</div>
	</div>
</body>
</html>