<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Employee</title>
</head>
<body>
    <h2>Add Employee</h2>
    <form action="/employees/save" method="post">
        <label>Name: </label> <input type="text" name="name" required/><br>
        <label>Email: </label> <input type="email" name="email" required/><br>
        <label>Department: </label> <input type="text" name="department" required/><br>
        <button type="submit">Save</button>
    </form>
    <a href="/employees">Back</a>
</body>
</html>
