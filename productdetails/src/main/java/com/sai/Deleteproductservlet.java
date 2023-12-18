package com.sai;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Deleteproductservlet")
public class Deleteproductservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Deleteproductservlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Integer productid=Integer.parseInt(request.getParameter("productid"));
		
		Productdao dao = new Productdao();
		
		int deleteresult=dao.deleteproduct(productid);
		
		if(deleteresult==1) {
			RequestDispatcher dispatcher=request.getRequestDispatcher("allproducts.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
		
		
	}

	

}
