<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%int noOfPassengers = 3; %>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/user.css">
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<title>Fly5 Airlines</title>
</head>
<body>
	<div class="container">
		<header class="header">
			<h1>Fly5 Airlines</h1>
		</header>
		<section class="user-section">
			<div class="top-nav">
				<div>
					Results
				</div>
				<div class="top-nav-active">
					Passenger Info
				</div>
				<div>
					Payment
				</div>
				<div>Confirmation</div>
			</div>
			<div class="has-error">
				<label class="control-label">${error}</label>
			</div>
			<div class="passenger-info">
			    <form method="post" action="payment.do" class="passenger-form">
			    <%for (int i=1; i<=noOfPassengers;i++) {%>
			        <label class="control-label">Traveler <%=i %>:</label>
			    	<input class="form-control" placeholder="First Name" name="fn<%=i%>">
			    	<input class="form-control" placeholder="Last Name" name="ln<%=i%>">
			    	<input class="form-control" placeholder="Passport" name="pspt<%=i%>">
			    	<input class="form-control" placeholder="Nationality" name="ntly<%=i%>">
			    	<%} %>
			    	<button type="button" class="btn btn-default" >Back</button>
						<button type="submit" class="btn btn-primary">Make Payment</button>
			    </form>
			</div>
		</section>
	</div>
	<script type="text/javascript" src="js/bootstrap.js"></script>
</body>
</html>