package week05;

public class BreakTest {
	
	public void breakLevele(int flag){
		int f=0;
		//loop:             ������, �ݺ��� �ٷ� ���� �����
		for(int i=0; i<10; i++){
			for(int j=0; j<5; j++){
				if(flag==1 && j==3){
					f=1;
					break;
					//break loop;  �� �ٷ� ������ ��Ÿ���� �ݺ��� ����
					}
				}
				if(f==1)
					break;

			}
	}
}