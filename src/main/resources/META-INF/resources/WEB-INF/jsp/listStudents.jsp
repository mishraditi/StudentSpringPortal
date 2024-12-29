<!--        <html>	<body>	<div> <h1>Welcome to list of students</h1>
			<div> students_list : ${students}</div>  </div> </body>  -->
</html>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<title>Students List Page</title>
	</head>
	<body>
	<div class="container">
			<h1>List of students</h1>
			<table class="table">
				<thead>
					<tr>
						<th>id</th>
						<th>Name</th>
						<th>Age</th>
						<th>Grade</th>
                        <th>Address</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${students}" var="student">
						<tr>
							<td>${student.id}</td>
							<td>${student.name}</td>
							<td>${student.age}</td>
							<td>${student.grade}</td>
                            <td>${student.address}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			</div>
                <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
                <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>