package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** 
 * Servlet implementation class Lunch
 */
@WebServlet("/todaymenu")
public class TodayMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 요청 인코딩 설정 (한글 깨짐 방지)
        request.setCharacterEncoding("UTF-8");
        // 응답 설정
        response.setContentType("text/html; charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        // HTML 응답 생성
        out.println("<!DOCTYPE html>");
        out.println("<html lang='ko'>"); 
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>오늘 점심 메뉴</title>");
        out.println("</head>");
        out.println("<body>");
            out.println("<div style='text-align:center'>오늘점심메뉴:<br/><strong>");
           
            String[] values = request.getParameterValues("lunch");
            for(int i = 0; i < values.length;i++) {
            	out.print(values[i]);
            	if(i < values.length -1)out.print(",");   	
            }
            out.print("</strong></div>");
            out.print("</body></html>");
       
        out.close();
    }
}
