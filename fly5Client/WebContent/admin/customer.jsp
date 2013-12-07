<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="../css/bootstrap.css">
<link rel="stylesheet" href="../css/main.css">
<link rel="stylesheet" href="../css/admin.css">
<script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
<title>Fly5 Airlines</title>
</head>
<body>
	<div class="container">
		<header class="header">
			<h1>Fly5 Airlines</h1>
		</header>
		<section class="admin-section">
			<ul class="nav nav-pills" id="myTab">
				<li><a href="flight.jsp">Flight</a></li>
				<li><a href="employee.jsp">Employee</a></li>
				<li class="active"><a href="customer.jsp">Customer</a></li>
				<li><a href="reservation.jsp">Reservation</a></li>
			</ul>
<!-- Add view customers code -->
<%-- <div class="has-error">
  <label class="control-label">${error}</label>
</div> --%>

<!-- view customer -->
<div class="view-customer">
    <table class="table table-striped table-hover">
         <tr>
           <th>First Name</th>
           <th>Last Name</th>
           <th>Email</th>
           <th>Address</th>
           <th>Passport</th>
           <th>Nationality</th>
         </tr>
         <tr>
           <td>Joel</td>
           <td>Joseph</td>
           <td>joe.jose</td>
           <td>San Jose</td>
           <td>H5588201</td>
           <td>Indian</td>
         </tr>
    </table>
</div>
</section>
</div>
</body>
</html>