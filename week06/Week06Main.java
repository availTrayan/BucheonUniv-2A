package week06;

public class Week06Main {

	public static void main(String[] args) {
		
		CheckingAccount inh = 
				new CheckingAccount("1111-111", "±Ê∂À¿Ã", 100);
		
		inh.deposit(30);
		inh.credit("2222-2222", 30);
		
	}
}
