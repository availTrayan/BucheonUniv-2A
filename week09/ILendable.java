package week09;

public interface ILendable {
	
	int MAX = 100; //����� �������� ������ �����߻�
	int MIN = 10;
	
	void checkOut(String accont, int balance);
	void checkIn(String account, int balance);
	
}
