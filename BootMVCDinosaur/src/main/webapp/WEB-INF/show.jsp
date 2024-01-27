<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel='stylesheet' href='styles.css'>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

</head>
<body>
	<div>
		<c:choose>
			<c:when test="${ ! empty dinosaur }">
				<ul>
					<h5>${dinosaur.id }</h5>
					<h5>${dinosaur.name}</h5>
					<h5>(${dinosaur.description})</h5>
					<h5>(${dinosaur.diet})</h5>
				</ul>
			</c:when>
			<c:otherwise>
				<h2>No matching Dino found</h2>
			</c:otherwise>
		</c:choose>
		<a class="btn" href="/">Home</a>
	</div>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>
</body>
</html>