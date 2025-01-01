<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<title>Add Student Page</title>
	</head>
	<body>
		<div class="container">
			<h1>Enter student Details</h1>


<form  method="post">
    Name: <input type="text" name="name">
    Age: <input type="number" name="age"></label><br>
    Grade: <input type="text" name="grade"></label><br>
   Address: <input type="text" name="address"></label><br>
    Teacher Name: <input type="text" name="teacherName"></label><br>
    				<input type="submit" class="btn btn-success"/>
</form>

		</div>
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>