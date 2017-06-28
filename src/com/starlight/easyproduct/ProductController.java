package com.starlight.easyproduct;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/product")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("鉛筆", "¥200"));
		products.add(new Product("消しゴム", "¥80"));
		request.setAttribute("products", products);
		getServletContext().getRequestDispatcher("/WEB-INF/jsp/productList.jsp").forward(request, response);
	}
}
