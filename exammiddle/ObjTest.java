package exammiddle;

public abstract class ObjTest {

	String abc;
	
	public ObjTest() { // 1.�⺻ ������, ȯ�� �޽��� ���
		super();
		System.out.println("ȯ��");
	}

	public ObjTest(String abc) { // 2.String Ÿ���� �Ű������� ������ ������, ȯ�� �޽��� ���
		super();
		this.abc = abc;
		System.out.println("ȯ��");
	}

	private int f(int a){ // 3.�ܺο��� ������ �� ���� �޼��� ����
		return 0;
	}

	public abstract void g(); // 4.��ӹ��� Ŭ�������� �ݵ�� �����ؾ� �ϴ� �޼��� ����

	public final int h(int b){ // 5.�������̵��� �Ұ����� �޼��� ����
		return 0;
	}

	public void k(){ // 6.��� Ŭ�������� ������ �� �ִ� �޼��� ����
	
	}

}
