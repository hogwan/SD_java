package chapter03.whiletest;

public class WhileTest_01 {

	public static void main(String[] args) {
		
		while(true) {
			
			int num=(int)(Math.random()*6)+1;	//1,2,3,4,5,6		
			System.out.println("주사위의 눈: "+num);
			
			if (num ==6 ) {
				break;
				
			}
		}//while
		
		
		
	}

}
