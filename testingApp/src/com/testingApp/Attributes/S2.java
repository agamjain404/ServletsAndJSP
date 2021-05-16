package com.testingApp.Attributes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S2 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int n1 = Integer.parseInt(req.getParameter("n1"));
		int n2 = Integer.parseInt(req.getParameter("n2"));
		
		int pr = n1 * n2;
		
//		Get attribute method will always return object so typecasting is necessary
		
		int sum = (int)req.getAttribute("sum");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>");
		out.println("sum is " + sum);
		out.println("Product is " + pr);
		out.println("</h1>");
	}
}
