<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="newCustomer" method="POST">

		<tr>
			<td>accountNumber</td>
			<td><input type="text" name="accountNumber" /></td>
		</tr>
		<tr>
			<td>Customer Name</td>
			<td><input type="text" name="customerName" /></td>
		</tr>
		<tr>
			<td>Age</td>
			<td><input type="text" name="age" /></td>
		</tr>
		<tr>
			<td>AccountType :</td>
			<td>saving</td>
			<td><input type="radio" name="accountType" value="saving"
				checked="true" /></td>
			<td>current</td>
			<input type="radio" name="accountType" value="current" />
			<tr>
			<td><input type="submit" value="create" /></tr>
		</td>
		</form>
</body>
</html>