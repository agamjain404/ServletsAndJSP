package com.testingApp.Attributes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String s1 = req.getParameter("n1");
		String s2 = req.getParameter("n2");
		
		int nn1 = Integer.parseInt(s1);
		int nn2 = Integer.parseInt(s2);
		
		int sum = nn1 + nn2;
		
		req.setAttribute("sum", sum);
		RequestDispatcher rd = req.getRequestDispatcher("/S2");
		rd.forward(req, res);
	}
}
