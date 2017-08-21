<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
<script>
	$(function() {
		$("#datepicker").datepicker();
	});
</script>


</head>
<body>
	<form:form method="post" action="employeeRegistration">
		<center>
			<h1>
				<font color="green">New User Registration</font>
			</h1>
			<table>
				<tr>
					<td><font color="blue"><spring:message
								code="label.firstname" /></font></td>
					<td><input type="text" name="firstname" /></td>
				</tr>
				<tr>
					<td><font color="blue"><spring:message
								code="label.lastname" /></font></td>
					<td><input type="text" name="lastname" /></td>
				</tr>
				<tr>
					<td><font color="blue"><spring:message
								code="label.telephone" /></font></td>
					<td><input type="text" name="telephone" /></td>
				</tr>
				<tr>
					<td><font color="blue"><spring:message
								code="label.email" /></font></td>
					<td><input type="text" name="email" /></td>
				</tr>

				<tr>
					<td><font color="blue"><spring:message
								code="label.date_of_birth" /></font></td>
					<td><input type="text" name="date_of_birth" id="datepicker" /></td>
				</tr>


				<tr>
					<td><font color="blue"><spring:message
								code="label.street" /></font></td>
					<td><input type="text" name="street" /></td>
				</tr>

				<tr>
					<td><font color="blue"><spring:message
								code="label.city" /></font></td>
					<td><input type="text" name="city" /></td>
				</tr>

				<tr>
					<td><font color="blue"><spring:message
								code="label.zipcode" /></font></td>
					<td><input type="text" name="zipcode" /></td>
				</tr>

				<tr>
					<td><font color="blue"><spring:message
								code="label.state" /></font></td>
					<td><input type="text" name="state" /></td>
				</tr>

				<tr>
					<td><font color="blue"><spring:message
								code="label.country" /></font></td>
					<td><input type="text" name="country" /></td>
				</tr>

				<tr>
					<td colspan="2"><font size="12px"><input type="submit"
							style="background-color: #C0C0C0"
							value="<spring:message code="label.registeruser"/>"></font></td>
					<td colspan="2"><font size="12px"><input type="reset"
							style="background-color: #C0C0C0"
							value="<spring:message code="label.reset" />"></font></td>
				</tr>

			</table>
		</center>
	</form:form>

</body>
</html>