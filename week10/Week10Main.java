package week10;

public class Week10Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionTest et = new ExceptionTest();

		try{
			et.throwMyExcep();
		}catch(NumberFormatException e){
			System.out.println("������ ��ȯ ���� �߻�");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�迭�� ������ �Ѿ���");
		}catch(ArithmeticException e){
			System.out.println("��� ����");
		}catch(MyException e){
			System.out.println(e.getMessage);
		}catch(Exception e){
			System.out.println("��� ���� ó��");
		}finally{
			System.out.println("���ܿ� ������� ����");
		}

	}

}
