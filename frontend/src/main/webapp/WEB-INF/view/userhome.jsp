<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class=""><a href="">Home</a></li>
      <li><a href="contactus">ContactUs</a></li>
      <li><a href="aboutus">AboutUs</a></li>
      <li><a href="product">Product</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <c:if test="${empty SuccessMessage}">
     
    	  <li><a href="register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
    	  
    </c:if> 
    </ul>
        <ul class="nav navbar-nav navbar-right">
 		<c:if test="${not empty SuccessMessage}">
  			 <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
 		</c:if> 
    </ul>
  </div>
</nav>
<%@include file="carousel.jsp"%>  

<%@include file="footer.jsp"%>
</body>
</html>