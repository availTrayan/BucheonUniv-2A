package week13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class DataStructEx {
	
	void printArrayList(ArrayList<String>arryList){
		int num = arryList.size();
		for(int cnt =0; cnt < num; cnt++){
			String str = arryList.get(cnt);
			System.out.println(str);
		}
	}

	void arrayListTest(){
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("Æ÷µµ");
		list.add("µþ±â");
		list.add("º¹¼þ¾Æ");
		
		printArrayList(list);
		System.out.println("=================================");
		
		list.add(1, "¿À·»Áö");
		System.out.println("=================================");
		
		list.set(0, "¸Á°í");
		System.out.println("=================================");
		
		list.remove(2);
		printArrayList(list);
		
		int num = list.size();
		for(int cnt = 0; cnt< num; cnt++){
			String str = list.get(cnt);
			System.out.println(str);
		}	
	}
	
	void linkedKistTest(){
		LinkedList<String>list = new LinkedList<String>();
		list.add("¸Á°í");
		list.add("ÆÄÀÎ¾ÖÇÃ");
		list.add("¹Ù³ª³ª");
		
		for(String str : list)
			System.out.println(str);
		/*
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			String str = iterator.next();
			System.out.println(str);
		}
		*/
	}

}
