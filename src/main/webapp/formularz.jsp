<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MASKOTKA</title>
</head>
<body>
<h2>MASKOTKA</h2>
<jsp:useBean id="pamiec" class="com.example.servletjspdemo.service.Pamiec" scope="application" />
<jsp:useBean id="pluszak" class="com.example.servletjspdemo.domain.Maskotka" scope="session" />
<%
pluszak.setImie("");
pluszak.setRodzaj("");
pluszak.setMaterial("");
pluszak.setInteraktywna("");
pluszak.setZdjecie("");
out.println(pluszak.getImie());%>
<form action="dodanie.jsp">

  Imie :<input type="text" name="imie" required/><br /><br />
  Rodzaj maskotki : <br /><br />
  <input type="radio"  name="rodzaj" value="Mis" checked/>Mis<br />
  <input type="radio"  name="rodzaj" value="Zwierzątko" />Zwierzątko<br />
  <input type="radio"  name="rodzaj" value="Postać z bajki" />Postać z bajki<br />
  <input type="radio"  name="rodzaj" value="Postać z filmu" />Postać z filmu<br />
   <input type="radio"  name="rodzaj" value="Pacynka" />Pacynka<br /><br />
  Materiał wykonania : <br /><br />
  <select name="material"  size="4" required>
	<option value="Plusz">Plusz</option>
	<option value="Bawełna">Bawełna</option>
	<option value="Len">Len</option>
	<option value="Dzianina">Dzianina</option>
	<option value="Welur">Welur</option>
	<option value="Polar">Polar</option>
	</select><br /><br />
	Czy interaktywna ?? <br/><br/>
	<input type="radio"  name="interaktywna" value="Tak" checked/>Tak<br />
  	<input type="radio"  name="interaktywna" value="Nie" />Nie<br /><br />
  	Zdjecie :<input type="text" name="zdjecie" required/><br /><br />
  	
  <input type="submit" value=" Akceptuj ">

</form>

</body>
</html>