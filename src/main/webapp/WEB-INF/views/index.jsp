<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Docker poc</title>
</head>
<body>

	<div>
		<p>
			<img style="width: 270px; height: 71px;"
				src="https://careers.societegenerale.com/Careers/LIBRARY/LOGOS/Fichiers%20sources/LOGO_Groupe_EN.jpg"
				alt="" />
		</p>
	</div>
	<div>
		<p>&nbsp;</p>
	</div>
	<div>
		<hr />
	</div>
	<div>
		<p>&nbsp;</p>
	</div>
	<div>
		<div>
			<h1 style="color: grey; font-family: Lucida Sans Unicode;">Internet
				Banking Login</h1>
		</div>
	</div>
	<div>
		<h4 style="color: #dc143c;">&nbsp; &nbsp; Please enter your USER
			ID and PASSWORD to login</h4>
	</div>
	<div>
		<p style="color: #dc143c;">
			<strong>&nbsp; &nbsp; Note:</strong> USER ID and PASSWORD are
			case-sensitive
		</p>
		<p style="color: red;">&nbsp;</p>
	</div>
	<form:form id="login" modelAttribute="login" method="post"
		action="login">
		<p>
			&nbsp; &nbsp; <span style="color: #808080;">USER ID:</span>
			&nbsp;&nbsp; &nbsp; &nbsp;&nbsp; <form:input path="name" />
			<br /> <br />&nbsp; &nbsp; <span style="color: #808080;">PASSWORD:</span>&nbsp;&nbsp;&nbsp;
			<form:password path="password" /> <br /> <br /> <br />&nbsp;
			&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
			&nbsp; &nbsp; <input style="color: white; background-color: #dc143c;"
				type="submit" value="Sign in" />
		</p>
		<p>&nbsp;</p>
		<hr />
		<p>
			<img style="height: 40px;"
				src="https://forums.digitalpoint.com/proxy/V%2FlNRoM4xHkS5Fc%2Bkv6s1jqwPYZxk9fI4pROMDL1jsADoVtF1wdWdw0e3d3iKZWJhgJGz3Id/image.png"
				alt="" />SG will never ask you for your Internet Banking
			credentials under any other circumstance.
		</p>
	</form:form>
</body>
</html>