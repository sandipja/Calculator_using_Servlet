package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String operator = request.getParameter("operator");
	
		out.println("<div style='text-align: center; border-radius: 5px; border: solid 1px #ccc; max-width: 340px;min-height: 460px;	padding: 10px 0;margin: auto;box-shadow: 1px 2px 5px rgba(0, 0, 0, .31);'>");


		out.println("<h1 style = 'color:green'> CalCulator</h1> <br>");
		out.println("<h2 >Your First Number :-" + num1 + "</h2>");
		out.println("<h2> Your Second Number:-" + num2 + "</h2>");
		out.println("<h2>Operation:-" + operator + "</h2>");
		
		
		if (operator.equals("Addition")) 
		{
		    out.println( " <h2 style='color:red'> Addition is: " + (Integer.parseInt(num1) + Integer.parseInt(num2))+"</h2>");
		}
		else if (operator.equals("Subtraction"))
		{
		    out.println("<h2 style='color:red'>Subtraction is: " + (Integer.parseInt(num1) -Integer.parseInt(num2))+"</h2>");
		}
		else if (operator.equals("Multiplication"))
		{
		    out.println("<h2 style='color:red'>Multiplication is: " + (Integer.parseInt(num1) * Integer.parseInt(num2))+"</h2>");
		}
		else 
		{
		    out.println("<h2 style='color:red'>Divsion is: " + (Integer.parseInt(num1) / Integer.parseInt(num2))+"</h2>");
		}

		out.println("</div>");
	}

}
