<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false"%>
<title>List Customer</title>
	<link href='<spring:url value="/resources/css/style.css"/>' rel="stylesheet" />
	<script type="text/javascript" src='<spring:url value="/resources/js/app.js"/>'></script>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				<c:forEach var="tempCustomer" items="${customers}">
					<tr>
						<td>${tempCustomer.fistName}</td>
						<td>${tempCustomer.lastName}</td>
						<td>${tempCustomer.emailId}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>