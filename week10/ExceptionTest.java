package week10;

import java.text.NumberFormat;

public class ExceptionTest {
	
	void except() throws NumberFormatException, ArrayIndexOutOfBoundsException, ArithmeticException 
				  //throws ����� ���� try catch���� �ʿ���� 
	{
		int[] var = {10,200,300};
		/*
		for(int i=0; i<=3; i++)
			System.out.println("var["+i+"] :"+var[i]);
		
		System.out.println("���α׷� ��!");
		*/
		
	
			int data = Integer.parseInt("��");
			
			for(int i=0; i<=3; i++){
				System.out.println("var["+i+"] : "+var[i]);
			}
			
			int a= 4/0;	
			}
			void throwMyExcep() throws MyException{
				throw new MyException("��� ���� ���� ���� ��ü");
			}
	}
