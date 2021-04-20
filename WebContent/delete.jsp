<%@page import="it.helloabitante.model.Abitante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Inserisci Abitante da Rimuovere</h1>
	
	<% Abitante abitanteInDelete = (Abitante) request.getAttribute("abitante_delete"); %>
	
	<h3>Sicuro di voler eliminare l'abitante:</h3>
	<h2>Id: <%= abitanteInDelete.getIdAbitante() %></h2>
	<h2>Nome: <%= abitanteInDelete.getNome() %></h2>
	<h2>Cognome: <%= abitanteInDelete.getCognome() %></h2>
	<h2>Codice Fiscale: <%= abitanteInDelete.getCodiceFiscale() %></h2>
	<h2>Eta: <%= abitanteInDelete.getEta() %></h2>
	<h2>Motto di Vita: <%= abitanteInDelete.getMottoDiVita() %></h2>
	
	<form action="ExecuteDeleteAbitanteServlet" method="post">
		
		<input type="hidden" name="idDeleteInput" value=<%= abitanteInDelete.getIdAbitante() %>>
		<input type="submit" value="Elimina">
		
	</form>
	
	<form action="SearchServlet" method="post">
		<input type ="hidden" name="nomeInput" value = "<%= abitanteInDelete.getNome() %>"> 
		<input type ="hidden" name="cognomeInput" value = "<%= abitanteInDelete.getCognome() %>"> 
		<input type = "submit" value = "annulla">
	</form>

</body>
</html>