<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Customer Form</title>
</head>
<body>
	
	<div class="container">
		<nav class="navbar navbar-light bg-light">
		
			<a class="navbar-brand" href="#">Save Customer</a>
	
 			 	
 			 <a class="nav-link" href="list">Customer Management</a>
 			<a class="nav-link" href="/sporty-shoes/admin">Admin</a>
 		
		
 			 
 			 
		</nav>
		
		<div id="container">
			
			<form:form action="saveCustomer" modelAttribute="customer" method="POST">
			
			
				<!-- need to associate this data with customer id -->
				<form:hidden path="id"/>
				
				
				<table>
					<tbody>
						<tr>
							<td><label>First Name:</label></td>
							<td><form:input path="firstName" /></td>
						</tr>
						<tr>
							<td><label>Last Name:</label></td>
							<td><form:input path="lastName" /></td>
						</tr>
						<tr>
							<td><label>Address:</label></td>
							<td><form:input path="address" /></td>
						</tr>
						<tr>
							<td><label>Birthday:</label></td>
							<td><form:input type="date" path="birthday" /></td>
						</tr>
						<tr>	
							<td><label>Email:</label></td>
							<td><form:input path="email" /></td>
						</tr>
						<tr>	
							<td><label></label></td>
							<td><input type="submit" value="save" class="save" /></td>
						</tr>
					
					</tbody>
				
				</table>
				
			</form:form>
			
			<div style="clear; both;">
			
			<p>
				<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
			</p>
		</div>
	</div>
</div>
	
	
	

</body>
</html>