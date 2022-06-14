package exammiddle;

public class SeekData {
	
	int[] array;
	int data;
	
	public SeekData(int[] array) {
		super();
		this.array = array;
	}
	
	private int seekPos(){
		for(int i=0; i< array.length; i++){
			if(array[i] == data)
				return i;
		}
		return -1;
	  }
	
	public int seekdt(int data){
		this.data = data;
		return seekPos();
	}
	
	
}
