<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css"/>
</head>
<body>

<h1 class="bg-primary">Title</h1>
<form:form method="post" modelAttribute="result" action="/save">
    <form:hidden path="id"></form:hidden>
    <div class="mb-3 row">
        <label class="col-2 col-form-label">Name</label>
        <div class="col-6">
            <form:input path="fullName" class="form-control"></form:input>
        </div>
    </div>


    <div class="mb-3 row">
        <label class="col-2 col-form-label"></label>
        <div class="col-6">
            <button class="btn btn-primary" type="submit">Submit</button>
        </div>
    </div>
</form:form>
</body>
</html>
