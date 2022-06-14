package week13;

public class Name {
	
	String firstName;
	String lastName;
	
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//해쉬코드 오버라이드
	@Override
	public int hashCode(){
		return firstName.hashCode() + lastName.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Name))
			return false;
		Name name = (Name) obj;
		if (firstName.equals(name.firstName)
				&& lastName.equals(name.lastName))
			return true;
		else
		return false;
	}
	
	
	

}
