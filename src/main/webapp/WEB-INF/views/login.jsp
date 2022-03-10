<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>REGISTER FORM</h1>

<form action="registercontroller" method="post">
<input type="text" name="Name" id="Name" placeholder="Enter Name" required >
<input type="text" name="Username" id="Username" placeholder="Enter Username" required >
<input type="password" name="Password" id="Password" placeholder="Enter Password" required >
<input type="submit">
</form>

</body>
</html>