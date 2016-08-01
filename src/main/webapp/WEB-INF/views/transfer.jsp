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
li
 
a
:hover
:not
 
(
.active
 
)
{
background-color
:
 
#555
;

	
color
:
 
white
;


}
</style>
		</head>
		<body>

			<ul>
				<li><a class="active" href="#home">Home</a></li>
				  <li><a href="<spring:url value="transfer"/>">Funds Transfer</a></li>
  				  <li><a href="<spring:url value="add"/>">Add Beneficiary</a></li>
  				<li><a href="<spring:url value="list"/>">List Beneficiary</a></li>
			</ul>
			<center>
				<div>
					<div>
						<h1 style="color: grey; font-family: Lucida Sans Unicode;">Transfer funds to other account</h1>
					</div>
					<div>
						<h4 style="color: #dc143c;">&nbsp;Please select the beneficiary and enter the amount to transfer amount to beneficiary&nbsp;&nbsp;&nbsp;</h4>
					</div>
					<div>
						<table style="height: 21px;" width="644">
							<tbody>
								<tr style="background-color: #5a5a5a; color: white;">
									<td>Transfer Funds</td>
								</tr>
							</tbody>
						</table>
					</div>
					<form:form method="post" action="add">
						<p>
							&nbsp; &nbsp; <span style="color: #808080;">Account Number</span>&nbsp;
							&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
							&nbsp; &nbsp;
							<form:input path="name" />
							<br /> <br />&nbsp; &nbsp; <span style="color: #808080;">Amount:</span>&nbsp;&nbsp;&nbsp;
							<form:input path="accnum" />
							<br /> <br />
						</p>
						<div style="text-align: center;">
							<input style="color: white; background-color: #dc143c;"
								type="submit" value="Submit" /> <input
								style="color: black; background-color: #c8c8c8;" type="submit"
								value="Cancel" />
						</div>
						<p>&nbsp;</p>
						<hr />
						<p>&nbsp;</p>
					</form:form>
				</div>
			</center>
		</body>
		</html>