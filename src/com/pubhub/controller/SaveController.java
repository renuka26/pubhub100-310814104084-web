package com.pubhub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pubhub.dao.UserDAO;

/**
 * Servlet implementation class SaveController
 */
@WebServlet("/SaveController")
public class SaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String bookname = request.getParameter("bookname");
		int price=Integer.parseInt(request.getParameter("price"));

		UserDAO dao = new UserDAO();
		try {
			dao.saveBook(bookname,price);
			PrintWriter out = response.getWriter();
			out.println(
					"THE BOOK ADDED SUCCESSFULLY FROM " + "YOUR DATABASE....you will be redirected to the home page");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			PrintWriter out = response.getWriter();
			out.println(
					"OOPS!PLEASE TRY AGAIN" + "......you will be redirected to the home page");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
			e.printStackTrace();}
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
