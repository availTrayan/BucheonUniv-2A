package exammiddle;

public abstract class ObjTest {

	String abc;
	
	public ObjTest() { // 1.기본 생성자, 환영 메시지 출력
		super();
		System.out.println("환영");
	}

	public ObjTest(String abc) { // 2.String 타입의 매개변수를 가지는 생성자, 환영 메시지 출력
		super();
		this.abc = abc;
		System.out.println("환영");
	}

	private int f(int a){ // 3.외부에서 접근할 수 없는 메서드 정의
		return 0;
	}

	public abstract void g(); // 4.상속받은 클래스에서 반드시 구현해야 하는 메서드 선언

	public final int h(int b){ // 5.오버라이딩이 불가능한 메서드 정의
		return 0;
	}

	public void k(){ // 6.모든 클래스에서 접근할 수 있는 메서드 정의
	
	}

}
