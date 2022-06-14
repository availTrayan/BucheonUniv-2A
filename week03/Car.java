package week03;

public class Car {

	private String color;
	String carSize;
	protected int engSize;
	private int currentSpeed=0;
	
	
	public Car(String color) {
		this(color, "�ɸ� ũ��~~", 40); //this �޼ҵ�� �׻� ù��° ����
		// this.color = color; ������ �ʱ�ȭ ������ �������Ƿ� �ʿ����
		// �� �����ڰ� ȣ������� �ٸ� ���� �ʱ�ȭ 
		//carSize = "asdfa";
		//engSize = 30;
		System.out.println("Car(color) ��ü ������");
	}

	//�����ڿ��� �ڽ��� ���� Ŭ������ �ٸ� �����ڸ� ȣ���Ҷ� this �޼ҵ� �̿�.
	
	public Car(String color, String carSize) { //���� Ŭ���������� ������, �̸��� ������ �Ű������� �ٸ� �����ڵ� = �����ε�
		this(color, carSize, 50);
		//this.color = color;
		//this.carSize = carSize;
		System.out.println("Car(color, carSize) ��ü ������");
	}



	public Car(String color, String carSize, int engSize) {
		super();
		this.color = color;
		this.carSize = carSize;
		this.engSize = engSize;
		System.out.println("Car(color, carSize, engSize) ��ü ������");
		carInfo();
	}
	
	public Car() { //�Ű������� �������ʴ� ������ ����Ʈ ������
		this("���������� ����", "�ɸ� �۾ƿ�Ф�", 20);
		System.out.println("Car() ������");
		// TODO Auto-generated constructor stub
	}

	
	public void speedUp(int speed){
		for(int i=currentSpeed; i<=speed; i++){
			System.out.println("���� ���ǵ带 "+ i + " ��ŭ �����մϴ�~~~");
		}
		currentSpeed = speed;
	}
	
	public void speedDown(int speed){
		for(int i=currentSpeed; i>=0; i--){
			System.out.println("���� ���ǵ带 " + i + " ��ŭ �����մϴ�~~~");
		}
		currentSpeed = speed;
	}
	
	public void breakSpeed(){
		System.out.println("�극��ũ�� �� ��Ҿ��~~~");
		currentSpeed = 0;
		System.out.println("���� ���ǵ�: " + 0);
	}
	
	private void carInfo(){
		System.out.println("�ڵ��� ����: " + color);
		System.out.println("�ڵ��� ��ü ũ��: " + carSize);
		System.out.println("���� ũ��: " + engSize);
	}
	
}


