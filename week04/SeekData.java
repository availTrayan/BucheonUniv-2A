package week04;

public class SeekData {

	//�迭�� ����� ������ data�� Ž���ϴ� Ŭ������ �ۼ�
	//���ϴ� ������ ����� index�� ã��, �������� ���� ��� -1
	//�迭�� �ݵ�� �����ڸ� ���� ���� ����
	//Ž���� ������ �Լ� ȣ��� ����
	
	int [] arry;
	int data;
	
	public SeekData(int [] arry) {
		this.arry = arry;
	}
	
	public int seek(int data){
		this.data = data;
		return seekPos();
	}

	private int seekPos(){
	for(int i=0; i< arry.length; i++){
		if(arry[i] == data)
			return i;
	}
	return -1;
  }
}
