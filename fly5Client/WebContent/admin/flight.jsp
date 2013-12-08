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
<script type="text/javascript" src="../js/flight.js"></script>
<title>Fly5 Airlines</title>
</head>
<body>
	<div class="container">
		<header class="header">
			<h1>Fly5 Airlines</h1>
		</header>
		<section class="admin-section">
			<ul class="nav nav-pills" id="myTab">
				<li class="active"><a href="flight.jsp">Flight</a></li>
				<li><a href="employee.jsp">Employee</a></li>
				<li><a href="customer.jsp">Customer</a></li>
				<li><a href="reservation.jsp">Reservation</a></li>
			</ul>

			<!-- Add view flights code -->
			<div class="has-error">
  				<label class="control-label">${error}</label>
			</div>

			<!-- view flight -->
			<div class="view-flight">
				<button class="btn btn-default btn-large" data-toggle="modal"
					data-target="#newflight">
					<span class="glyphicon glyphicon-plus"></span> New Flight
				</button>
				<table class="table table-striped table-hover">
					<tr>
						<th>Flight #</th>
						<th>Source</th>
						<th>Destination</th>
						<th>Departure Time</th>
						<th>Arrival Time</th>
						<th>No. of Seats</th>
						<th>Distance (miles)</th>
						<th>Frequency</th>
						<th>Fare ($)</th>
						<th></th>
						<th></th>
					</tr>
					<tr>
						<td id="fno0">F5024</td>
						<td id="src0">LAX</td>
						<td id="dst0">SFO</td>
						<td id="dpt0">12:15 pm</td>
						<td id="jt0">2:00</td>
						<td id="st0">120</td>
						<td id="dt0">554</td>
						<td id="fq0">Daily</td>
						<td id="fr0">200</td>
						<td><a href="#" onclick="editFlight('0', 'F5024');"><span
								class="glyphicon glyphicon-pencil"></span></a></td>
						<td><a href="#" onclick="deleteFlight('F5024');"><span
								class="glyphicon glyphicon-remove"></span></a></td>
					</tr>
					<tr>
						<td id="fno1">F5086</td>
						<td id="src1">LAX</td>
						<td id="dst1">SFO</td>
						<td id="dpt1">12:15 pm</td>
						<td id="jt1">2:00 pm</td>
						<td id="st1">120</td>
						<td id="dt1">554</td>
						<td id="fq1">Daily</td>
						<td id="fr1">200</td>
						<td><a href="#" onclick="editFlight('1', 'F5086');"><span
								class="glyphicon glyphicon-pencil"></span></a></td>
						<td><a href="#" onclick="deleteFlight('F5086');"><span
								class="glyphicon glyphicon-remove"></span></a></td>
					</tr>
				</table>
			</div>

			<!-- add flight modal -->
			<div id="newflight" class="modal fade" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">

						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel">New Flight</h4>
						</div>
						<div class="modal-body">
							<form id="newflightform" action="flight.do" method="post">
								<input type="hidden" name="action" value="add">
								<input type="text" class="form-control" name="airline"
									value="Fly5" required autofocus disabled> <input
									type="text" class="form-control" name="source"
									placeholder="Source" required autofocus> <input
									type="text" class="form-control" name="destination"
									placeholder="Destination" required autofocus><input
									type="text" class="form-control" name="departure"
									placeholder="Departure Time (hh:mm)" required autofocus><input
									type="text" class="form-control" name="journey"
									placeholder="Journey Time (hh:mm)" required autofocus><input
									type="text" class="form-control" name="seats"
									placeholder="Number of Seats" required autofocus><input
									type="text" class="form-control" name="distance"
									placeholder="Distance (miles)" required autofocus><input
									type="text" class="form-control" name="frequency"
									placeholder="Frequency" required autofocus><input
									type="text" class="form-control" name="fare"
									placeholder="Base Fare" required autofocus>

								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
									<button type="submit" class="btn btn-primary">Save</button>
								</div>
							</form>
						</div>
					</div>
					<!-- /.modal-content -->
				</div>
				<!-- /.modal-dialog -->
			</div>

			<!-- edit flight modal -->
			<div id="editflight" class="modal fade" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">

						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel">Edit Flight</h4>
						</div>
						<div class="modal-body">
							<form id="editflightform" action="flight.do" method="post">
								<input type="hidden" name="action" value="update">
								<input type="text" class="form-control" name="eflightno"
									placeholder="Source" required autofocus disabled> <input
									type="text" class="form-control" name="esource"
									placeholder="Source" required autofocus><input
									type="text" class="form-control" name="edestination"
									placeholder="Destination" required autofocus><input
									type="text" class="form-control" name="edeparture"
									placeholder="Departure Time (hh:mm)" required autofocus><input
									type="text" class="form-control" name="ejourney"
									placeholder="Journey Time (hh:mm)" required autofocus><input
									type="text" class="form-control" name="eseats"
									placeholder="Number of Seats" required autofocus><input
									type="text" class="form-control" name="edistance"
									placeholder="Distance (miles)" required autofocus><input
									type="text" class="form-control" name="efrequency"
									placeholder="Frequency" required autofocus><input
									type="text" class="form-control" name="efare"
									placeholder="Base Fare" required autofocus>

								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
									<button type="submit" class="btn btn-primary">Update</button>
								</div>
							</form>
						</div>
					</div>
					<!-- /.modal-content -->
				</div>
				<!-- /.modal-dialog -->
			</div>

			<!-- delete flight modal -->
			<div id="deleteflight" class="modal fade" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">

						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel">Delete Flight</h4>
						</div>
						<div class="modal-body">
							<form id="deleteflightform" action="flight.do" method="post">
							<input type="hidden" name="action" value="delete">
								<input type="hidden" name="dflightno">
								<div class="alert alert-warning">
									<h4>
										<span class="glyphicon glyphicon-exclamation-sign"></span> Do
										you really want to delete this flight?
									</h4>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">No</button>
									<button type="submit" class="btn btn-primary">Yes</button>
								</div>
							</form>
						</div>
					</div>
					<!-- /.modal-content -->
				</div>
				<!-- /.modal-dialog -->
			</div>
		</section>
		<script type="text/javascript" src="../js/bootstrap.js"></script>
	</div>
</body>
</html>