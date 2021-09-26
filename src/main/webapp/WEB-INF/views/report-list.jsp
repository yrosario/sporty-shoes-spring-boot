<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Sales Reports</title>
</head>
<body>
	
	<div id="wrapper">
	
		<nav class="navbar navbar-light bg-light">
		
			<a class="navbar-brand" href="#">Sales Reports</a>
		
 			<a class="nav-link" href="/sporty-shoes/admin">Admin</a>

 			  
 			  
		
 			 <form class="form-inline" th:action="@{/report}" method="get">
 			 	<label>From</label>
    			<input id="searchBox" class="form-control mr-sm-2" type="date" name="fromDate" value=${fromDate} >
   				
   				<label>To</label>
				<input id="searchBox"  class="form-control mr-sm-2"  type="date" name="toDate" value=${toDate}>
   				 
				<label>Category</label>
				<input id="searchBox"  class="form-control mr-sm-2"  type="text" name="category" value=${category}>
				
   				 <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Filer</button>
 			 </form>
 			 

 			 
 			 
		</nav>
		
		<div id="content">
		
		
			<table class="table table-striped">
			
				<thead>
					<tr>
						<th>Product name</th>
						<th>gender</th>
						<th>category</th>
						<th>brand</th>
						<th>size</th>
						<th>price</th>
						<th>qty</th>
						<th>Purchased Date</th>
					</tr>
				</thead>
				
				<tbody>
				<!-- loop over and print our products -->
					<c:forEach var="tempProduct" items="${report}">
					
						<!-- construct an "update" link with product id -->
						<c:url var="updateLink" value="/product/showFormForUpdate">
							<c:param name="productId" value="${tempProduct[0].id}" />
						</c:url>
						
						
						
						<tr>
							<td> ${tempProduct[0].name} </td>
							<td> ${tempProduct[0].gender} </td>
							<td> ${tempProduct[0].category} </td>
							<td> ${tempProduct[0].brand} </td>
							<td> ${tempProduct[0].size} </td>
							<td> ${tempProduct[0].price} </td>
							<td> ${tempProduct[0].qty} </td>
							<td> ${tempProduct[1]} </td>
							
						</tr>
						
					</c:forEach>
				</tbody>
			</table>
		
		</div>
	
	</div>
</body>
</html>
