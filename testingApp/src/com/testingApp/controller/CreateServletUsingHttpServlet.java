package com.testingApp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateServletUsingHttpServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4316723390018838604L;
	
//	Sending get request
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		System.out.println("This is get method......");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>Create servlet using HTTP SERVLET</h1>");
	}
}
