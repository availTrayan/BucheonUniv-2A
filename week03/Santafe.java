package week03;

public class Santafe extends Car {

	//Car ������ ��� �Ұ�
    //private���� ���ѵ� ��������� ��ӺҰ�
	
	public Santafe() {
		super(); //�θ� Ŭ������ �����ڸ� ȣ���ϱ� ���� ���,ù��° ���ο� �Էµž���
		// TODO Auto-generated constructor stub
	}

	public Santafe(String color, String carSize, int engSize) {
		super(color, carSize, engSize);
		System.out.println("���� Santafe Ŭ�����Դϴ�");
		// TODO Auto-generated constructor stub
	}

	public Santafe(String color, String carSize) {
		super(color, carSize);
		// TODO Auto-generated constructor stub
	}

	public Santafe(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	public void speedUp(int speed){ //��ӹ��� Ŭ������ ������ �ڽ� Ŭ�������� ������, �������̵�
		super.speedUp(speed); //�θ� Ŭ������ �ִ� �޼ҵ� ȣ��
		System.out.println("�ƹ����� �m��~~ �� �߰��� ����~~~");
	}
	
	public void speedDown(int speed){
		super.speedDown(speed);
		System.out.println("�ƹ����� ���ξ�~~ ��� ������~~~");
	}
	
	
}
