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
	<jsp:useBean id="pamiec" class="jsp.pamiecrejestracji.PamiećRejestracji" scope="application" />
	
	<%
	
	if(session.getAttribute("theName") != null)
		
{	out.println("<br/><br/><div class='glowna'><div class='reszta'><h2>MASKOTKA</h2></div>");
	out.println("<div class='napisyProjekt2'>Jesteś zalogowowany.<br/>" 
			+ "Stona automatycznie przejdzie do formularza dodawania maskotki</div></div>");
	
	out.println("<script  type='text/javascript'>"
			+"setTimeout(function(){location.href='formularz.jsp';},3000)" 
			+"</script>");
	
	return;
}
	
%>
	
	<div class="linki">
	<div class="powitalna">
		<a href="http://localhost:8080/servletjspdemo/logowanie.jsp" class="btn btn-primary active">Logowanie</a>
		<a href="http://localhost:8080/servletjspdemo/rejestracja.jsp" class="btn btn-primary active">Rejestracja</a>
	</div>
	</div>
	<br/><br/>
	
	<div class="glowna">
	<div class="reszta">
		<h2>MASKOTKA</h2>
	</div>
	<div class="wysrodkowanie">
		Zabawka występująca pod różnymi postaciami i wykonana z różnych materiałów. 
		Najczęściej przeznaczona dla dzieci, ale korzystać z niej może każdy. 
		Maskotki mogą być wykonane przez producentów bądź własnoręcznie. 
		Materiały z jakich są robione to najczęściej plusz, bawełna, len, dzianina, welur, polar.
		<br/><br/>
		<b>Strona do skatalogowania swoich ulubionych pluszaków</b><br/><br/>
	<img src="a.jpg" height='120' width='120' alt='Brak zdjęcia'>
	<img src="b.jpg" height='120' width='120' alt='Brak zdjęcia'>	
	<img src="c.jpg" height='120' width='120' alt='Brak zdjęcia'>
	</div>
	</div>
</body>
</html>