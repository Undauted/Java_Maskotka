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
	<br/><br/>
	<div class="glowna">
	
	<div class="linki">
	<div class="rusz">
	<div class="reszta">
		<h2>REJESTRACJA</h2>
	</div>
	</div>
	</div>
	<br/><br/>
		<jsp:useBean id="rejestruj" class="jsp.rejestracja.Rejestracja" scope="session" />
		
		<jsp:setProperty name="rejestruj" property="*" /> 
		
		<jsp:useBean id="pamiec" class="jsp.pamiecrejestracji.PamiećRejestracji" scope="application" />
	
	<% 
	
	for (Rejestracja rejestrowanie : pamiec.getAll()) 
	{ 	
		
		if(rejestruj.getLogin().equals(rejestrowanie.getLogin().toString()))
		{
			out.println("<div class='napisyProjekt2'>Konto o podanym loginie juz istnieje :(<br/><br/></div>");
			out.println("<div class='listaWyswie'><a href='rejestracja.jsp' class='btn btn-primary active'>Wróć do rejestracji</A></div>");
			
			return;
			
		}
	} 
	pamiec.dodaj(rejestruj);
	out.println("<div class='napisyProjekt2'>Konto zostało założone pomyślnie ;)<br/><br/></div>");
	out.println("<div class='listaWyswie'><a href='index.jsp' class='btn btn-primary active'>Wróć do strony głównej</A></div>");
	
	
	  
	%>
	
	

	
	
	</div>
</body>
</html>