package example;

import java.text.SimpleDateFormat;
import java.util.Date;

//웹에서 클래스를 접근하기 위해서는 반드시 패키지 설정이 되어야 한다. 디폴트 패키지 불가능.

public class Clock {

	public String now() {
		Date nowDate = new Date();
		SimpleDateFormat dateFormat = 
				new SimpleDateFormat("yyyy년 MM월 dd일  hh시 mm분 ss초");
		return dateFormat.format(nowDate);
	}
	}


