package week03;

public class Week03Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Car car = new Car("붉으스럼한 색상", "디따~~ 크용~~", 50);
		//Car car = new Car();
		//Car car = new Car("붉으스럼한 색상");
		/* 
		car.speedUp(5);
		car.speedDown(5);
		car.breakSpeed();
		*/
		
		/*Car Santafe = new Santafe("붉으스럼한 색상", "디따~~ 크용~~", 50); 
		생성자는 상속이 안되므로 새로 만들어야한다.*/
		
		Santafe santafe = new Santafe("붉으스럼한 색상", "디따~~ 크용~~", 50);
		santafe.speedUp(100);
		santafe.speedDown(50);
	}

}
