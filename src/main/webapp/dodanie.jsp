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
	<div class="glowna">
	<%
		if(session.getAttribute("theName") == null)
		{	out.println("<div class='reszta'><h2>MASKOTKA</h2></div>");
			out.println("<div class='napisyProjekt2'>Musisz się zalogować aby przejśc na tą strone.<br/>" 
					+ "Stona automatycznie przejdzie do formularza logowania</div>");
			
			out.println("<script  type='text/javascript'>"
					+"setTimeout(function(){location.href='logowanie.jsp';},3000)" 
					+"</script>");
			return;
		}
		
	%>
	<div class="linki">
	<div class="rusz">
		<a href="http://localhost:8080/servletjspdemo/formularz.jsp"  class="btn btn-primary active">Strona Główna</a>
		<a href="http://localhost:8080/servletjspdemo/wyswie.jsp" class="btn btn-primary active">Lista maskotek</a>
		<a href ="http://localhost:8080/servletjspdemo/wylogowanie.jsp" class="btn btn-primary active">Wyloguj</a>
	</div>
	</div> <br/>
	<div class="reszta">
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	Witaj <% out.print(session.getAttribute("theName")); %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href ="http://localhost:8080/servletjspdemo/profil.jsp" class="btn btn-primary active">Twój profil</a>
	<h2>MASKOTKA</h2>
	</div>
		<jsp:useBean id="pluszak" class="com.example.servletjspdemo.domain.Maskotka" scope="session" />
		
		<jsp:setProperty name="pluszak" property="*" /> 
		
		<jsp:useBean id="pamiec1" class="com.example.servletjspdemo.service.Pamiec" scope="application" />
	
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