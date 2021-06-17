<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html> 
<html lang="es">

<head>
<!-- Required meta tags -->
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous" />

<title>Login!</title>

</head>
<body>
	<div class="container">
		<h4>Iniciar Sesión</h4>
		<form action="<%=request.getContextPath()%>/LoginController" method="POST">
			<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label">Usuario</label> <input name="usuario"
					type="text" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp">
				<div id="emailHelp" class="form-text">No compartas tu usuario
					ni tu contraseña.</div>
			</div>
			<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label">Password</label>
				<input type="password" class="form-control" name="pass"
					id="exampleInputPassword1">
			</div>
			<button type="submit" class="btn btn-success">Ingresar</button>
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>
</body>
</html>
