package com.starlight.productsession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/productsession")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");
		String price = request.getParameter("price");
		Product product = new Product(name, price);

		HttpSession session = request.getSession(true);
		@SuppressWarnings("unchecked")
		List<Product> products = (List<Product>) session.getAttribute("products");
		if (products == null) {
			products = new ArrayList<Product>();
			session.setAttribute("products", products);
		}

		products.add(product);

		request.setAttribute("products", products);
		getServletContext().getRequestDispatcher("/WEB-INF/jsp/productSessionList.jsp").forward(request, response);
	}
}
