package week04;

public class Week04Main {

	public static void main(String[] args) {
		
		//int [] arry = {1,2,4,5,6};
		String [] arry = {"����ī��??", "����ü ��������??", "��¥��!!"};
		
		ArrayTest arryTest = new ArrayTest();
		
		arryTest.printArry(arry);
		System.out.println("=================");
		
		for(String i : arry){    
			System.out.println(i);
		}

	}

}
