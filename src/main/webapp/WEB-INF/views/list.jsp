<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<div style="text-align: right;">
	<p>
		<img style="width: 270px; height: 71px; float: left;"
			src="https://careers.societegenerale.com/Careers/LIBRARY/LOGOS/Fichiers%20sources/LOGO_Groupe_EN.jpg"
			alt="" />
	</p>
</div>
<div style="text-align: right;">
	<input style="color: white; background-color: #dc143c;" type="submit"
		value="Log out" />
</div>
<div>
	<p style="text-align: center;">
		<span style="color: #ffffff; font-family: BlinkMacSystemFont;"><span
			style="white-space: pre;">&nbsp;</span></span>
	</p>
	<div>&nbsp;</div>
	<div>
		<hr />
		<head>
<style>
body {
	margin: 0;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	width: 20%;
	background-color: #f1f1f1;
	position: fixed;
	height: 30%;
	overflow: auto;
}

li a {
	display: block;
	color: #000;
	padding: 8px 0 8px 16px;
	text-decoration: none;
}

li a.active {
	background-color: #dc143c;;
	color: white;
}

li a:hover:not (.active ) {
	background-color: #555;
	color: white;
}
</style>
		</head>
		<body>

			<ul>
				<li><a class="active" href="#home">Home</a></li>
				<li><a href="#ftransfer">Funds Transfer</a></li>
				<li><a href="<spring:url value="add"/>">Add Beneficiary</a></li>
				<li><a href="<spring:url value="list"/>">List Beneficiary</a></li>
			</ul>
			<center>	
		<div>
<div>
<h1 style="color: grey; font-family: Lucida Sans Unicode;">&nbsp;Beneficiary List</h1>
</div>
<div>
<h4 style="color: #dc143c;">&nbsp;List of your local beneficiaries &nbsp;</h4>
</div>
<div>
<table style="height: 21px;" width="644">
<tbody>
<tr style="background-color: #5a5a5a; color: white;">
<td style="text-align: left;">NAME &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;</td>
<td style="text-align: left;">ACCOUNT NUMBER</td>
</tr>
<tr style="background-color: white; color: black;">
<td style="text-align: left;">&nbsp;</td>
<td style="text-align: left;">&nbsp;</td>
</tr>
<c:forEach var="listValue" items="${lists}">
			<tr><td>${listValue.name}</td><td>${listValue.accnum}</td></tr>
		</c:forEach>
</tbody>
</table>
</div>
<p>&nbsp; &nbsp;</p>
</body>
</html>