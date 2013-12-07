<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="../css/bootstrap.css">
<link rel="stylesheet" href="../css/main.css">
<link rel="stylesheet" href="../css/user.css">
<title>Fly5 Airlines</title>
</head>
<body>
	<div class="container">
		<header class="header">
			<h1>Fly5 Airlines</h1>
		</header>
		<section class="user-section">
			<ul class="nav nav-pills" id="myTab">
				<li class="active"><a href="profile.jsp">Profile</a></li>
				<li><a href="reservation.jsp">Reservation</a></li>
			</ul>
			<div>
				<form method="post" action="profile.do" class="profile">
					<label class="control-label" for="fn">First Name:</label> <input
						class="form-control" name="fn"> <label
						class="control-label" for="ln">Last Name:</label> <input
						class="form-control" name="ln"> <label
						class="control-label" for="dob">Date of Birth (mm/dd/yy):</label>
					<input class="form-control" name="dob"> <label
						class="control-label" for="pspt">Passport:</label> <input
						class="form-control" name="pspt"> <label
						class="control-label" for="ntly">Nationality:</label> <input
						class="form-control" name="ntly">
					<button type="submit" class="btn btn-primary">Update</button>
				</form>
			</div>
		</section>
	</div>
</body>
</html>