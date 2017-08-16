<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ExampleServlet</title>
</head>
<body>
<form action="ExampleServlet" method="get"> <!-- form action is the servlet class, form method is the http request (get, post) -->
	first name? <input type="text" name="firstname" /> <!-- create text box with reference name -->
	<br />
	<br />
	last name? <input type="text" name="lastname" /> <!-- create text box with reference name -->
	<br />
	<br />
	<input type="submit" value="submit"/> <!-- create submit button -->
</form>
</body>
</html>
