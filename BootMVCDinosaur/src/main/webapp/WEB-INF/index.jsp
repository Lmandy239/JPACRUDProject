<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert Id here</title>

    <link rel="stylesheet" href="styles.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>

<body>
    <div class="container three-col">
        <div class="row">
            <div class="col-6 leftbar">
                <form action="getDinosaur.do" method="POST">
                    Show Dino: <input type="text" name="id" />
                     <input type="submit" value="Show Dinosaur By Id" />
                </form>
                <br>
                <form action="deleteDino.do" method="POST">
                    Delete Dino: <input type="text" name="id" /> 
                    <input type="submit" value="Delete Dinosaur By Id" />
                </form>
                <br>
            </div>
            <div>
                <form action="createDino.do" method="POST">
                    <h3>Add Dinosaur</h3>
                    <label for="id">ID:</label>
                    <input type="text" name="id" value="">
                    <br>
                    <label for="name">Name:</label>
                    <input type="text" name="name" value="">
                    <br>
                    <label for="description">Description:</label>
                    <input type="text" name="description" value="">
                    <br>
                    <label for="diet">Diet type:</label>
                    <input type="text" name="diet" value="">
                    <br>
                    <br>
                    <input type="submit" value="Add Dinosaur">
                </form>
            </div>
            <div class="col rightbar">
                <form action="updateDino.do" method="POST">
                    <h3>Update Dinosaur By Id</h3>
                    <label for="id">ID:</label>
                    <input type="text" name="id" value="">
                    <br>
                    <label for="name">New Name:</label>
                    <input type="text" name="name" value="">
                    <br>
                    <label for="description">New Description:</label>
                    <input type="text" name="description" value="">
                    <br>
                    <label for="diet">New Diet type:</label>
                    <input type="text" name="diet" value="">
                    <br>
                    <br>
                    <input type="submit" value="Update Dinosaur">
                </form>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>

</html>

