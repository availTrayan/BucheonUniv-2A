package exammiddle;

public class MaxMin extends SeekData {

	public MaxMin(int[] array) {
		super(array);
		this.array = array;
	}
	
	public void selectInteger() {
		int max = array[0];
		int min = array[0];
			
		for(int i=0; i<array.length; i++) {
			if(array[i] >=max) 
				max = array[i];
					
			if(array[i] <= min) 
				min = array[i];
			}
				System.out.println("최대값: "+max);
				System.out.println("최소값: "+min);
			}
			
		}
