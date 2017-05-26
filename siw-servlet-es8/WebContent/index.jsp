<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% String error = (String) request.getAttribute("parametroError"); %>

	<% if(error == null){ %>
	<form action="studente" method="get">
		Nome: <input type="text" name="nome" /><br> 
		Cognome: <input type="text" name="cognome" /><br>
		Matricola: <input type="text" name="matricola" /><br> 
		<input type="submit" name="sumbit"value="invia" />
	</form>
	<% } else {%>
	<form action="studente" method="get">
		Nome: <input type="text" name="nome" /> ${parametroError} <br> 
		Cognome: <input type="text" name="cognome" /> ${parametroError}<br>
		Matricola: <input type="text" name="matricola" /> ${parametroError}<br> 
		<input type="submit" name="sumbit"value="invia" />
	</form>
	<% } %>

</body>
</html>