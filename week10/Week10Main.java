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
			System.out.println("데이터 변환 예외 발생");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열의 범위를 넘었음");
		}catch(ArithmeticException e){
			System.out.println("산술 오류");
		}catch(MyException e){
			System.out.println(e.getMessage);
		}catch(Exception e){
			System.out.println("모든 예외 처리");
		}finally{
			System.out.println("예외에 상관없이 실행");
		}

	}

}
