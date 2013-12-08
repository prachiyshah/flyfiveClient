<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="../css/bootstrap.css">
<link rel="stylesheet" href="../css/main.css">
<link rel="stylesheet" href="../css/admin.css">
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
<script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
<script type="text/javascript" src="../js/employee.js"></script>
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
				<li class="active"><a href="employee.jsp">Employee</a></li>
				<li><a href="customer.jsp">Customer</a></li>
				<li><a href="reservation.jsp">Reservation</a></li>
			</ul>
			<!-- Add view employees code -->
			<%-- <div class="has-error">
 				 <label class="control-label">${error}</label>
			</div> --%>

			<!-- view employee -->
			<div class="view-employee">
				<button class="btn btn-default btn-large" data-toggle="modal"
					data-target="#newemployee">
					<span class="glyphicon glyphicon-plus"></span> New Employee
				</button>
				<table class="table table-striped table-hover">
					<tr>
						<th>Employee #</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Email</th>
						<th>Address</th>
						<th>Work Description</th>
						<th>Position</th>
						<th>Hire Date</th>
						<th></th>
						<th></th>
					</tr>
					<tr>
						<td id="eno0">187319850</td>
						<td id="efn0">Joel</td>
						<td id="eln0">Joseph</td>
						<td id="eml0">joel.c@fly5.com</td>
						<td id="eadd0"><address>8th Street,San Jose, California - 95112</address></td>
						<td id="ewd0">Handles the technical issues of the airline</td>
						<td id="ep0">Technical Engineer</td>
						<td id="ehd0">02/10/2008</td>
						<td><a href="#" onclick="editEmployee('0', '187319850');"><span
								class="glyphicon glyphicon-pencil"></span></a></td>
						<td><a href="#" onclick="deleteEmployee('187319850');"><span
								class="glyphicon glyphicon-remove"></span></a></td>
					</tr>
				</table>
			</div>

			<!-- add employee modal -->
			<div id="newemployee" class="modal fade" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">

						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel">New Employee</h4>
						</div>
						<div class="modal-body">
							<form id="newemployeeform" action="employee.do" method="post">
								<input
									type="text" class="form-control" name="firstName"
									placeholder="First Name" required autofocus> <input
									type="text" class="form-control" name="lastName"
									placeholder="Last Name" required autofocus><input
									type="text" class="form-control" name="email"
									placeholder="Email" required autofocus><input
									type="text" class="form-control" name="street"
									placeholder="Street Address" required autofocus><input
									type="text" class="form-control" name="city" placeholder="City"
									required autofocus><input type="text"
									class="form-control" name="state" placeholder="State" required
									autofocus><input type="text" class="form-control" name="zip"
									required autofocus placeholder="Zip"> <input type="text" class="form-control"
									name="workDescription" placeholder="Work Description" required
									autofocus><select class="form-control"
									name="position" required autofocus>
									<option value="Captain">Captain</option>
									<option value="Co-Pilot">Co-Pilot</option>
									<option value="Flight Attendant">Flight Attendant</option>
									<option value="Aircraft Engineer">Aircraft Engineer</option>
									<option value="Ground Staff">Ground Staff</option></select><input
									type="date" class="form-control" id="hireDate" name="hireDate"
									placeholder="Hire Date" required autofocus>

								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
									<button type="submit" class="btn btn-primary">Save</button>
								</div>
								
								<script>
								$(function() {
									$("#hireDate").datepicker();
								});
								</script>
							</form>
						</div>
					</div>
					<!-- /.modal-content -->
				</div>
				<!-- /.modal-dialog -->
			</div>

			<!-- edit employee modal -->
			<div id="editemployee" class="modal fade" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">

						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel">Edit Employee</h4>
						</div>
						<div class="modal-body">
							<form id="editemployeeform" action="employee.do" method="post">
								<input type="text" class="form-control" name="eemployeeNo"
									required autofocus disabled> <input type="text"
									class="form-control" name="efirstName" placeholder="First Name"
									required autofocus> <input type="text"
									class="form-control" name="elastName" placeholder="Last Name"
									required autofocus><input type="text"
									class="form-control" name="eemail" placeholder="Email" required
									autofocus><input type="text" class="form-control"
									name="estreet" placeholder="Street Address" required autofocus><input
									type="text" class="form-control" name="ecity"
									placeholder="City" required autofocus><input
									type="text" class="form-control" name="estate"
									placeholder="State" required autofocus><input
									type="text" class="form-control" name="ezip"
									placeholder="Zip" required autofocus><input
									type="text" class="form-control" name="eworkDescription"
									placeholder="Work Description" required autofocus><input
									type="text" class="form-control" name="eposition"
									placeholder="Position" required autofocus><input
									type="text" class="form-control" name="ehireDate"
									placeholder="Hire Date" required autofocus>

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

			<!-- delete employee modal -->
			<div id="deleteemployee" class="modal fade" tabindex="-1"
				role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">

						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">&times;</button>
							<h4 class="modal-title" id="myModalLabel">Delete Employee</h4>
						</div>
						<div class="modal-body">
							<form id="deleteemployeeform" action="employee.do" method="post">
								<input type="hidden" name="demployeeno">
								<div class="alert alert-warning">
									<h4>
										<span class="glyphicon glyphicon-exclamation-sign"></span> Do
										you really want to delete this employee?
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