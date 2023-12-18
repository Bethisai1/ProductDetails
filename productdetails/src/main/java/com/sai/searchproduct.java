package com.sai;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/searchproduct")
@MultipartConfig
public class searchproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public searchproduct() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productName = request.getParameter("productName");
		
		Productdao dao = new Productdao();
		productinfo productinfo = dao.findbyProductName(productName);
		System.out.println(productinfo.getProductName());
		request.setAttribute("userinfo", productinfo);
		RequestDispatcher dispatcher = request.getRequestDispatcher("search.jsp");
		dispatcher.forward(request, response);
	}

}
