<%@page import="com.sai.Productdao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>All products</title>
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
<body bgcolor="lightblue" >

<table border="2">
    <thead>
        <th>PRODUCT ID</th>
        <th>PRODUCT NAME</th>
        <th>PRODUCT PRICE</th>
        <th>PRODUCT MADE IN</th>
        <th>PRODUCT COMPANY</th>
        <th>PRODUCT MANUFACTURE DATE</th>
        <th>PRODUCT EXPIRY DATE</th>
        <th>PRODUCT IMAGE</th>
        
    </thead>
    <tbody>
        
                <td>${userinfo.productid}</td>
                <td>${userinfo.productName}</td>
                <td>${userinfo.productPrice}</td>
                <td>${userinfo.productmadein}</td>
                <td>${userinfo.productCompany}</td>
                <td>${userinfo.productmanufacturedate}</td>
                <td>${userinfo.productexpiredate}</td>
				<td>
   			<img src="data:image/jpeg;base64,${userinfo.base64ProductImage}" alt="Product Image" style="max-width: 100px; max-height: 100px;">
				</td>	   					 				
	      </tr>
	            
	    </tbody>
	</table>
	<br>
		<button class="hover-button" onclick="window.location.href='Producthome.html'">HOME</button>
		<button class="hover-button" onclick="window.location.href='saveproduct.html'">ADD PRODUCT</button>

</body>
</html>
