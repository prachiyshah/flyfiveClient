<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Add view reservations code -->
<%-- <div class="has-error">
  <label class="control-label">${error}</label>
</div> --%>

<!-- view reservation -->
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
	<div class="row reservation-item">
		<div class="col-md-2"><a class="btn glyphicon glyphicon-arrow-down" href="#" onclick="expand('#AWF5102135');">
		</a> AWF5102135</div>
		<div class="col-md-2" >SJC</div>
		<div class="col-md-1" style="text-align:left;">LAX</div>
		<div class="col-md-1">11/26/13</div>
		<div class="col-md-2" >12/12/13</div>
		<div class="col-md-2">5</div>
		<div class="col-md-2">600</div>
	</div>
	<hr>
	<div id="AWF5102135" class="collapse-group">
		<div class="collapse expander">
			<p>Hi Joel here</p>
			<p>Hi Joel here</p>
			<p>Hi Joel here</p>
			<p>Hi Joel here</p>
			<p>Hi Joel here</p>
			<p>Hi Joel here</p>
			<p>Hi Joel here</p>
		</div>
	</div>
	<hr>
	<div class="row reservation-item">
		<div class="col-md-2"><a class="btn glyphicon glyphicon-arrow-down" href="#" onclick="expand('#AWF5102455');">
		</a> AWF5102455</div>
		<div class="col-md-2" >SJC</div>
		<div class="col-md-1" style="text-align:left;">LAX</div>
		<div class="col-md-1">11/26/13</div>
		<div class="col-md-2" >12/12/13</div>
		<div class="col-md-2">5</div>
		<div class="col-md-2">600</div>
	</div>
	<hr>
	<div id="AWF5102455" class="collapse-group">
		<div class="collapse expander">
			<p>Hi /**/ here</p>
		</div>
	</div>
</div>

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