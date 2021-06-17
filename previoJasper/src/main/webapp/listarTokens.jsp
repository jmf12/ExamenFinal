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
	<h1>Tokens Listado</h1>
		<table class="default mt-5" border="1">

			<tr>

				<th>Host</th>

				<th>User DB</th>

				<th>Password</th>

				<th>DB</th>

			</tr>
			<c:forEach var="token"  items="${tokens}" >
				<tr>

					<td><c:out value="${token.host}" /></td>

					<td><c:out value="${token.userdb}" /></td>

					<td><c:out value="${token.pass}" /></td>

					<td><c:out value="${token.db}" /></td>
				</tr>

			</c:forEach>



		</table>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>
</body>
</html>