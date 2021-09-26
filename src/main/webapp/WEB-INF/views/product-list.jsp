<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>List Product</title>
</head>
<body>
	
	<div class="container">
	
			<nav class="navbar navbar-light bg-light">
		
			<a class="navbar-brand" href="#">Product Management</a>
			<a class="nav-link" href="showFormForAdd">Add Product</a>
 			<a class="nav-link" href="/sporty-shoes/admin">Admin</a>
 	
 			  
 			  
		
 			 <form class="form-inline" th:action="@{/reports}" method="get">
    			<input id="searchBox" class="form-control mr-sm-2"  name="keyword" value=${keyword} >
   					 <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
 			 </form>
 			 

 			 
 			 
		</nav>
		
		<div id="content">
		
		
		
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Product Name</th>
						<th>Gender</th>
						<th>Category</th>
						<th>Brand</th>
						<th>Size</th>
						<th>Price</th>
						<th>Qty</th>
						<th>Action</th>
					</tr>
				 </thead>
				 
				 <tbody>
					<!-- loop over and print our products -->
					<c:forEach var="tempProduct" items="${products}">
					
						<!-- construct an "update" link with product id -->
						<c:url var="updateLink" value="/product/showFormForUpdate">
							<c:param name="productId" value="${tempProduct.id}" />
						</c:url>
						
						<!-- construct an "Delete" link with customer id -->
						<c:url var="deleteLink" value="/product/delete">
							<c:param name="productId" value="${tempProduct.id}" />
						</c:url>
						
						
						<tr>
							<td> ${tempProduct.name} </td>
							<td> ${tempProduct.gender} </td>
							<td> ${tempProduct.category} </td>
							<td> ${tempProduct.brand} </td>
							<td> ${tempProduct.size} </td>
							<td> ${tempProduct.price} </td>
							<td> ${tempProduct.qty} </td>
							
							<td>
								<!-- display the update link -->
								<a href="${updateLink}">Update</a>
								|
								<!-- display the delete link -->
								<a href="${deleteLink}"
								   onclick="if (!(confirm('Are you sure you want to delete this product?'))) return false">Delete</a>
								
							</td>
						</tr>
						
					</c:forEach>
					</tbody>
				</table>
				
		</div>
	
	</div>
</body>
</html>
