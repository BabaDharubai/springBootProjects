<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align:right">
	<a href="admin">Admin</a>
	</div>
	
	<div>
	<form action="search">
	Enter Speciality<input type="text" name="speciality">
	<input type="submit" value="search">
	</form>
	</div>
	<h2>Available Doctors</h2>
	${doctors}
	<h2 style="{color:red}">${message}</h2>
</body>
</html>