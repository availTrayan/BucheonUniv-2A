package finalexam;

public class Account {
	
	String name;
	String num;
	String addr;
	
	public Account(String name, String num, String addr) {
		super();
		this.name = name;
		this.num = num;
		this.addr = addr;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (addr == null) {
			if (other.addr != null)
				return false;
		} else if (!addr.equals(other.addr))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}
	
public static void main(String args[]){
	
		Account obj1 = new Account("æ»»ÒøÎ", "1233019", "Ω√»Ô");
		Account obj2 = new Account("±Ë»ÒøÎ", "1333018", "∫Œ√µ");
	
		obj1.equals(obj2); 

		}
	
	
}
