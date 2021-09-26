<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Page</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
	
</head>
<body>

   <div class="container">	<!-- Main div -->
		<nav class="navbar navbar-light bg-light">
		
			<a class="navbar-brand" href="#">Admin Page</a>
		</nav>
	
          
          
		<!-- Body div -->
		<div>
			
			<div>
				<table class="table table-striped">

					<tr>
						<th>Management Links</th>
					</tr>

				<tbody>
					<tr>
						<td>
				    		<a href="customer/list" class="list-group-item list-group-item-action">Manage Customers</a>
						</td>			   
				    </tr>
				    <tr>
				    	<td>
				    	<a href="product/list" class="list-group-item list-group-item-action">Manage Products</a>
				   		</td>
				    </tr>
				    <tr>
				    	<td>
				    		<a href="report/list" class="list-group-item list-group-item-action">View Reports</a>
				    	</td>
					</tr>
					</tbody>
				</table>
			</div>
		
		</div>
	</div>
</ v>
</html>