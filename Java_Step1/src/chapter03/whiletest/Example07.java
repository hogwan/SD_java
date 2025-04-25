package chapter03.whiletest;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		// 숫자 암호(3자리) 해제
		/*
		 * 1. 컴퓨터가 100~999 사이의 무작위 암호를 설정 2. 사용자가 맞출 때까지 입력 3. 틀릴경우 "틀렸습니다. 다시 입력하세요."
		 * 출력 4. 맞추면 "성공! 암호 해제 완료" 5. 몇번 만에 맞췄는지
		 */
		int password = (int) (Math.random() * 899) + 100;
		boolean run = true;
		int count = 0;
		System.out.println("===암호(3자리) 맞추기===");
		System.out.println(password);
		while (run) {
			System.out.println("[3자리 암호를 입력하세요]");
			Scanner scan = new Scanner(System.in);
			int user = scan.nextInt();
			if (user != password) {
				System.out.println("[틀렸습니다. 다시 입력하세요.]");
				count++;
			} else if (user == password) {
				System.out.println("[성공! 암호 해제 완료]");
				count++;
				run = false;
				System.out.println("[시도 횟수]" + count);
			}

		}

	}

}
