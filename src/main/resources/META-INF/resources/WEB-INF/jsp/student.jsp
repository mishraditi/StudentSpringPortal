    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <html>
        <head>
            <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
            <title>Add Student Page</title>
        </head>
        <body>
            <div class="container">
                <h1>Enter student Details</h1>

    <form:form  method="post" modelAttribute = "student">
        Name: <form:input type="text" path="name" required = "required"/><br>
        Age: <form:input type="number" path="age"/><br>
        Grade: <form:input type="text" path="grade"/><br>
       Address: <form:input type="text" path="address"/><br>
        Teacher Name: <form:input type="text" path="teacherName"/><br>
                        <button type="submit" class="btn btn-success">Submit</button>

    </form:form>
            </div>
            <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
            <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
        </body>
    </html>