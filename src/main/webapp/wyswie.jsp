<%@page import="com.example.servletjspdemo.domain.Maskotka"%>
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
<%
int i=1;

  for (Maskotka pluszak : pamiec.getAll()) {
	  
	  out.println("<p>"+ i++ +"&nbsp;Imie: " + pluszak.getImie() 
	  				+ "<br/>&nbsp;&nbsp; Rodzaj maskotki: " + pluszak.getRodzaj() 
	  				+ "<br/>&nbsp;&nbsp;  Material wykonania: "+ pluszak.getMaterial() 
	  				+"<br/>&nbsp;&nbsp; Interakcja:"+ pluszak.getInteraktywna()
	  				+ "<br/>&nbsp;&nbsp; Zdjecie:"
	  				+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	  				+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	  				+"<img src='" + pluszak.getZdjecie() + "' height='120' width='120'>" + "</p>");
  }
%>
<p>
  <a href="formularz.jsp">Dodaj nowego pluszaka</a>
</p>

</body>
</html>