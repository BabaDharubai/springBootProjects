<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="update-fees">
		<table>
			<tr>
				<td>Id</td>
				<td><input type="number" name="id" value="${doctor.doctorId}"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="Name" value="${doctor.doctorName}"></td>
			</tr>
			<tr>
				<td>Speciality</td>
				<td><input type="text" name="speciality" value="${doctor.speciality}"></td>
			</tr>
			<tr>
				<td>Experience</td>
				<td><input type="number" name="experience" value="${doctor.experience}"></td>
			</tr>
			<tr>
				<td>Fees</td>
				<td><input type="number" name="fees" value="${doctor.fees}"></td>
			</tr>
			<tr>
				<td>StartTime</td>
				<td><input type="datetime-local" name=""
					value="${doctor.startTime}"></td>
			</tr>
			<tr>
				<td>EndTime</td>
				<td><input type="datetime-local" name=""
					value="${doctor.endTime}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="update"></td>
			</tr>
			<tr>
				<td><label>Speciality:</label></td>
				<td><input type="radio" name="speciality"
					value="${doctor.speciality}" checked="checked"> <label>Cardiologist</label><br>
					<input type="radio" name="speciality" value="Orthopedician">
					<label>Orthopedician</label><br> <input type="radio"
					name="speciality" value="Pediatritian"> <label>Pediatritian</label><br>
					<input type="radio" name="speciality" value="Diabetician">
					<label>Diabetician</label><br> <input type="radio"
					name="speciality" value="General Physician"> <label>General
						Physician</label></td>
			</tr>
		</table>
	</form>
</body>
</html>