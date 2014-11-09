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
<div class="rusz">
	<a href="http://localhost:8080/servletjspdemo/formularz.jsp"  class="btn btn-primary active">Strona Główna</a>
	<a href="http://localhost:8080/servletjspdemo/wyswie.jsp" class="btn btn-primary active">Lista maskotek</a>

	<a href ="http://localhost:8080/servletjspdemo/wylogowanie.jsp" class="btn btn-primary active">Wyloguj</a>

</div>
</div>
<br />
		<jsp:useBean id="rejestruj1" class="jsp.rejestracja.Rejestracja" scope="session" />
		<jsp:useBean id="pamiec" class="jsp.pamiecrejestracji.PamiećRejestracji" scope="application" />
		

<div class="reszta">
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
	<h2>MASKOTKA</h2>
</div>	<br />
<%

   for(Rejestracja rejestruj : pamiec.getAll())
   {
	   if(session.getAttribute("theName").equals(rejestruj.getLogin()))
		{
		   out.println("<div class='obrazek'><img src='http://1.bp.blogspot.com/_DlOfDrPI0DQ/TS4bK_dPZgI/AAAAAAAAABs/rKCUi6j4Ptw/s1600/as8883_bob_budowniczy_big.png' height='150' width='150' alt='Brak zdjęcia'></div>");
		    out.println("<div class='imie'><div class='czcionka'>Login:"
		    		+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
			  		+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<div class='profil'><input type='text' name='login' size='30' value=" + rejestruj.getLogin() +" disabled  /></div></div></div></br>");
		    out.println("<div class='imie'><div class='czcionka'>Wiek:"
		    		+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
			  		+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<div class='profil'><input type='text' name='wiek' size='30' value=" + rejestruj.getWiek() +"  readonly/></div></div></div></br>");
		    out.println("<div class='imie'><div class='czcionka'>Hasło:"
		    		+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
			  		+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<div class='profil'><input type='text' name='haslo' size='30' value=" + rejestruj.getHaslo() +"  readonly/></div></div></div></br>");
			
		
		
		}
   }
 
   
%>
	
  </div>
</body>
</html>