
package com.sai;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/updateproductservlet")
@MultipartConfig


public class updateproductservlet extends HttpServlet {
    @SuppressWarnings("resource")
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
        // Get product details from the request
        Integer productid = Integer.parseInt(request.getParameter("productid"))    ;
        String productName = request.getParameter("productName");
        Double productPrice = Double.parseDouble(request.getParameter("productPrice"));
        String productmadein = request.getParameter("productmadein");
        String productCompany = request.getParameter("productCompany");
        Date productmanufacturedate = Date.valueOf(request.getParameter("productmanufacturedate"));
       Date productexpiredate = Date.valueOf(request.getParameter("productexpiredate"));
        
        
        // get image data from request       
        Part productimag=request.getPart("productimage");
        InputStream productimage =productimag.getInputStream();

    
        //sending data to dao layer
        Productdao da = new Productdao();
		
		
		//adding data into productinfo object
		productinfo productupdate=new productinfo();
			
		
		productupdate.setProductid(productid);
		productupdate.setProductName(productName);
		productupdate.setProductPrice(productPrice);
		productupdate.setProductmadein(productmadein);
		productupdate.setProductCompany(productCompany);
		productupdate.setProductmanufacturedate(productmanufacturedate);
		productupdate.setProductexpiredate(productexpiredate);
		productupdate.setProductimage(productimage);
				
		//sending data into updateproduct method
	int updateresult=da.updateproduct(productupdate);
		
		//forwarding the response to jsp
		
		if(updateresult==1)
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/allproducts.jsp");
			dispatcher.forward(request, response);
		
		}
		
    }
}
