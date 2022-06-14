package week06;

abstract public class Account { //���������� �տ� final���̸� ��ӺҰ�
								//abstract Ű����: �̿ϼ��̶� ��üȭ�� �� �� ��ü���� �Ұ�,��ӹ޴� Ŭ�������� ��ü �ϼ��ؾ� ��
	
	String accountNo;
	String ownerName; 
	int balance; //�ܰ�
	
	public Account(String accountNo) { //�޼ҵ忡�� final ���ϼ� ����
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

	protected void deposit(int amount){ //���� ���
		balance += amount;
		System.out.println(amount + " �ݾ��� �����Ǿ���!!");
	}
	
	int withdraw(int amount) throws Exception{ //���� ���
		if(balance < amount)
			throw new Exception("�ܾ��� �����մϴ�.");
		balance -= amount;
		return amount;
	}

	abstract void print(); //���� �ְ� ��ü�� �������� �ʴ� �߻� �޼ҵ�, �߻�޼ҵ尡 1���� ������ �߻�Ŭ������ �ž���
	
}
