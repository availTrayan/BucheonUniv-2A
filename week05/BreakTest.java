package week05;

public class BreakTest {
	
	public void breakLevele(int flag){
		int f=0;
		//loop:             루프라벨, 반복문 바로 위에 써야함
		for(int i=0; i<10; i++){
			for(int j=0; j<5; j++){
				if(flag==1 && j==3){
					f=1;
					break;
					//break loop;  라벨 바로 다음에 나타나는 반복문 종료
					}
				}
				if(f==1)
					break;

			}
	}
}