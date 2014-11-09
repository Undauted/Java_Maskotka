<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>LOGOWANIE</title>
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
	<h2>LOGOWANIE</h2>
</div>
</div>
</div>
<br/><br/>
	<form method="post" action="waliduj.jsp">
	<div class="imie">
	<div class="czcionka">
        Podaj swój login:&nbsp;&nbsp;&nbsp;&nbsp; 
        <input type="text" name="login" required size="42" /><br /><br />
        Podaj swoje hasło:&nbsp;
        <input type="password" name="password" required size="42"/><br /><br />
        </div></div>
    <div class="reszta">
  		<input type="submit" value="Zaloguj" class="btn btn-danger btn-large active">
  		<a href ="http://localhost:8080/servletjspdemo/index.jsp" class="btn btn-primary active">Strona Tytułowa</a>
	</div>
    </form>
</div>
</body>
</html>