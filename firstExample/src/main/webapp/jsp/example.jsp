<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
    		<title>예제파일 - example.jsp</title>
	</head>
	<body>
    <%  
			out.print("<h3>숫자를 저장한 변수 3개(7,5,9)를 정의하고 최대값 구하기</h3>");
    	int num1 = 7, num2 = 5, num3 = 9;
    	int num4 = num1;
    	
    	if(num2 > num1 && num2 > num3){
    		num4 = num2;
    	}
    	else if(num3 > num1 && num3 > num2){
    		num4 = num3;
    	}

    %>
    	<p>가장 큰 숫자는 <%=num4 %> 입니다.</p>
   	<%
		out.print("<h3>배열의 값(12, 26, 68, 98, 76, 54, 8, 6, 4) 중 최대값과 최소값 구하기</h3>");
	    	
	    	int[] su = {12,26,68,98,76,54,8,6,4};
	    	
	    	int max = su[0];
	        int min = su[0];
	        for (int i= 1; i <su.length; i++){ 
	            if (su[i] < min) min = su[i];
	            if (su[i] > max) max = su[i];
	        }
    %>
   		<p>가장 큰숫자는 <%= max %> , 가장작은 숫자는 <%= min %></p>
   		
   	<%
	   	out.print("<h3>문자열 추출하기</h3>");
	   	char c = '닳';
	   	String letter ="동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";

	   	int a = letter.length();
	   	
	   		
   		
   	%>
	</body>
</html>