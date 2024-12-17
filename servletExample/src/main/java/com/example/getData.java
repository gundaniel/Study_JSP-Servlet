package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getData
 */
@WebServlet("/getData")
public class getData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		response.setContentType("text/html;charset=utf-8");
	

PrintWriter out = response.getWriter();
	
	String userName = request.getParameter("Name");
	String number = request.getParameter("address");
	
	out.println("<!DOCTYPE html></html><head><meta charset='UTF-8' />");
	out.println("<link rel='icon' href='data:,'></head>");
	out.println("<title>POST data</title>");

	out.println("<body>");

	//out.print("<h2>입력한 이름: " + request.getMethod() + "</h2>");
	//out.print("<h2>입력한 주소: " + request.getRequestURI() + "</h2>");
	out.print("<h1 style='text-align: center'>POST방식 테스트입니다.</h1>");
	out.print("<ul><li>입력한 이름: "+ userName+"</li>");
	out.print("<li>입력한 주소: "+number+"</li></ul>");
	/* out.print("<a href='"+request.getHeader("referer")+"'>입력화면으로 가기</a>"); */
	
	out.print("<a href='#' onclick='history.back();'>이전페이지</a>");
	out.println("</body></html>");
	out.close();
	
	}
	
}
