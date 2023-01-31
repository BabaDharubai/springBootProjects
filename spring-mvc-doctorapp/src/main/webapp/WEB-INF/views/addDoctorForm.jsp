<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add-doctor">
<h3>Enter the Doctor Details</h3>
<table>
	<tr>
		<td>Dotor Name</td>
		<td><input type="text" name="doctorName"></td>
	</tr>
	<tr>
		<td>Doctor ID</td>
		<td><input type="number" name="doctorId"><br></td>
	</tr>
	<tr>
		<td>Experience</td>
		<td><input type="number" name="experience"><br></td>
	</tr>
	<tr>
		<td>fees</td>
		<td><input type="number" name="fees"><br></td>
	</tr>
	<tr>
		<td>Speciality</td>
		<td><input type="radio" name="speciality" value="Orthopeadician">Orthopeadician<br> <input type="radio" name="speciality" value="Pediatrician">Pediatrician<br>
			<input type="radio" name="speciality" value="Diabetician">Diabetician <br><input type="radio" name="speciality" value="Cardiologist">Cardiologist
		</td>
	</tr>
	<tr>
		<td>Start Time</td>
		<td><input type="datetime-local" name="startTime"></td>
	</tr>
	<tr>
		<td>End Time</td>
		<td><input type="datetime-local" name="endTime"></td>
	</tr>
	<tr>
	<td colspan="2"><input type="submit" value="AddDoctor"></td>
	</tr>
	</table>
	</form>
</body>
</html>