package week04;

public class ArrayTest {
	
	public void printArry(String arry[]){
		/*
		for(int i=0; i< arry.length; i++){
			System.out.println(arry[i]);
		}
		*/
		
		for(String i : arry){    //�迭���� ���������� 0������ ����ؼ� ���� i�� ����
			System.out.println(i);
		}

		arry[0] = "���!!";
		arry[1] = "�����̷�??";
		arry[2] = "��ȣ���Լ����� ���� �ٲ彴";
		
	}

}
