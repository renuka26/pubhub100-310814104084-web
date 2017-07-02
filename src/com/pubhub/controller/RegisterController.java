package com.pubhub.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pubhub.dao.UserDAO;
import com.pubhub.model.User;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		String name = request.getParameter("name");
		String Email_id = request.getParameter("email_id");
		String password = request.getParameter("password");
		
		HttpSession session=request.getSession();
		session.setAttribute("registered user", name);
		
		

		User user = new User();
	user.setActive(1);
		user.setPassword(password);
		user.setName(name);
		user.setEmail_id(Email_id);;
		UserDAO dao = new UserDAO();
	 	try {
			dao.register(user);PrintWriter out=response.getWriter();
			out.println("WELCOME,  "+session.getAttribute("registered user") );
			response.sendRedirect("login.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
  
	}


