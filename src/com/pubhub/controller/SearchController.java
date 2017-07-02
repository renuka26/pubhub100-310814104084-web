package com.pubhub.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pubhub.dao.UserDAO;
import com.pubhub.model.Book;

@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SearchController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String bookname = request.getParameter("bookname");

		UserDAO dao = new UserDAO();
		try {
			List<Book> servbooklist=dao.findByName(bookname);
			request.setAttribute("SEARCH_RESULT", servbooklist);
			PrintWriter out = response.getWriter();
			out.println("your results");
					
			RequestDispatcher rd = request.getRequestDispatcher("findresult.jsp");
			rd.include(request, response);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			PrintWriter out = response.getWriter();
			out.println("Oops!plz try again");
					
			RequestDispatcher rd = request.getRequestDispatcher("findallbook.jsp");
			rd.include(request, response);
			e.printStackTrace();
		}
	}

}
