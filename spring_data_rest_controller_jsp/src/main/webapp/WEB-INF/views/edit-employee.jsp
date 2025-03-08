<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Employee</title>
</head>
<body>
    <h2>Edit Employee</h2>
    <form action="/employees/update/${employee.id}" method="post">
        <label>Name: </label> <input type="text" name="name" value="${employee.name}" required/><br>
        <label>Email: </label> <input type="email" name="email" value="${employee.email}" required/><br>
        <label>Department: </label> <input type="text" name="department" value="${employee.department}" required/><br>
        <button type="submit">Update</button>
    </form>
    <a href="/employees">Back</a>
</body>
</html>
