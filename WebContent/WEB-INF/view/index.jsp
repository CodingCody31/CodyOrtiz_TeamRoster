<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.ArrayList"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Team Roster</title>
<!-- <style>
		table {
			border: 1px solid black;
			border-collapse: collapse;
			margin: 10px;
			margin-left: 30px; 
			margin-bottom: 30px;
		}
		th {
			text-align: left;
			border: 1px solid black;
			border-collapse: collapse;
			padding: 5px;
			padding-left: 10px;
			padding-right: 150px;
			background-color: lightgrey;
			font-size: 18px;
		}
		tr td {
			border: 1px solid black;
			border-collapse: collapse;
			padding: 10px;
			background-color: rgb(237, 241, 248);
			font-size: 18px;
		}
		h4 {
			font-size: 24px;
		}
		#top {
			display: inline-block;
			padding-left: 30px;
		}
		#topright {
			display: inline-block;
			padding-left: 300px;
		}
	</style> -->
</head>
<body>

<div id = "top">
		<h4>Prototype Roster</h4>
	</div>
	<div id = "topright">
		<h4><a href = "/TeamRoster/Teams">Add New Team</a></h4>
	</div>
	<div id = "roster">
		<table>
			<tr>
				<th>Team</th>
				<th>Players</th>
				<th>Action</th>
			</tr>

			<% int index = 0; %>
			<c:forEach var = "team" items = "${Roster.getTeams()}">
			<tr>
				<td><c:out value = "${Roster.getTeams().get(index).getTeam()}"/></td>
				<td><c:out value = "${fn:length(Team.players)}"/></td>
				<td><a href = "/TeamRoster/Teams?id=<%= index %>">Details</a>
				<a href = "/TeamRoster/DeleteTeam?id=<%= index %>">Delete</a>
				</td>
			</tr>
			<% index++; %>
			</c:forEach>
		</table>
	</div>

</body>
</html>