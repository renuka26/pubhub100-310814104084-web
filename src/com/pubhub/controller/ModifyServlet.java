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
import com.pubhub.model.Book;

/**
 * Servlet implementation class ModifyServlet
 */
@WebServlet("/ModifyServlet")
public class ModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name= request.getParameter("name");
		int newprice=Integer.parseInt(request.getParameter("newprice")) ;

		Book book = new Book();
		book.setName(name);
		book.setNewprice(newprice);
		// book.setPrice(price);book.setOldname(oldprice);

		UserDAO dao = new UserDAO();
		try {
			dao.editPrice(book);
			PrintWriter out=response.getWriter();out.println("BOOK PRICE EDITED SUCCESSFULLY....."
					+ "YOU ARE REDIRECTED TO THE HOME PAGE");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();PrintWriter out=response.getWriter();
			out.println("PLZ TRY AGAIN...YOU ARE REDIRECTED TO THE PREVIOUS PAGE");RequestDispatcher rd=request.getRequestDispatcher("modifyprice.jsp");
			rd.include(request, response);
		}

	}

}
