package com.testingApp.ProblemWithoutSessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("<h1>Hello, " + name + " Welcome again to my website. </h1>");
	}
}
