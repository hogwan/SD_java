package chapter03.fortest;

public class ForTest_01 {

	public static void main(String[] args) {
		// 1 ~ 10까지의 합
		int sum = 0;
		// 누적 변수방
		sum = sum + 1;
		// sum = sum +2;
		sum += 2;
		System.out.println(sum);

		int i;//index변수
		System.out.println("1부터 10까지의 수 출력");
		for (i = 0; i < 10; i++) {
			System.out.println((i+1) + " ");
		}
		System.out.println();
		System.out.println("======================");
			
		int k;//index변수
		System.out.println("1부터 10까지의 수 출력");
		for (k = 0; k < 10; ++k) {
			System.out.println((k) + " ");
			
			
		}

	}

}
