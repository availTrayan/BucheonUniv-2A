package week07;

public class Week07Main {

	static void testCasting(Account obj){
		
		obj.f();
	}
	
	public static void main(String[] args) {
		
		CheckingAccount obj1 = new CheckingAccount(); //참조변수를 선언하고 객체를 대입
//		obj1.f();
//		obj1.g();
		
//      Account obj2 = new CheckingAccount(); //부모타입으로 자식객체를 참조, 참조변수의 형변환
//      obj2.g(); 메소드 g는 Account 타입에 없음. 형변환으로 부모객체만 가능해짐
//      obj1 = obj2; 첨조범위 어긋남
		
		Account obj2 = new Account();
//		obj1 = (CheckingAccount)obj2; //강제 형변환
//		obj1.f();
//		obj1.g();
		
		CreditAccount obj3 = new CreditAccount();
//      obj1 = (CheckingAccount)obj3; //부모자식간은 형변환이 가능하나  상속형제끼리는 불가
		testCasting(obj1);
		testCasting(obj2);
		testCasting(obj3);
		
	}

}
