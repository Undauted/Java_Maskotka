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
<body >


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
</div>
<br />


	<jsp:useBean id="rejestruj" class="jsp.rejestracja.Rejestracja" scope="session" />
	<jsp:useBean id="pamiec1" class="com.example.servletjspdemo.service.Pamiec" scope="application" />
	<jsp:useBean id="pluszak" class="com.example.servletjspdemo.domain.Maskotka" scope="session" />
	<jsp:useBean id="pamiec" class="jsp.pamiecrejestracji.PamiećRejestracji" scope="application" />
<% 
	

		pluszak.setImie("");
		pluszak.setRodzaj("");
		pluszak.setMaterial("");
		pluszak.setInteraktywna("");
		pluszak.setZdjecie("");
		
	
		
		%>
<div class="reszta">
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	Witaj <% out.print(session.getAttribute("theName")); %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href ="http://localhost:8080/servletjspdemo/profil.jsp" class="btn btn-primary active">Twój profil</a>
	<h2>MASKOTKA</h2>
</div>
<form action="dodanie.jsp">
	<script type="text/javascript">
		//<![CDATA[
		function initCap(inputField)
		{
		var v = inputField.value;
		var f = v.charAt(0).toUpperCase();
		inputField.value = f + v.substring(1,v.length);
		}
		//]]>
	</script>
<div class="imie">
<div class="czcionka">
  Imie :&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="text" name="imie" id="my-textbox" required size="42" onchange="initCap(this)"/><br /><br />
</div> </div>
	<script>
		var myTextbox = document.getElementById('my-textbox');
		 
		function checkName(evt) {
		    var charCode = evt.charCode;
		 
		    if (charCode != 0) {
		    	  if (charCode < 65 || charCode > 122) {
		            evt.preventDefault();
		            alert(
		                "Proszę używać tylko liter\n" 
		            );
		    	   }
		    }
		}
		 
		myTextbox.addEventListener( 'keypress', checkName, false );
 
	</script>
<div class="k">
<div class="czcionka">
  	Rodzaj:  
</div>
 
<div class="radio">
  <input type="radio"  name="rodzaj" value="Mis" checked/> Mis<br />
  <input type="radio"  name="rodzaj" value="Zwierzątko" /> Zwierzątko<br />
  <input type="radio"  name="rodzaj" value="Postać z bajki" /> Postać z bajki<br />
  <input type="radio"  name="rodzaj" value="Postać z filmu" /> Postać z filmu<br />
  <input type="radio"  name="rodzaj" value="Pacynka" /> Pacynka<br /><br /> 
</div>
</div>
<div class="material" >
<div class="czcionka">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  Materiał wykonania : 
</div> <br/>
  
<div class="lista">
	<select name="material" required size="5" >
		<option value="Plusz">Plusz</option>
		<option value="Bawełna">Bawełna</option>
		<option value="Len">Len</option>
		<option value="Dzianina">Dzianina</option>
		<option value="Welur">Welur</option>
		<option value="Polar">Polar</option>
	</select>
</div>
</div>
	<br /><br /><br /><br /><br /><br /><br /><br />
<div class="napisInter">
	Czy interaktywna ??</div> 
<div class="interakcja">
	
<div class="radio">
	<input type="radio"  name="interaktywna" value="Tak" checked/>Tak
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  	<input type="radio"  name="interaktywna" value="Nie" />Nie<br /><br />
</div>
</div>
  	
<div class="k"> 
<div class="czcionka">
  	Zdjecie: <input type="text" name="zdjecie" required size="42"/>
</div>
</div>
<br /><br />
<div class="reszta">
  <input type="submit" value=" Akceptuj" class="btn btn-danger btn-large active">
</div>
</form>


<div id='czas'></div>
</div>
</body>
</html>