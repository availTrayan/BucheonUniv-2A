package week06;

public class CheckingAccount extends Account {

	public CheckingAccount(String accountNo, String onwername, int balance) {
		super(accountNo, onwername, balance); //super�� �̿��� ����Ŭ���� ������ ȣ��
	}

	@Override    //�θ� Ŭ������ deposit �������̵� �޼ҵ�
	protected void deposit(int amount) {     //�θ� Ŭ������ ���������� protected�� ����
		super.deposit(amount);
		System.out.println(accountNo);
		System.out.println(ownerName);
		System.out.println(balance);
	}
	
	void credit(String cardNo, int amount){
		System.out.println(cardNo + "ī�忡�� "+ amount + "�� ����!!");
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("�θ� Ŭ������ abstract �޼ҵ带 ���������Ƿ� �ϼ��� �޼ҵ�");
		
	}

}
