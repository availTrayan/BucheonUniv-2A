package week09;

public interface ILendable {
	
	int MAX = 100; //상수를 지정하지 않으면 오류발생
	int MIN = 10;
	
	void checkOut(String accont, int balance);
	void checkIn(String account, int balance);
	
}
