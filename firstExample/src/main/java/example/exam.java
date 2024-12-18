package example;

public class exam {
	public static void main(String[]args) {
		
		//out.print("<h3>문자열 추출하기</h3>");
		//char c = '닳';
		//String letter="동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		
		String letter="동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		char c = '닳';
		
		int a = letter.length();
		int loc = letter.indexOf(c); // c가 있는 곳이 몇번째의 자리인가?
		char b = letter.charAt(loc); // loc번째 있는 글자가 무슨 글자인가?  
		System.out.print(a + "," + c + "," + b + "," + loc);
 		
		
		
	
		
		
		
	}
}
