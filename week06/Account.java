package week06;

abstract public class Account { //접근제한자 앞에 final붙이면 상속불가
								//abstract 키워드: 미완성이라 실체화가 못 돼 객체생성 불가,상속받는 클래스에서 몸체 완성해야 함
	
	String accountNo;
	String ownerName; 
	int balance; //잔고
	
	public Account(String accountNo) { //메소드에도 final 붙일수 있음
		super();
		this.accountNo = accountNo;
	}
	
	public Account(String accountNo, String onwername) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
	}
	
	public Account(String accountNo, String onwername, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	protected void deposit(int amount){ //예금 기능
		balance += amount;
		System.out.println(amount + " 금액이 적립되었음!!");
	}
	
	int withdraw(int amount) throws Exception{ //인출 기능
		if(balance < amount)
			throw new Exception("잔액이 부족합니다.");
		balance -= amount;
		return amount;
	}

	abstract void print(); //선언만 있고 몸체는 존재하지 않는 추상 메소드, 추상메소드가 1개라도 있으면 추상클래스가 돼야함
	
}
