<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>

<%@ page import="edu.sjsu.fly5.manager.JourneyManager" %>
<%@ page import="edu.sjsu.fly5.pojos.*" %>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%JourneyManager journeyManager=new JourneyManager();%>
<%String userName = (String)session.getAttribute("email"); %>
<%Journey[] listById=journeyManager.listAllJourney(userName); %>
<html lang="en">
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="../css/bootstrap.css">
<link rel="stylesheet" href="../css/main.css">
<link rel="stylesheet" href="../css/user.css">
<script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
<title>Fly5 Airlines</title>
</head>
<body>
	<div class="container">
		<header class="header">
			<h1>Fly5 Airlines</h1>
		</header>
		<section class="user-section">
			<ul class="nav nav-pills" id="myTab">
				<li><a href="profile.jsp">Profile</a></li>
				<li class="active"><a href="reservation.jsp">Reservation</a></li>
			</ul>

			<%-- <div class="has-error">
			  <label class="control-label">${error}</label>
			</div> --%>
			<!-- view reservation -->
			<!-- Add view reservations code -->
			<div class="view-reservation">
				<table class="table table-striped table-hover">
					<tr>
						<th>Booking Reference #</th>
						<th>Source</th>
						<th>Destination</th>
						<th>Booking Date</th>
						<th>Travel Date</th>
						<th>No Of Passengers</th>
						<th>Total Amount ($)</th>
					</tr>
				</table>
				<% if (listById != null) { for(int i=0;i<listById.length;i++) {%>
				
				<div class="row reservation-item">
					<div class="col-md-2">
						<a class="btn glyphicon glyphicon-arrow-down" href="#"
							onclick="expand('#<%=listById[i].getBookingReferenceNo() %>');"> </a> <%=listById[i].getBookingReferenceNo() %>
					</div>
					<%String arrivaldt=listById[i].getArrivalDate().substring(0,10); %>
					<%String depDt=listById[i].getDepartureDate().substring(0,10); %>
					<div class="col-md-2"><%=listById[i].getSource() %></div>
					<div class="col-md-1" style="text-align: left;"><%=listById[i].getDestination() %></div>
					<div class="col-md-1"><%=depDt%></div>
					<div class="col-md-2"><%=arrivaldt %></div>
					<div class="col-md-2"><%=listById[i].getNoOfTraveller() %></div>
					<div class="col-md-2"><%=listById[i].getTotalPrice() %></div>
				</div>
				<%Traveller[] listOfTravellers=listById[i].getListOfTraveller(); %>
				<hr>
				
				<%for ( int j=0;j<listOfTravellers.length;j++){ %>
				<%Calendar dob=listOfTravellers[j].getDateOfBirth(); %>
					<%String dateOfBirth=null;
					SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
					if(dob!=null)
					{
						dateOfBirth = sdf.format(dob.getTime());
					}
					%>
				<div id="<%=listById[i].getBookingReferenceNo() %>" class="collapse-group">
					<div class="collapse expander">
						<p></p>
						<p><%=listOfTravellers[j].getFirstName() %></p>
						<p><%=listOfTravellers[j].getLastName() %></p>
						<p><%=dateOfBirth%></p>
						<p><%=listOfTravellers[j].getPassportNumber() %></p>
						<p><%=listOfTravellers[j].getNationality() %></p>
					</div>
				</div> 
				<%} %>
				<%}} %>
				
			</div>

		</section>
	</div>
	<script type="text/javascript" src="../js/bootstrap.js"></script>
	<script>
	function expand(bookingId) {
		//	var $this = $(this);
		var $collapse = $(bookingId).find('.collapse');
		if ($collapse.length != 0)
			$collapse.collapse('toggle');
		else {
			$collapse = $(bookingId).find('.in');
			$collapse.collapse('toggle');
		}
		//var $collapse = $this.find(bookingId).find('.collapse');

	}
</script>
</body>
</html>