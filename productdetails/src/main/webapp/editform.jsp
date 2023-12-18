<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    	<title>Product Store</title>
    		<link rel="stylesheet" href="productdetails.css">
    		<link rel="icon" href="./p.jpg" type="image/x-icon">
			<link rel="stylesheet" href="http://stackpath.bootstapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    		<script src="productdetails.js"></script>
    		
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
	
	<div class="container mt-5 text-center">
    	<h1 class="text-center font-italic mb-5 mt-5">Update Product Details for Product Id:${existingproduct.productid}</h1>

    <form method="post"    action="./updateproductservlet" onsubmit="return productdet()" enctype="multipart/form-data">
		<div class="form-group">
        <input type="hidden" class="form-control-sm" id="productid" name="productid" value="${existingproduct.productid }" ></div>
        <br>
        
        <div class="form-group">
        <label class="font-italic font-weight-bold" for="productName">Product Name:</label>
        <input type="text" class="form-control-sm" id="productName" name="productName" value="${existingproduct.productName }"> 
        </div>
        <br> <br>
           
        <div class="form-group">
        <label class="font-italic font-weight-bold" for="productPrice">Product Price:</label>
        <input type="number" class="form-control-sm" step="0.01" id="productPrice" name="productPrice"  value="${existingproduct.productPrice }">
        </div>
        <br> <br>
        
        <div class="form-group">
         <label class="font-italic font-weight-bold" for="productmadein">Product Madein:</label>
        <input type="text" class="form-control-sm" id="productmadein" name="productmadein"  value="${existingproduct.productmadein }"/>
        </div>
        <br>
        
        <div class="form-group">
        <label class="font-italic font-weight-bold" for="productCompany">Product Company:</label>
        <input type="text" class="form-control-sm" id="productCompany" name="productCompany"  value="${existingproduct.productCompany }"></div>
        <br>
        
         <div class="form-group">
        <label class="font-italic font-weight-bold" for="productmanufacturedate">Product Manufacture Date:</label>
        <input type="date" class="form-control-sm" id="productmanufacturedate" name="productmanufacturedate"  value="${existingproduct.productmanufacturedate }"></div>
        <br>
        
        <div class="form-group">
        <label class="font-italic font-weight-bold" for="productexpiredate">Product expire Date:</label>
        <input type="date" class="form-control-sm" id="productexpiredate" name="productexpiredate"  value="${existingproduct.productexpiredate }"></div>
        <br>
        
        <div class="form-group">
        <label class="font-italic font-weight-bold" for="productimage">Product image:</label>
        <input type="file" class="form-control-sm" id="productimage" name="productimage"   value="${existingproduct.productimage }"></div>
        <br>
        
        
        <button class="hover-button" type="submit" class="btn btn-success"> UPDATE Product</button>
    </form>
</div>
</body>
</html>
