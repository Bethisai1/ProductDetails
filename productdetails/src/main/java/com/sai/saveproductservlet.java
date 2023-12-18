
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

@WebServlet("/saveproductservlet")
@MultipartConfig


public class saveproductservlet extends HttpServlet {
    @SuppressWarnings("resource")
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
        // Get product details from the request
        Integer productid = Integer.parseInt(request.getParameter("productid"));
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
        Productdao dao = new Productdao();
		
		
		//adding data into productinfo object
		productinfo productinfo=new productinfo();
			
		
		productinfo.setProductid(productid);
		productinfo.setProductName(productName);
		productinfo.setProductPrice(productPrice);
		productinfo.setProductmadein(productmadein);
		productinfo.setProductCompany(productCompany);
		productinfo.setProductmanufacturedate(productmanufacturedate);
		productinfo.setProductexpiredate(productexpiredate);
		productinfo.setProductimage(productimage);
				
		//sending data into saveproductmethod
	int saveresult=	dao.saveproduct(productinfo);
			
	//set the result value into request object
		request.setAttribute("result",saveresult);
		
		//forwarding the response to jsp
		
		if(saveresult==1)
		{
		RequestDispatcher dispatcher=request.getRequestDispatcher("saveproduct.jsp");
		dispatcher.forward(request, response);
		
		}
		
    }
}
