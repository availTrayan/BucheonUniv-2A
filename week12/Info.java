package week12;

public class Info {
	
	private String name;
	
	private int age;

	public Info(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Info [name=" + name + ", age=" + age + "]";
	}

	
}
