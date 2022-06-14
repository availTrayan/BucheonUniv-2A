package Quiz02;

/*
Q1. 배열에 저장된 문자들 중에서 대소문자만 포함되어 있는지 여부를 판단하는 클래스 작성

c1. 문자가 저장된 배열은 반드시 생성자를 통하여 전달
c2. 판정된 결과는 불리언 타입으로 반환
*/

public class CompareUpperLower {
	
	private char [] arr; //문자열과 문자는 타입이 다름
	
	public CompareUpperLower(char[] arr){
		this.arr = arr;
	}
	
	public boolean compareChar(){
		char ch;
		for(int i=0; i<arr.length; i++){
			ch=arr[i];
			if((ch<'a' || ch>'z') && (ch>'Z' || ch <'A')) //대소문자인지 판별
				return false;
		}
		return true;
		
		
	}

}
