<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="it.uniroma3.studente.Studente"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% Studente studente = (Studente) request.getAttribute("studente"); %>

	Nome:		<%= studente.getNome() %>				<br>
	Cognome:	<%= studente.getCognome() %>			<br>
	Matricola:	<%= studente.getMatricola() %>			<br>
	
	Host:		<%= request.getAttribute("host") %>		<br>
	Address:	<%= request.getAttribute("address") %>	<br>
	User:		<%= request.getAttribute("user") %>		<br>
	UserAgent:	<%= request.getAttribute("userAgent") %><br>

</body>
</html>