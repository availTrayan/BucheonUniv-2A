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
		StringTokenizer stok = new StringTokenizer("���, ��, | ������",",|");     //��ū�� ���� ��ü����
		while(stok.hasMoreTokens()){  //��ū�� �ִ��� ����
			String str = stok.nextToken();  //��ū ����
			System.out.println(str); //����� ��ū ���
			*/
		/*
		GregorianCalendar calendar = new GregorianCalendar();
		int year = calendar.get(calendar.YEAR);
		int month = calendar.get(calendar.MONTH) +1; //���� 0���� �����ϱ� ������
		int date = calendar.get(calendar.DATE);
		int amPm = calendar.get(calendar.AM_PM);
		int hour = calendar.get(calendar.HOUR);
		int min = calendar.get(calendar.MINUTE);
		int sec = calendar.get(calendar.SECOND);
		String sAmPm = amPm == Calendar.AM ? "����":"����";
		System.out.printf("%d�� %d�� %d�� %s %d�� %d�� %d��", year, month, date, sAmPm, hour, min, sec);
		*/
		
		/*
		GregorianCalendar calendar = new GregorianCalendar();
		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		String str = dataFormat.format(calendar.getTime());
		System.out.println(str);
		*/
		
		System.out.println("2�� 3����" + Math.pow(2,3));  //Math Ŭ������ ���а��
		System.out.println("16�� ��������?" + Math.sqrt(16));
		System.out.println("4�� 7�� ū ����?" + Math.max(4,7));
		System.out.println("4�� 7�� ���� ����?" + Math.min(4, 7));
		
		Random random = new Random();
		System.out.println(random.nextInt(100)); //0���� 99���� ������ �����ϰ� ���� �߻�
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
	}
		
	}

