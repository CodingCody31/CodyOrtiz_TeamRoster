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
	<h2>Create a new team!</h2>
	<br/>
		<form name = "guess" method = "post" action = "/TeamRoster/Teams">
			Team name: <input type = "text" name = "team"/>
			<br/>
			<br/>
			<input type = "submit" value = "Create!"/>
		</form>

</body>
</html>