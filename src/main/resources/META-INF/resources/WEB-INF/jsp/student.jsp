  <%@ include file="common/header.jspf" %>
  <%@ include file="common/navigation.jspf" %>
        <div class="container">
            <h1>Enter student Details</h1>

    <form:form  method="post" modelAttribute = "student">

<fieldset class="mb-3">
	<form:label path="name">NAME</form:label>
	<form:input type="text" path="name" required="required"/>
	<form:errors path="name" cssClass="text-warning"/>
</fieldset>
<fieldset class="mb-3">
    <form:label path="age">AGE</form:label>
    <form:input type="number" path="age"/>
    	<form:errors path="age" cssClass="text-warning"/>
    </fieldset>
    <fieldset class="mb-3">
        <form:label path="grade">GRADE</form:label>
        <form:input type="text" path="grade"/>
        </fieldset>
        <fieldset class="mb-3">
            <form:label path="enrollmentDate">EnrollmentDate</form:label>
            <form:input type="text" path="enrollmentDate"/>
            </fieldset>
                <fieldset class="mb-3">
                        <form:label path="teacherName">TeacherName</form:label>
                        <form:input type="text" path="teacherName"/>
                        </fieldset>
                        <button type="submit" class="btn btn-success">Submit</button>

    </form:form>
            </div>
            <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
            <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
            <script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
            <%@ include file="common/footer.jspf" %>
            <script type="text/javascript">
                $('#enrollmentDate').datepicker({
                    format: 'yyyy-mm-dd'
                });
            </script>
        </body>
    </html>