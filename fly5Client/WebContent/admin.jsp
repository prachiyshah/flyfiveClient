<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/admin.css">
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="js/flight.js"></script>
<script type="text/javascript" src="js/employee.js"></script>
<title>Fly5 Airlines</title>
</head>
<body>
	<div class="container">
		<header class="header">
			<h1>Fly5 Airlines</h1>
		</header>
		<section class="admin-section">
			<ul class="nav nav-pills" id="myTab">
				<li class="active"><a href="#flight" data-toggle="tab">Flight</a></li>
				<li><a href="#employee" data-toggle="tab">Employee</a></li>
				<li><a href="#customer" data-toggle="tab">Customer</a></li>
				<li><a href="#reservation" data-toggle="tab">Reservation</a></li>
			</ul>

			<div class="tab-content">
				<div class="tab-pane fade in active" id="flight">
					<%@include file="flight.jsp"%>
				</div>
				<div class="tab-pane fade" id="employee">
				<%@include file="employee.jsp" %>
				</div>
				<div class="tab-pane fade" id="customer">
				  <%@include file="customer.jsp" %>
				</div>
				<div class="tab-pane fade" id="reservation">
					<%@include file="reservation.jsp" %>
				</div>
			</div>
		</section>
	</div>
	<script type="text/javascript" src="js/bootstrap.js"></script>
</body>
</html>