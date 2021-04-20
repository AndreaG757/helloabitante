<%@page import="it.helloabitante.model.Abitante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visualizza Dettagli</title>
</head>
<body>
	
	<% Abitante abitanteInDettaglio = (Abitante) request.getAttribute("abitante_attribute"); %>

	<h1>Dettagli dell'abitante: <%= abitanteInDettaglio.getNome() %> <%= abitanteInDettaglio.getCognome() %> </h1>
	<h3>Id: <%= abitanteInDettaglio.getIdAbitante() %></h3>
	<h3>Nome: <%= abitanteInDettaglio.getNome() %></h3>
	<h3>Cognome: <%= abitanteInDettaglio.getCognome() %></h3>
	<h3>Codice Fiscale: <%= abitanteInDettaglio.getCodiceFiscale() %></h3>
	<h3>Eta': <%= abitanteInDettaglio.getEta() %></h3>
	<h3>Motto di vita: <%= abitanteInDettaglio.getMottoDiVita() %></h3>
	
</body>
</html>