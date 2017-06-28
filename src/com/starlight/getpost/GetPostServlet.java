package com.starlight.getpost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getpost")
public class GetPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String greet = request.getParameter("greet");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>GETでRequestパラメータを受取る</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>GETで挨拶</h3>");
		out.println(greet);
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String greet = request.getParameter("greet");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>POSTでRequestパラメータを受取る</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>POSTで挨拶</h3>");
		out.println(greet);
		out.println("</body>");
		out.println("</html>");
	}
}