package week13;

public class Circle {
	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public boolean equals(Object arg0) { //전달된 매개변수가 circle타입의 변수인지 비교
		if(!(arg0 instanceof Circle))
			return false;
		
		Circle circle = (Circle)arg0;
		if(radius == circle.radius)
			return true;
		else 
			return false;
	}
	
	
	
}
