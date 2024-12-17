package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet("/hello")  //맵핑주소는 중복이 되면 안됨
//@WebServlet(name="helloServlet", urlPatterns = {"/hello1","/hello2"})
@WebServlet(name="helloServlet", value = {"/hello3","/hello4"})
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public HelloServlet() {
		System.out.println("=======> HelloServlet 객체 생성");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		System.out.println("======> doget() 메서드호출");
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("<!QDOCTYPE html><html>");
		out.println("<head><meta charset=UTP-8 />");
		out.println("<title>JSP예제</title>");
		out.println("<link rel='icon' href='data:,'></head>");
		
		out.println("<body><h1>hello Servlet~~~~!!</h1>");
		out.println("<table border='1'><tr><td>이름</td><td>나이</td><td>취미</td></tr>");
		out.println("<tr><td>김서건</td><td>94</td><td>개발</td></tr></table>");
		out.println("</body></html>");
		
		out.close();
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
