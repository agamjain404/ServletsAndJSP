package com.testingApp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoForm extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>Welcome to Demo Servlet</h1>");
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		
		String cond = req.getParameter("condition");
			
		if(cond != null) {
			if(cond.equals("checked")) {
				out.println("<h2>Name = " + name + "</h1>");
				out.println("<h2>Password = " + password + "</h1>");
				out.println("<h2>Email = " + email + "</h1>");
				out.println("<h2>Name = " + name + "</h1>");
				out.println("<h2>Gender = " + gender + "</h1>");
				out.println("<h2>Course = " + course + "</h1>");
			}else {
				out.println("<h1>You haven't accepted terms and conditions.</h1>");
			}
		}else {
			out.println("<h1>You haven't accepted terms and conditions.</h1>");
		}
	}
}
