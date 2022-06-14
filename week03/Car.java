package week03;

public class Car {

	private String color;
	String carSize;
	protected int engSize;
	private int currentSpeed=0;
	
	
	public Car(String color) {
		this(color, "쪼매 크용~~", 40); //this 메소드는 항상 첫번째 라인
		// this.color = color; 위에서 초기화 설정을 해줬으므로 필요없음
		// 이 생성자가 호출됐을때 다른 변수 초기화 
		//carSize = "asdfa";
		//engSize = 30;
		System.out.println("Car(color) 객체 생성자");
	}

	//생성자에서 자신이 속한 클래스의 다른 생성자를 호출할때 this 메소드 이용.
	
	public Car(String color, String carSize) { //같은 클래스내에서 재정의, 이름이 같지만 매개변수가 다른 생성자들 = 오버로딩
		this(color, carSize, 50);
		//this.color = color;
		//this.carSize = carSize;
		System.out.println("Car(color, carSize) 객체 생성자");
	}



	public Car(String color, String carSize, int engSize) {
		super();
		this.color = color;
		this.carSize = carSize;
		this.engSize = engSize;
		System.out.println("Car(color, carSize, engSize) 객체 생성자");
		carInfo();
	}
	
	public Car() { //매개변수를 가지지않는 생성자 디폴트 생성자
		this("붉으스럼한 색상", "쪼매 작아용ㅠㅠ", 20);
		System.out.println("Car() 생성자");
		// TODO Auto-generated constructor stub
	}

	
	public void speedUp(int speed){
		for(int i=currentSpeed; i<=speed; i++){
			System.out.println("현재 스피드를 "+ i + " 만큼 증가합니다~~~");
		}
		currentSpeed = speed;
	}
	
	public void speedDown(int speed){
		for(int i=currentSpeed; i>=0; i--){
			System.out.println("현재 스피드를 " + i + " 만큼 감소합니다~~~");
		}
		currentSpeed = speed;
	}
	
	public void breakSpeed(){
		System.out.println("브레이크를 콱 밟았어요~~~");
		currentSpeed = 0;
		System.out.println("현재 스피드: " + 0);
	}
	
	private void carInfo(){
		System.out.println("자동차 색상: " + color);
		System.out.println("자동차 차체 크기: " + carSize);
		System.out.println("엔진 크기: " + engSize);
	}
	
}


