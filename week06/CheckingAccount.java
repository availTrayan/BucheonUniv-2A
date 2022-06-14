package week06;

public class CheckingAccount extends Account {

	public CheckingAccount(String accountNo, String onwername, int balance) {
		super(accountNo, onwername, balance); //super를 이용해 슈퍼클래스 생성자 호출
	}

	@Override    //부모 클래스의 deposit 오버라이딩 메소드
	protected void deposit(int amount) {     //부모 클래스의 접급제한자 protected와 맞춤
		super.deposit(amount);
		System.out.println(accountNo);
		System.out.println(ownerName);
		System.out.println(balance);
	}
	
	void credit(String cardNo, int amount){
		System.out.println(cardNo + "카드에서 "+ amount + "가 결제!!");
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("부모 클래스의 abstract 메소드를 구현했으므로 완성된 메소드");
		
	}

}
