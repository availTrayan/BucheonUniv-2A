package week04;

public class SeekData {

	//배열에 저장된 정수형 data를 탐색하는 클래스를 작성
	//원하는 정수가 저장된 index를 찾음, 존재하지 않을 경우 -1
	//배열은 반드시 생성자를 통해 전달 받음
	//탐색할 정수는 함수 호출시 전달
	
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
