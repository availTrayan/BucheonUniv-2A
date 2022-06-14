package week09;

public class Week09Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CDLend lend=null; //레퍼런스 타입의 변수에만 사용가능 프리미티브 타입에는 사용불가 int a = null 불가
		//System.out.println(lend);
		//CDLend lend = new CDLend();
		
		//UsedLend use = new UsedLend(lend);
		//System.out.println(use);
		
		/*
		SeparateVolume sv = new SeparateVolume();
		//ILendable sv = new SeparateVoulme(); 구현클래스를 객체생성 후 참조변수의 타입으로 인터페이스를 참조
		System.out.println(sv.MAX);
		
		System.out.println(ILendable.MIN);
		sv.checkIn("1111-1111", 1000);
		sv.checkIn("2222-2222", 5000);
		*/
		
		/*
		A a = new B();
		if(a instanceof B){
			B b = (B)a;
			System.out.println("형변환 성공!!");
		}else
			System.out.println("형변환 불가");
			*/
		
		StringBuffer sb = new StringBuffer("역사를 하노라고 맨땅을 파다가 ");
		System.out.println(sb);
		System.out.println(sb.append("커다란 고인돌을 끄집어 내어놓고 보니"));
		System.out.println(sb.append("고인돌 아닌데 낚였네"));
	}
	


}
