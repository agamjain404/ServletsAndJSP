package com.testingApp.ImplementingSessionTrackingUsingCookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
// Solving the problem of session tracking using cookies
//	Cookie is a space provided to us by browser
//	Storing all values inside cookies object and setting it into response
//	Disadvantage of cookies is we can't able to store string spaces
//	Space is considered as illegal character in cookies
//	If we try to store space then we get a exception
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("<h1>Hello, " + name + " Welcome to my website. </h1>");
		out.println("<a href=\"servlet2usingcookies\">Go to servlet 2</a>");
		
//		Create a Cookie
		Cookie c = new Cookie("user_name", name);
		
//		Add cookie to response object
		res.addCookie(c);
	}
}
