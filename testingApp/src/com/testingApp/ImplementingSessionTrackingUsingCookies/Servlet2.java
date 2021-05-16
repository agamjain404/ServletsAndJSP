package com.testingApp.ImplementingSessionTrackingUsingCookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		//		Get all the cookies coming from servlet 1
		Cookie[] cookies = req.getCookies();
		boolean f = false;
		String name = "";
		
		if(cookies == null) {
			out.println("<h1>You are new go to home page and submit your name</h1>");
			return;
		}else {
			for(Cookie c : cookies) {
				String tName = c.getName();
				if(tName.equals("user_name")) {
					f = true;
					name = c.getValue();
				}
			}
		}
		
		if(f) {
			out.println("<h1>Hello, " + name + " Welcome again to my website. </h1>");
		}else {
			out.println("<h1>You are new go to home page and submit your name</h1>");
		}
	}
}
