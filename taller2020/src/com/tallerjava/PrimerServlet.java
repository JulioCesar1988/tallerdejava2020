package com.tallerjava;
import java.io.IOException;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimerServlet
 */
@WebServlet("/PrimerServlet")
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PrimerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// sendRedirect()
		// dispatcher.forward(request, response);
		// vamos tener los datos del login de forma temporal .
		HashMap<String, String> user_data = new HashMap<String, String>();
		user_data.put("email", "jcontreras@millerbi.net");
		user_data.put("pwd", "1234");
		// validamos con lo que tenemos de login
		if (user_data.get("email").equals(request.getParameter("email"))
				&& user_data.get("pwd").equals(request.getParameter("pwd"))) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Menu");
			if (dispatcher != null) {
				dispatcher.forward(request, response);
			}

		} else {
			response.sendRedirect("http://localhost:8080/taller2020/error.html");

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
