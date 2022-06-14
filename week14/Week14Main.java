package week14;

public class Week14Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JDBCEx ex = new JDBCEx();
		try{
			ex.init();
			ex.insertInto();
			ex.selectEx();
			ex.preparedEx();
		}catch(Exception e){}
		
		System.out.println("정상 종료!!");
	}

}
