<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List of Dinosaurs</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
          crossorigin="anonymous">

    <link rel="stylesheet" href="styles.css">
</head>
<body class="body">
    <div class="container-fluid">
        <div class="row justify-content-md-center">
            <div class="col-md-4 leftbar">
                <div class="column">
                    <ul>
                        <c:forEach items="${dinosaurs}" var="dinosaur">
                            <li>
                                <h5>${dinosaur.id}</h5>
                                <h5>${dinosaur.name}</h5>
                                <p>${dinosaur.description}</p>
                                <p>${dinosaur.diet}</p>
                            </li>
                             <hr>
                        </c:forEach>
                    </ul>
                    <br>
                    <a class="btn" href="/">Home</a>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous"></script>
</body>
</html>
