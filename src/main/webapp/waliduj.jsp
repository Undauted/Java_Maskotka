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
	<br/><br/>
	<div class="glowna">
	<div class="reszta">
		<h2>MASKOTKA</h2>
	</div>
<%
   String login = request.getParameter( "login" );
   session.setAttribute( "theName", login );
   String password = request.getParameter("password");
   session.setAttribute("thePassword", password);
   
	for (Rejestracja rejestruj : pamiec.getAll()) 
	{ 	
	
	if(session.getAttribute( "theName" ).toString().equals(rejestruj.getLogin().toString()) 
			&& session.getAttribute( "thePassword" ).toString().equals(rejestruj.getHaslo().toString()))
	{
		out.println("<script  type='text/javascript'>"
				+"location.href='formularz.jsp';" 
				+"</script>");
		
		
	}
	
 } 
   
%>
	<div class='napisyProjekt2'>Wprowadzono błędny login lub hasło ;(<br/><br/> Nastąpi ponowne załadowanie strony z logowaniem</div>
    <script  type="text/javascript"> 
    setTimeout(function(){location.href="logowanie.jsp";}, 3000);
	</script>
  </div>
</body>
</html>