package chapter03.fortest;

public class Example02 {

	public static void main(String[] args) {
		//홀수 구구단
		
		for(int i=1; i<=9; i++) {
			if(i%2==1) {
			System.out.print("["+i+"단]"+"\t");
			}
		}
		System.out.println("");
		//======================================
		for(int i=1;i<=9;i++){
			
			
			for(int j=1;j<=9;j++) {
				if(j%2==1) {
					System.out.print(j+"X"+i+"="+(j*i)+"\t");
				}//if
			}//in
			
			System.out.println();
		}//out
		
		
	}

}
