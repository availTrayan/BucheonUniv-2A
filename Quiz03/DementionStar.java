package Quiz03;

/*
 Q2. �Ʒ��� ���� ��µǴ� Ŭ������ �ۼ�
     *
    ***
   *****
  *******
c1.��µ� ���μ��� �ݵ�� �����ڸ� ���Ͽ� ����
 */

 public class DementionStar{
 
 	private int rowCnt;
 	private String dir = "������";
 
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
			 if(dir == "������"){
				 printChar((rowCnt-row)-1, ' ');
				 printChar((row*2)+1, '*');
			 }
			 else if(dir == "������"){
				 printChar(row, ' ');
				 printChar((rowCnt-row)*2-1, '*');
			 }
			 System.out.println();
		 }
	 }
	 
	 public void printStar(final String d){   //printStar �޼��� �����ε�
		 switch(d){
		 
		 case "REG" :
			 dir = "������";
			 printStar();
			 break;
			 
		 case "REV" :
		 	dir = "������";
		 	 printStar();
			 break;
		 	
		 case "DOUB" :
			 dir = "������";
			 printStar();
			 dir = "������";
			 printStar();
			 break;
			 
		 default:
			 System.out.println("���� ������ �߸���");
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
























