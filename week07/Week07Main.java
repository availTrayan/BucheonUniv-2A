package week07;

public class Week07Main {

	static void testCasting(Account obj){
		
		obj.f();
	}
	
	public static void main(String[] args) {
		
		CheckingAccount obj1 = new CheckingAccount(); //���������� �����ϰ� ��ü�� ����
//		obj1.f();
//		obj1.g();
		
//      Account obj2 = new CheckingAccount(); //�θ�Ÿ������ �ڽİ�ü�� ����, ���������� ����ȯ
//      obj2.g(); �޼ҵ� g�� Account Ÿ�Կ� ����. ����ȯ���� �θ�ü�� ��������
//      obj1 = obj2; ÷������ ��߳�
		
		Account obj2 = new Account();
//		obj1 = (CheckingAccount)obj2; //���� ����ȯ
//		obj1.f();
//		obj1.g();
		
		CreditAccount obj3 = new CreditAccount();
//      obj1 = (CheckingAccount)obj3; //�θ��ڽİ��� ����ȯ�� �����ϳ�  ������������� �Ұ�
		testCasting(obj1);
		testCasting(obj2);
		testCasting(obj3);
		
	}

}
