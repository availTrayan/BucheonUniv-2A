package Quiz03;

/*
 Q2. 아래와 같이 출력되는 클래스를 작성
     *
    ***
   *****
  *******
c1.출력될 라인수는 반드시 생성자를 통하여 전달
 */

 public class DementionStar{
 
 	private int rowCnt;
 	private String dir = "정방향";
 
	 public DementionStar(int rowCnt){
	 this.rowCnt = rowCnt;
	 }
 
	 private void printChar(int cnt, char ch){
	 for(int i=0; i<cnt; i++)
	 System.out.print(ch);
	 }
 
	 /*
	 public void printStar(){
	 for(int row=0; row<rowCnt; row++){
	 printChar((rowCnt-row)-1,' ');
	 printChar((row*2)+1, '*');
	 System.out.println();
	 }
 	}
 	*/
	 
	 public void printStar(){
		 for(int row=0; row<rowCnt; row++){
			 if(dir == "정방향"){
				 printChar((rowCnt-row)-1, ' ');
				 printChar((row*2)+1, '*');
			 }
			 else if(dir == "역방향"){
				 printChar(row, ' ');
				 printChar((rowCnt-row)*2-1, '*');
			 }
			 System.out.println();
		 }
	 }
	 
	 public void printStar(final String d){   //printStar 메서드 오버로딩
		 switch(d){
		 
		 case "REG" :
			 dir = "정방향";
			 printStar();
			 break;
			 
		 case "REV" :
		 	dir = "역방향";
		 	 printStar();
			 break;
		 	
		 case "DOUB" :
			 dir = "정방향";
			 printStar();
			 dir = "역방향";
			 printStar();
			 break;
			 
		 default:
			 System.out.println("방향 지정이 잘못됨");
		 }
	 }
 }
 
 
 /*
 public class MakeStar {

		
		public void printstar(){
			
			for(int i=0; i<5; i++){
				
				if(i==0){
				System.out.println("   *");
				}
				else if(i==1){
					System.out.println("  ***");
				}
				else if(i==2){
					System.out.println(" *****");
				}
				else if(i==3){
					System.out.println("*******");
			}
		}
		
		}
	}
	*/
























