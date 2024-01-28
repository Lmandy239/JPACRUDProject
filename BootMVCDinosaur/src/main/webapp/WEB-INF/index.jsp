<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert Id here</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        
    <link rel="stylesheet" href="styles.css">
</head>

<body>
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-4 leftbar">
                <div class="column">
                    <form action="getDinosaur.do" method="POST">
                       <h3>Show Dinosaur By ID:</h3><input type="text" name="id" />
                        <input type="submit" value="Search" />
                    </form>
                    <br>
                </div>
                <div class="column">
                    <form action="deleteDino.do" method="POST">
                        <h3>Delete Dinosaur By ID:</h3> <input type="text" name="id" />
                        <input type="submit" value="Delete" />
                    </form>
                    <br>
                </div>
                <div class="column">
                    <form action="deleteDino.do" method="POST">
                         <input class="boton" type="button" value="Show all Dinosaurs" name="id"/>
                    </form>
                <img class ="dino" src="/images/pic3.png" alt = "dino paw">
             
                </div>
            </div>
            <div class="col-md-4">
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
                    <img class ="dino" src="/images/dino1.png" alt = "dino paw">
                </form>
            </div>
            <div class="col-md-4 rightbar">
                <form action="updateDino.do" method="POST">
                    <h3>Update Dinosaur By ID</h3>
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
                    <img class ="dino" src="/images/dino2.png" alt = "dino paw">
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>

</html>

