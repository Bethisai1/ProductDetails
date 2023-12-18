<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>product details</title>
    		<link rel="stylesheet" href="productdetails.css">
			<link rel="icon" href="./p.jpg" type="image/x-icon">
			<style>
				.hover-button {
				 
				  background-color:aqua;
				  
				 
				  transition: background-color 0.3s ease;
				  }
				.hover-button:hover {
				  background-color:skyblue;
				}				
			</style>

</head>
<body bgcolor="pink" >

<c:if test="${result==1}">
<h1>Product details Registered successfully</h1>
	<br><br>
	<button class="hover-button" onclick="window.location.href='saveproduct.html'">BACK</button><br><br>
		<button class="hover-button" onclick="window.location.href='Producthome.html'">HOME</button>
				<button class="hover-button" onclick="window.location.href='allproducts.jsp'">ALL DATA</button>
		
	

</c:if>

	<c:if test="${result==0}">
  		<h1>Product details not registered try again...</h1>
  <jsp:include page="saveproduct.html"/>
	</c:if>

</body>
</html>