<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MASKOTKA</title>
</head>
<body>
<h2>MASKOTKA</h2>
<jsp:useBean id="pluszak" class="com.example.servletjspdemo.domain.Maskotka" scope="session" />

<jsp:setProperty name="pluszak" property="*" /> 

<jsp:useBean id="pamiec" class="com.example.servletjspdemo.service.Pamiec" scope="application" />

<% 
  pamiec.dodaj(pluszak);
%>

<p>Dane o maskotce zostały dodane poprawnie ;) </p>
<p>Imie: ${pluszak.getImie()} </p>
<p>Rodzaj maskotki: ${pluszak.getRodzaj()}</p>
<p>Materiał wykonania: ${pluszak.getMaterial()}</p>
<p>Interakywna: ${pluszak.getInteraktywna()}</p>
<p> <img src="${pluszak.getZdjecie()}" alt="Smiley face" height="50" width="50"></p>
<p>
  <a href="wyswie.jsp">Pokaż wszystkie pluszaki</a>
</p>
</body>
</html>