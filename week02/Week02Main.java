package week02;

public class Week02Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Cat objCat;       //Ŭ������ �������� ����, ���������� Ÿ���� Ŭ������ �̸�
		objCat = new Cat(); //��ü ����
		*/
		
		Cat objCat = new Cat(); // int a; a=10; int a=10; (����� ���ÿ� ����)
		objCat.jump=30;
		objCat.jumpTree();
		objCat.walking(100);
		
	}
}

