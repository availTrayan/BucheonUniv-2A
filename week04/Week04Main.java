package week04;

public class Week04Main {

	public static void main(String[] args) {
		
		//int [] arry = {1,2,4,5,6};
		String [] arry = {"뭐라카노??", "도대체 뭔말인지??", "왕짜증!!"};
		
		ArrayTest arryTest = new ArrayTest();
		
		arryTest.printArry(arry);
		System.out.println("=================");
		
		for(String i : arry){    
			System.out.println(i);
		}

	}

}
