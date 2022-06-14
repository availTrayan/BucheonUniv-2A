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
		
		list.add("����");
		list.add("����");
		list.add("������");
		
		printArrayList(list);
		System.out.println("=================================");
		
		list.add(1, "������");
		System.out.println("=================================");
		
		list.set(0, "����");
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
		list.add("����");
		list.add("���ξ���");
		list.add("�ٳ���");
		
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
