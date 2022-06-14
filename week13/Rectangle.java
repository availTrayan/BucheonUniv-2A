package week13;

public class Rectangle implements Cloneable {

	int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	int getArea(){
		return width*height;
	}

	@Override
	protected Object clone() {
		
		try {
			return super.clone();
		} 
		catch(CloneNotSupportedException e){
			return null;
		}
	}

}
