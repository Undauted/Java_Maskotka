<%@page import="com.example.servletjspdemo.domain.Maskotka"%>
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
	
	<div class="linki">
	<div class="rusz2">
		<a href="http://localhost:8080/servletjspdemo/formularz.jsp"  class="btn btn-primary active">Strona Główna</a>
		<a href="http://localhost:8080/servletjspdemo/wyswie.jsp" class="btn btn-primary active">Lista maskotek</a>
	</div>
	</div>
	
	<jsp:useBean id="pamiec" class="com.example.servletjspdemo.service.Pamiec" scope="application" />
	<br/>
	<div class="glowna" style="overflow: auto; width:600px;  height: 480px">
<%
String przyciskUsun = request.getParameter("usun");

if(przyciskUsun != null)
{
	int numer = Integer.parseInt(przyciskUsun);
	pamiec.usun(numer);
}
int i=1;
int indeks = 0;
  for (Maskotka pluszak : pamiec.getAll()) {
	  
	  out.println("<br/><br/><div class='wyswie'><div class='reszta'><h2>MASKOTKA</h2></div><div class='wielkość'>"
	  				+ i++ 
			  		+"&nbsp;Imie: <b>" + pluszak.getImie() + "</b>"
	  				+ "<br/>&nbsp;&nbsp; Rodzaj maskotki: <b>" + pluszak.getRodzaj() + "</b>"
	  				+ "<br/>&nbsp;&nbsp;  Material wykonania: <b>"+ pluszak.getMaterial() +"</b>"
	  				+"<br/>&nbsp;&nbsp; Interakcja: <b>"+ pluszak.getInteraktywna() + "</b>"
	  				+ "<br/>&nbsp;&nbsp; Zdjecie: <b>"
	  				+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	  				+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	  				+"<img src='" + pluszak.getZdjecie() + "' height='120' width='120' alt='Brak zdjęcia'>"+"</b>" 
	  				+"<form action='wyswie.jsp' method='get'>"
					+ "<button type='submit' name='usun' id='button' class='btn btn-primary active' value="+ indeks++ + ">Usuń</button>"
	  				+"</form>"
	  				+ "</div></div><br/>");
  }
%>
<br/>
	<div class="listaWyswie">
		<a href="formularz.jsp" class="btn btn-primary active">Dodaj nowego pluszaka</a>
	</div>
	</div>
</body>
</html>