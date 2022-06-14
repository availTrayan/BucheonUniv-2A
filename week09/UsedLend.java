package week09;

public class UsedLend {

	public UsedLend(ILendable lend) { //종속성,의존성 감소를 위해 인터페이스 타입의 변수대입
		lend.checkIn("1111-1111", 100);
		// TODO Auto-generated constructor stub
	}

	
	
}
