<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>mainLayout</title>
</head>
<body>
	<h2>mainLayout</h2>
	<form:form action="newCustomerPage">
		<input type="submit" value="new user" />
	</form:form>
	<br><br>
	<form:form action="creditHome">
		<input type="submit" value="credit" />
	</form:form>
</body>
</html>