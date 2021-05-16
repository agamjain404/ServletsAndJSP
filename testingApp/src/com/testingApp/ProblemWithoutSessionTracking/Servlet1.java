package com.testingApp.ProblemWithoutSessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
//	The problem without session tracking is that server only knows the parameters sen to him with request
//	If we go to other page with anchor tag then there will be no elements present with the request
//	With the help of session tracking we can track data present in request
//	Example is shown below
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("<h1>Hello, " + name + " Welcome to my website. </h1>");
		out.println("<a href=\"servlet2\">Go to servlet 2</a>");
	}
}
