package finalexam;

import java.util.LinkedList;
import java.util.StringTokenizer;

public class ExtractToken {
	
	public static void main(String args[]){
		
		StringBuffer sb = new StringBuffer();
		sb.ensureCapacity(10);
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("안희용 이순신");
		list.add("이순신 안희용");
		list.add("김구 세종대왕");
		list.add("세종대왕 김구");
		list.add("강감찬 을지문덕 ");
		list.add("을지문덕 강감찬");
		list.add("최영 안중근");
		list.add("안중근 을지문덕");
		list.add("박지성 자바기초");
		list.add("자바기초 최영");
		
		StringTokenizer stok = new StringTokenizer(null, null);
		String str = stok.nextToken();
		System.out.println(str);
	}

}
