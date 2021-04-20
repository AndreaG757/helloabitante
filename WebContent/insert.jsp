<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserisci Abitante</title>
</head>
<body>

 	<!-- Inserirre il controllo se uno sbaglia ad inserire -->
	<% if(request.getAttribute("messaggioDiErrore") != null){ %>
		<p style="color: red;"><%=request.getAttribute("messaggioDiErrore") %></p>
	<%  }else{ %>
		Inserire dati da ricercare<br>
	<%}    %>
	
	<h1>Inserisci Abitante</h1>
	
	<form action="ExecuteInsertAbitanteServlet" method="post">
				
		<label for="nomeInsertInput">Inserisci Nome:</label>
		<input type="text" name="nomeInsertInput"> <br>
		
		<label for="cognomeInsertInput">Inserisci Cognome:</label> 
		<input type="text" name="cognomeInsertInput"> <br>
		
		<label for="codiceFiscaleInsertInput">Inserisci Codice Fiscale:</label>
		<input type="text" name="codiceFiscaleInsertInput"> <br>
		
		<label for="etaInsertInput">Inserisci Eta':</label>
		<input type="text" name="etaInsertInput"> <br>
		
		<label for="mottoInsertInput">Inserisci Motto di Vita:</label>
		<input type="text" name="mottoInsertInput"> <br>
		
		<input type="submit" value="Inserisci">
		
	</form>

</body>
</html>