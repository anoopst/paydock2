<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Birthdays</title>
</head>
<body>
	<table>
	<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Date</th>
	</tr>
		<c:forEach var="listValue" items="${lists}">
			<tr><td>${listValue.id}</td><td>${listValue.name}</td><td><fmt:formatDate value="${listValue.date.time}" type="date" dateStyle="short" /></td></tr>
		</c:forEach>
	</table>
</body>
</html>