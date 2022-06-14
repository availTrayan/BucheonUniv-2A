package quiz04;
import java.util.*;

public class AutomaticVendingMachine {
	
		int menu;
		int money;
		int change;
	
	public void selectmenu(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("동전투입");
		int money = sc.nextInt();
		
		System.out.println("음료선택");
		int menu = sc.nextInt();
		
		int change = money-menu;
		
		System.out.println("거스름돈"+ change);
		
	}

}
