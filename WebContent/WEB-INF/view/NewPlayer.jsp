<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Player Page</title>
</head>
<body>
	<% int index = Integer.parseInt(request.getParameter("id")); %>
		<h2>Add a new player to: <c:out value = "${team.getTeam_name()}"/> </h2>
		<br/>
		<form name = "guess" method = "post" action = "/TeamRoster/Players?id=<%= index %>">
			First Name: <input type = "text" name = "first_name"/>
			<br/><br/>
			Last Name: <input type = "text" name = "last_name"/>
			<br/><br/>
			Age: <input type = "text" name = "age"/>
			<br/><br/>
			<input type = "submit" value = "Add!"/>
		</form>
</body>
</html>