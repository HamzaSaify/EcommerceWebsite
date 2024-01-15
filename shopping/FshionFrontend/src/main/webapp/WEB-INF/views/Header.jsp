<%@page language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<title>${pageinfo}-Fashion</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Department</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">

		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">

					<a class="navbar-brand" href="#">Fashion World</a>

				</div>
				
				
				
				<c:if test="${!sessionScope.loggedIn}">
				
				
				
				<ul class="nav navbar-nav">
					

					<li><a href="<c:url value='/login'/>">Login</a></li>

					<li><a href="<c:url value='/register'/>">Register</a></li>

					<li><a href="<c:url value='/aboutus'/>">About Us</a></li>
					<li><a href="<c:url  value='/contactus'/>">Contact Us</a></li>
					</ul>
					</c:if>
					
					<c:if test="${sessionScope.loggedIn}">
					<c:if test="{sessionScope.role=='ROLE_ADMIN'}">
					
					<li><a href="<c:url value='/adminhome'/>">Home</a></li>
					<li><a href="<c:url value='/product'/>">Manage Product</a></li>
					<li><a href="<c:url value='/category'/>">Manage Category</a></li>
					<li><a href="<c:url value='/productDisplay'/>">Product Catalog</a></li>
				<li><a href="<c:url value='/cart'/>">Cart</a></li>
				</c:if>
				
					<c:if test="{sessionScope.role=='ROLE_USER'}">
					<ul class="nav navbar-nav">
					
					<li><a href="<c:url value='/userhome'/>">HOME</a></li>
					<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown">CATEGORY<span class="caret"></span></a>
					<ul clas="dropdown-menu">
					<li><a href="<c:url value='/menu'/>">Mens's</a></li>
					<li><a href="<c:url value='/productDisplay'/>">Women's</a></li>
					<li><a href="<c:url value='/productDisplay'/>">kid's</a></li>
				</ul>
				</li>
				
				<li><a href="<c:url value='/aboutus'/>">About Us</a></li>
					<li><a href="<c:url  value='/contactus'/>">Contact Us</a></li>
					<li><a href="<c:url value='/cart'/>">Cart</a></li>
				</c:if>
				</c:if>
				
				
				<c:if test="${sessionScope.loggedIn}">
				<div class="nav navbar-nav navbar-right">
				<font color="white" face="calibri" size="2">Welcome:${SessionScope.username}
				</font>
				<a href="<c:url value='/perform_logout'/>" class="btn btn-danger">LOGOUT</a>
				</div>
				</c:if>
								
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				</ul>
				</div>
				</nav>
				</div>
				</body>
				</html>