package chapter03.whiletest;

public class Example02 {

	public static void main(String[] args) {
		// 팩토리얼 알고리즘
		
		/*
		 5! -> 5X4X3X2X1 n! -> n*(n-1)*(n-2)*(n-3)*(n-4)
		 */
		
		int num=5;
		int factorial=1; //곱셈에 대한 누적변수이므로 1로 초기화
		
		while(num>0) {
			//factorial=factorial*number;
			factorial*=num;
			num--;
		}
		System.out.println("팩토리얼 결과: "+ factorial);
		
		
		
		//틀린거
		/*int number=5;
		int sum=4;
		int total=0;
		while (sum>=1) {
			total+=number*sum;
			sum--;
		}
		System.out.println(total);
		*/
	}
		

}
