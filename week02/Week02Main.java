package week02;

public class Week02Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Cat objCat;       //클래스의 참조변수 선언, 참조변수의 타입은 클래스의 이름
		objCat = new Cat(); //객체 생성
		*/
		
		Cat objCat = new Cat(); // int a; a=10; int a=10; (선언과 동시에 생성)
		objCat.jump=30;
		objCat.jumpTree();
		objCat.walking(100);
		
	}
}

