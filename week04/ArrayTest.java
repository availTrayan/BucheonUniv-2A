package week04;

public class ArrayTest {
	
	public void printArry(String arry[]){
		/*
		for(int i=0; i< arry.length; i++){
			System.out.println(arry[i]);
		}
		*/
		
		for(String i : arry){    //배열에서 순차적으로 0번부터 출력해서 변수 i에 저장
			System.out.println(i);
		}

		arry[0] = "우왕!!";
		arry[1] = "뭔일이래??";
		arry[2] = "피호출함수에서 값을 바꿨슈";
		
	}

}
