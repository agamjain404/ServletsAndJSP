package com.testingApp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CreateServletUsingGenericServlet extends GenericServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7110694846692647038L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		System.out.println("Aagam is here");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>Agam Jain is a very good boy</h1>");
	}
}
