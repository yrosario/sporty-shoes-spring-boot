<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>List Customer</title>
</head>
<body>
	
	<div class="container">
	
		<nav class="navbar navbar-light bg-light">
		
			<a class="navbar-brand" href="#">Customer Management</a>
 	
 			 <a class="nav-link" href="showFormForAdd">Add Customer</a>
 			 <a class="nav-link" href="/sporty-shoes/admin">Admin</a>
 			
 			  
 			  
		
 			 <form class="form-inline" th:action="@{/customers}" method="get">
    			<input id="searchBox" class="form-control mr-sm-2"  name="keyword" value=${keyword} >
   					 <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
 			 </form>
 			 

 			 
 			 
		</nav>

		
		<div >
		


		
			<table class="table table-striped">
			
				<thead>
					<tr>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>action</th>
					</tr>
				</thead>
				
				<tbody>
					<!-- loop over and print our customers -->
					<c:forEach var="tempCustomer" items="${customers}">
					
						<!-- construct an "update" link with customer id -->
						<c:url var="updateLink" value="/customer/showFormForUpdate">
							<c:param name="customerId" value="${tempCustomer.id}" />
						</c:url>
						
						<!-- construct an "Delete" link with customer id -->
						<c:url var="deleteLink" value="/customer/delete">
							<c:param name="customerId" value="${tempCustomer.id}" />
						</c:url>
						
						
						<tr>
							<td> ${tempCustomer.firstName} </td>
							<td> ${tempCustomer.lastName} </td>
							<td> ${tempCustomer.email} </td>
							
							<td>
								<!-- display the update link -->
								<a href="${updateLink}">Update</a>
								|
								<!-- display the delete link -->
								<a href="${deleteLink}"
								   onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
								
							</td>
						</tr>
						
				</c:forEach>
				
				</tbody>
			</table>
		
		</div>
	
	</div>
</body>
</html>