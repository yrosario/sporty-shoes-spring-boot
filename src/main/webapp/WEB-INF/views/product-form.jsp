<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Product Form</title>
</head>
<body>
	
	<div class="container">
	

		<nav class="navbar navbar-light bg-light">
		
			<a class="navbar-brand" href="#">Save Product</a>
		
 			<a class="nav-link" href="list">Product Management</a>
 			<a class="nav-link" href="/sporty-shoes/admin">Admin</a>
 		
		
 			 
 			 
		</nav>
	
	
		
		
		<div id="container">
			
			<form:form action="saveProduct" modelAttribute="product" method="POST">
			
			
				<!-- need to associate this data with product id -->
				<form:hidden path="id"/>
				
				
				<table>
					<tbody>
						<tr>
							<td><label>Product Name:</label></td>
							<td><form:input path="name" /></td>
						</tr>
						<tr>
							<td><label>Gender:</label></td>
							<td><form:input path="gender" /></td>
						</tr>
						<tr>
							<td><label>style:</label></td>
							<td><form:input path="category" /></td>
						</tr>
						<tr>
							<td><label>brand:</label></td>
							<td><form:input path="brand" /></td>
						</tr>
						<tr>	
							<td><label>size:</label></td>
							<td><form:input path="size" /></td>
						</tr>
						<tr>	
							<td><label>price:</label></td>
							<td><form:input path="price" /></td>
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
				<a href="${pageContext.request.contextPath}/product/list">Back to List</a>
			</p>
		</div>
	</div>
</div>
	
	
	

</body>
</html>