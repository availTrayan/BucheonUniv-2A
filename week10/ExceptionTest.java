package week10;

import java.text.NumberFormat;

public class ExceptionTest {
	
	void except() throws NumberFormatException, ArrayIndexOutOfBoundsException, ArithmeticException 
				  //throws 에약어 사용시 try catch블럭이 필요없음 
	{
		int[] var = {10,200,300};
		/*
		for(int i=0; i<=3; i++)
			System.out.println("var["+i+"] :"+var[i]);
		
		System.out.println("프로그램 끝!");
		*/
		
	
			int data = Integer.parseInt("ㅁ");
			
			for(int i=0; i<=3; i++){
				System.out.println("var["+i+"] : "+var[i]);
			}
			
			int a= 4/0;	
			}
			void throwMyExcep() throws MyException{
				throw new MyException("요건 내가 만든 예외 객체");
			}
	}
