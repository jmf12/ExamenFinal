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

<title>Registro!</title>

</head>
<body>
	<div class="container">
	
		<form action="<%=request.getContextPath()%>/TiposDbController"
			method="POST">
			<h4>Resgitro Typesdb</h4>
			<div class="input-group mb-2">
				<span class="input-group-text">ID</span> <input type="text"
					name="id" aria-label="First name" class="form-control" />
			</div>
			<div class="input-group mb-2">
				<span class="input-group-text">Descripcion</span> <input type="text"
					name="descripcion" aria-label="First name" class="form-control" />
			</div>
			<div class="input-group mb-2">
				<span class="input-group-text">Driver</span> <input type="text"
					name="driver" aria-label="First name" class="form-control" />
			</div>
			<div class="input-group mb-2">
				<span class="input-group-text">Adicional</span> <input name="pass"
					type="adicional" aria-label="First name" class="form-control" />
			</div>
			<button type="submit" class="btn btn-success">Enviar</button>
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>
</body>
</html>