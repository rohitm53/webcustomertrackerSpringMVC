<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>
<html>

	<head>
		<title>Save Customer</title>
		<link href='<spring:url value="/resources/css/style.css"/>'	rel="stylesheet" />
		<link href='<spring:url value="/resources/css/add-customer-style.css"/>'	rel="stylesheet" />
		<script type="text/javascript" src='<spring:url value="/resources/js/app.js"/>'></script>
		<link>
	</head>

	<body>
		<div id="wrapper">
			<div id="header">
				<h2>CRM - Customer Relationship Manager</h2>
			</div>	
			<div id="container">
				<h3>Save Customer</h3>
				
				<form:form action="savecustomer" modelAttribute="customer" method="POST">
					<form:hidden path="id"/>
					<table>
						<tbody>
							<tr>
								<td><label>First Name:</label></td>
								<td><form:input path="fistName"/></td>
							</tr>
							<tr>
								<td><label>Last Name:</label></td>
								<td><form:input path="lastName"/></td>
							</tr>
							<tr>
								<td><label>Email Id:</label></td>
								<td><form:input path="emailId"/></td>
							</tr>
							<tr>
								<td><label></label></td>
								<td><input type="submit" value="Save" class="save"/></td>
							</tr>
						</tbody>
					</table>
				</form:form>
				
				<div style="clear; both;"></div>
					<p>
						<a href="customer/list">Back to List</a>
					</p>
			</div>		
		</div>
	</body>
</html>