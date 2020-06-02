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
			
			<!-- put new button: Add Customer  -->
			<input type="button" value="Add Customer"
				   class="add-button"							
				   onclick="window.location.href='showFormForAdd'"
			 />	
			 <br>	
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<c:forEach var="tempCustomer" items="${customers}">
					
					<c:url var="updateLink" value="/customer/showFormForUpdate" >
						<c:param name="customerId" value="${tempCustomer.id}"></c:param>					
					</c:url>
					
					<c:url var="deleteLink" value="/customer/delete" >
						<c:param name="customerId" value="${tempCustomer.id}"></c:param>					
					</c:url>
					
					<tr>
						<td>${tempCustomer.fistName}</td>
						<td>${tempCustomer.lastName}</td>
						<td>${tempCustomer.emailId}</td>
						<td>
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
								onclick="if(!(confirm('Are you sure you want to delete this Customer?'))) return false"
							>Delete</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>