<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
	function showAlert() {
		alert("Opciones registradas");
	}
</script>
<body>

<h1>Complete la siguiente plantilla con el contenido del test de nivel: </h1>

<div class="formularioOpciones">
<form name="opcion" action="Sv_Opcion" method="post">
<label>Opci&#243n 1: <input type= text name="opcion" required ></label>
<br></br>
Indique V (verdadero) o F (falso) <input type="text" name="respuesta" required pattern="[V,F]{1}">
<br></br>
<input type="submit" value="Guardar" onclick="showAlert()">
<br></br>
</ul>
</form>
</div>

</body>
</html>