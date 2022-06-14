package week03;

public class Santafe extends Car {

	//Car 생성자 상속 불가
    //private으로 제한된 멤버변수들 상속불가
	
	public Santafe() {
		super(); //부모 클래스의 생성자를 호출하기 위해 사용,첫번째 라인에 입력돼야함
		// TODO Auto-generated constructor stub
	}

	public Santafe(String color, String carSize, int engSize) {
		super(color, carSize, engSize);
		System.out.println("요기는 Santafe 클래스입니당");
		// TODO Auto-generated constructor stub
	}

	public Santafe(String color, String carSize) {
		super(color, carSize);
		// TODO Auto-generated constructor stub
	}

	public Santafe(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	public void speedUp(int speed){ //상속받은 클래스의 내용을 자식 클래스에서 재정의, 오버라이딩
		super.speedUp(speed); //부모 클래스에 있는 메소드 호출
		System.out.println("아버지꺼 쫗앟~~ 더 추가할 꼬양~~~");
	}
	
	public void speedDown(int speed){
		super.speedDown(speed);
		System.out.println("아버지꺼 별로양~~ 요건 내꼬양~~~");
	}
	
	
}
