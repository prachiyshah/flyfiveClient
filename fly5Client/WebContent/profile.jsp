<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div>
	<form method="post" action="profile.do" class="profile">
		<label class="control-label" for="fn">First Name:</label> <input
			class="form-control" name="fn"> <label class="control-label"
			for="ln">Last Name:</label> <input class="form-control" name="ln">
			<label class="control-label"
			for="dob">Date of Birth (mm/dd/yy):</label> <input class="form-control" name="dob">
		<label class="control-label" for="pspt">Passport:</label> <input
			class="form-control" name="pspt"> <label
			class="control-label" for="ntly">Nationality:</label> <input
			class="form-control" name="ntly">
		<button type="submit" class="btn btn-primary">Update</button>
	</form>
</div>