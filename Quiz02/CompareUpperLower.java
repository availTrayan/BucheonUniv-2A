package Quiz02;

/*
Q1. �迭�� ����� ���ڵ� �߿��� ��ҹ��ڸ� ���ԵǾ� �ִ��� ���θ� �Ǵ��ϴ� Ŭ���� �ۼ�

c1. ���ڰ� ����� �迭�� �ݵ�� �����ڸ� ���Ͽ� ����
c2. ������ ����� �Ҹ��� Ÿ������ ��ȯ
*/

public class CompareUpperLower {
	
	private char [] arr; //���ڿ��� ���ڴ� Ÿ���� �ٸ�
	
	public CompareUpperLower(char[] arr){
		this.arr = arr;
	}
	
	public boolean compareChar(){
		char ch;
		for(int i=0; i<arr.length; i++){
			ch=arr[i];
			if((ch<'a' || ch>'z') && (ch>'Z' || ch <'A')) //��ҹ������� �Ǻ�
				return false;
		}
		return true;
		
		
	}

}
