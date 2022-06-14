package week02;

public class Cat { //클래스 이름 대문자로 시작
	int jump;  //멤버변수, 클래스 내의 모든 메소드에서 참조가능
	
	void jumpTree() { //메소드 이름 소문자로 시작
		System.out.println("냐옹!! 지금 " +jump+ "만큼 점프");            //sysout 입력 후 컨트롤 스페이스
	}
	
	void walking(int speed) { //speed 변수는 지역변수
		System.out.println("냐옹~~ " +speed+ "로 걷고 있어용!!");
	}
}

 /*
  public으로 선언하면 모든 접근을 허용, 패키지 내외부 sub,일반 클래스들 가능
  protected로 선언하면 같은 패키지 내에있는 객체와 상속관계의 객체들만 접근을 허용, 외부 패키지의 sub클래스만 가능
   디폴트로 선언하면 같은 package 내에서만 참조 가능, 외부 일반,sub클래스에서 접근 불가
  private으로 선언하면 내외부에서 접근 불가, 현재 객체 내에서만 허용
 */
 