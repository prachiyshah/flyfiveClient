<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
				<div class="top-nav-active">
					Results
				</div>
				<div>
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
			<!-- view reservation -->
			<div class="view-results">

				<div class="row">
					<div class="col-md-2 results-top">Depart</div>
					<div class="col-md-2 results-top">Duration</div>
					<div class="col-md-2 results-top">Arrival</div>
					<div class="col-md-2 results-top">Available Seats</div>
					<div class="col-md-2 results-top">Price ($)</div>
					<div class="col-md-2 results-top">Details</div>
				</div>
				<div class="row results-item">
					<div class="col-md-2">17:50</div>
					<div class="col-md-2">23h 20m</div>
					<div class="col-md-2">17:10</div>
					<div class="col-md-2">13</div>
					<div class="col-md-2">500</div>
					<div class="col-md-2">
						<a class="btn glyphicon glyphicon-arrow-down" href="#"
							onclick="expand('#rslt0');"></a>
					</div>
				</div>
				<hr>
				<div id="rslt0" class="collapse-group">
					<div class="collapse expander">
						<p>Hi Joel here</p>
						<p>Hi Joel here</p>
						<p>Hi Joel here</p>
					</div>
				</div>
					<div class="row results-item">
					<div class="col-md-2">17:50</div>
					<div class="col-md-2">23h 20m</div>
					<div class="col-md-2">17:10</div>
					<div class="col-md-2">13</div>
					<div class="col-md-2">500</div>
					<div class="col-md-2">
						<a class="btn glyphicon glyphicon-arrow-down" href="#"
							onclick="expand('#rslt1');"></a>
					</div>
				</div>
				<hr>
				<div id="rslt1" class="collapse-group">
					<div class="collapse expander">
						<p>Hi Joel here</p>
						<p>Hi Joel here</p>
						<p>Hi Joel here</p>
					</div>
				</div>
			</div>
		</section>
	</div>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script>
		function expand(resultId) {
			//	var $this = $(this);
			var $collapse = $(resultId).find('.collapse');
			if ($collapse.length != 0)
				$collapse.collapse('toggle');
			else {
				$collapse = $(resultId).find('.in');
				$collapse.collapse('toggle');
			}
			//var $collapse = $this.find(bookingId).find('.collapse');

		}
	</script>
</body>
</html>