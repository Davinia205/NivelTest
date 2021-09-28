<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="modelo.Pregunta"%>
<%@page import="dao.DaoPregunta"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width">
<link rel="stylesheet" type="text/css" href="elaboracionTest.css"/>
<title>Insert title here</title>
</head>
<script>
	function showAlert() {
		alert("Pregunta registrada");
	}
</script>
<body>

<h1>Complete la siguiente plantilla con el contenido del test de nivel: </h1>

<div class='formulario'>
<form name="InsertarTest" action="Sv_Pregunta" method="post">
<ul>
<li><label>Pregunta: </label> <input type="text" name="texto" size="100" required></li>
<br></br>
<label>Puntuaci&#243n: </label> <input type="text" name="puntuacion" required pattern="[0-9]{1}">
<br></br>

<label>Opci&#243n 1: </label> <input type= "text" name="opcion" required >
<br></br>
Indique V (verdadero) o F (falso): </label> <input type="text" name="respuesta" required pattern="[V,F]{1}">
<br></br>
<input type="submit" value="Guardar" onclick="showAlert()">
<br></br>
</ul>
</form>
</div>
</body>
</html>
