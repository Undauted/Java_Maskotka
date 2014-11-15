<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>REJESTRACJA</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="a.css" type="text/css" /> 

<script type="text/javascript">

function validate(form)
{	if(form.wiek.value >18)
	{
	alert('Jestes za stary . Musisz mieć maksimum 18 lat');
	form.wiek.value="";
	}
	else
	if(form.wiek.value== "" || form.imie.value =="" || form.login.value=="" || form.haslo.value=="" || form.repPass.value=="")
	{
		alert('Wszystkie pola muszą być wypełnione');
	}
	else
		if(form.login.value.length < 4)
			{
			alert('Login za krótki . Wymagane minimum 4 znaki');
			}
	else
   if(form.imie.value.substr(form.imie.value.length-1, 1) == 'a') {
      alert('Miło dziewczynko że się zarejestrowałaś ;)');
   } else {
      alert('Miło chłopczyku zę się zarejestrowałeś ;)');
   }

   // \d{9} - 9 kolejnych cyfr
   // (\d{3}[- ]?){3} grupy cyfr po 3 oddzielone - lub spacją lub niczym

   //if(!form.f_telefon.value.match(/(\d{3}[- ]?){3}/))
   //{
  //    form.f_telefon.style.backgroundColor = 'green';
  // } else {
  //    form.f_telefon.style.backgroundColor = 'white';
  // }
}


function validate_pass(p,r) {
	 if(document.getElementById(p).value!=document.getElementById(r).value) {
		 document.getElementById(r).value="";
		 alert('Powtórzone hasło jest błędne . Prosze spróbować ponownie');
		 
	  } 
	  
	}

</script>
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
<% 
	rejestruj.setLogin("");
	rejestruj.setHaslo("");
	rejestruj.setImie("");
	rejestruj.setWiek("");
%>

<form action="dodanieRejestru.jsp" onreset="if (!confirm('Czy na pewno chcesz zresetować formularz?')) return false">
<div class="reszta">
	<input type="reset" value="Wyczyść formularz" class="btn btn-danger  active"/><br /><br />
</div>
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
  Imie :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="text" name="imie" id="my-textbox" maxlength="25" required size="42" onchange="initCap(this)"><br /><br />
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
<br />
<div class="imie">
<div class="czcionka">
  Login :&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="text" name="login" pattern=".{4,}" title="4 znaki minimum" required size="42" /><br /><br />
</div> </div>

<br />
<div class="imie">
<div class="czcionka">
  Hasło :&nbsp;&nbsp;&nbsp;&nbsp;
 <input type="password" name="haslo" id="pass" required size="15"/>
  &nbsp;&nbsp;
  Powtórz hasło:&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="password" name="repPass" id="repPass" onchange="return validate_pass('pass','repPass')" required size="15"/>
  <br /><br />
</div> </div>

<div class="lista2">
  Twój wiek : 
 <input type="text" id="wieki" name="wiek" maxlength="3" required size="15" />
</div> 
<script>
		var wieki = document.getElementById('wieki');
		 
		function checkName(evt) {
		    var charCode = evt.charCode;
		 
		    if (charCode != 0) {
		    	  if (charCode < 48 || charCode > 57) {
		            evt.preventDefault();
		            alert(
		                "Proszę używać tylko cyfr\n" 
		            );
		    	   }
		    }
		}
		 
		wieki.addEventListener( 'keypress', checkName, false );
 
</script>
<br /><br />
<div class="reszta">
  <input type="submit" value=" Akceptuj" class="btn btn-primary btn-large active"   onClick="validate(this.form);" >
<a href ="http://localhost:8080/servletjspdemo/index.jsp" class="btn btn-primary active">Strona Tytułowa</a>
  
  
</div>

</form>


</div>
</body>
</html>