package quiz04;
import java.util.*;

public class AutomaticVendingMachine {
	
		int menu;
		int money;
		int change;
	
	public void selectmenu(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������");
		int money = sc.nextInt();
		
		System.out.println("���ἱ��");
		int menu = sc.nextInt();
		
		int change = money-menu;
		
		System.out.println("�Ž�����"+ change);
		
	}

}
