<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% int index = (int) session.getAttribute("id"); %>
	<div id = "wrapper">
		<div id = "top">
			<h2><c:out value = "${team.getTeam_name()}"/></h2>
		</div>
		<div id = "topright">
			<h3><a href = "/TeamRoster/Players?id=<%= index%>">Add New Player</a></h3>
		</div>
		<div id = "main">
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
					<th>Action</th>
				</tr>

			<% int i = 0; %>
				<c:forEach var = "player" items = "${team.getPlayers()}">
				<tr>
					<td><c:out value = "${player.getFirst_name()}"/></td>
					<td><c:out value = "${player.getLast_name()}"/></td>
					<td><c:out value = "${player.getAge()}"/></td>
					<td>
					<a href = "/TeamRoster/DeletePlayer?teamid=<%= index %>&playerid=<%= i %>">Delete</a></td>
					<% i++; %>
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>