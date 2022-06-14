package week10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.StringTokenizer;

public class TokenTest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		StringTokenizer stok = new StringTokenizer("사과, 배, | 복숭아",",|");     //토큰을 담은 객체생성
		while(stok.hasMoreTokens()){  //토큰이 있는지 여부
			String str = stok.nextToken();  //토큰 추출
			System.out.println(str); //추출된 토큰 출력
			*/
		/*
		GregorianCalendar calendar = new GregorianCalendar();
		int year = calendar.get(calendar.YEAR);
		int month = calendar.get(calendar.MONTH) +1; //월은 0부터 시작하기 때문에
		int date = calendar.get(calendar.DATE);
		int amPm = calendar.get(calendar.AM_PM);
		int hour = calendar.get(calendar.HOUR);
		int min = calendar.get(calendar.MINUTE);
		int sec = calendar.get(calendar.SECOND);
		String sAmPm = amPm == Calendar.AM ? "오전":"오후";
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초", year, month, date, sAmPm, hour, min, sec);
		*/
		
		/*
		GregorianCalendar calendar = new GregorianCalendar();
		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		String str = dataFormat.format(calendar.getTime());
		System.out.println(str);
		*/
		
		System.out.println("2의 3승은" + Math.pow(2,3));  //Math 클래스로 수학계산
		System.out.println("16의 제곱근은?" + Math.sqrt(16));
		System.out.println("4와 7중 큰 수는?" + Math.max(4,7));
		System.out.println("4와 7중 작은 수는?" + Math.min(4, 7));
		
		Random random = new Random();
		System.out.println(random.nextInt(100)); //0에서 99까지 숫자중 랜덤하게 난수 발생
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
	}
		
	}

