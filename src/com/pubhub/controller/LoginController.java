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
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		out.println("hello user");
		String EmailId = request.getParameter("email_id");
		String password = request.getParameter("password");

		HttpSession session = request.getSession();
		session.setAttribute("loggedin user", EmailId);

		User user = new User();
		user.setEmail_id(EmailId);
		user.setPassword(password);

		UserDAO dao = new UserDAO();
		try {
			boolean flag = dao.login(user);
			if (flag) {
				//PrintWriter out = response.getWriter();
				out.println("WELCOME,  " + session.getAttribute("loggedin user"));
				response.sendRedirect("success.jsp");
			} else {
				response.sendRedirect("failure.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
