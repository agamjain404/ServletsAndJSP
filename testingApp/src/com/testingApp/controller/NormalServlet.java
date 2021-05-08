package com.testingApp.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class NormalServlet implements Servlet {
	ServletConfig conf;
	
	public void init(ServletConfig conf) {
		this.conf = conf;
	}
	
	public void service(ServletRequest req, ServletResponse res) throws  ServletException, IOException{
		System.out.println("Service");
//		Set content type of respnonse
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>Agam jain is here</h1>");
	}
	
	public void destroy() {
		System.out.println("Destroyed");
	}
	
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	
	public String getServletInfo() {
		return "This is created by Agam Jain";
	}
	
}
