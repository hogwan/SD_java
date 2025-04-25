package chapter03.whiletest;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {

		/*
		 * 숫자 맞추기 게임 1부터 100까지 무작위 숫자를 선택하고, 숫자를 맞추는 게임 만약 입력한 숫자가 컴퓨터가 선택한 숫자보다 크면
		 * "더 작은 숫자를 추측하세요" 출력 만약 입력한 숫자가 컴퓨터가 선택한 숫자보다 작으면 "더 큰 숫자를 추측하세요" 출력 선택한 숫자를
		 * 정확히 맞출 때까지 과정을 반복 맞출때까지 걸린 시도 횟수를 출력하여 축하의 메시지를 출력
		 */
		int num = (int) (Math.random() * 100) + 1;
		// Random random=new Random();
		boolean result = true;
		int num3 = 0;
		while (result) {
			System.out.println("1~100 업다운 숫자를 추측하세요: ");
			Scanner scan = new Scanner(System.in);
			int num2 = scan.nextInt();
			if (num2 < num) {
				System.out.println("더 큰 숫자를 추측하세요");
				num3++;
			} else if (num2 > num) {
				System.out.println("더 작은 숫자를 추측하세요");
				num3++;
			} else if (num2 == num) {
				System.out.println("정답입니다.");
				num3++;
				System.out.println("입력 횟수: " + num3);
				result = false;
			}
			System.out.println("프로그램 종료");
		} // w

	}

}
