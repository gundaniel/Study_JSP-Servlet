package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc") 
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	/**       
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int num = Integer.parseInt(request.getParameter("num"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String value = request.getParameter("operator");
		
		int result = calc(num,num2,value);
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html></html><head><meta charset='UTF-8' />");
		out.println("<title>calc</title>");
		out.println("<link rel='icon' href='data:,'></head>");
		out.println("<body>");
		out.print("<h2>계산결과</h2>");
		out.print("<hr />");
		out.print(num + value + num2 +"=" + result + "<br />");
		out.print("<a href='#' onclick='history.back();'>입력화면으로 가기</a>");
		out.println("</body></html>");
		out.close();
	} 

		public int calc(int num, int num2, String value) {
			int result = 0;
		if(value.equals("+")) {
			result = num + num2;
		}
		else if(value.equals("-")) {
			result = num - num2;
		}
		else if(value.equals("*")) { 
			result = num * num2;
		}
		else if(value.equals("/")) { 
			result = num / num2;
		}
		return result;
		}
	
	
		public int getResult(int result) {
			return result;
		}
}
