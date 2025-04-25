package chapter03.whiletest;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 컴퓨터가 선택한 서로 다른 3자리 수
		int n1, n2, n3;

		do {
			n1 = (int) (Math.random() * 9) + 1;
			n2 = (int) (Math.random() * 9) + 1;
			n3 = (int) (Math.random() * 9) + 1;
		} while (n1 == n2 || n2 == n3 || n3 == n1);

		int trycount = 0;
		boolean run = true;
		System.out.println("숫자 야구 게임 시작!(1~9 사이의 서로 다른 숫자 3개)");
		while (run) {
			trycount++;

			System.out.println("입력 (공백으로 구분)");
			int user1 = scan.nextInt();
			int user2 = scan.nextInt();
			int user3 = scan.nextInt();

			int strike = 0;
			int ball = 0;

			if (user1 == n1) {
				strike++;
			} else if (user1 == n2) {
				ball++;
			} else if (user1 == n3) {
				ball++;
			}
			if (user2 == n2) {
				strike++;
			} else if (user2 == n1) {
				ball++;
			} else if (user2 == n3) {
				ball++;
			}
			if (user3 == n3) {
				strike++;
			} else if (user3 == n2) {
				ball++;
			} else if (user3 == n1) {
				ball++;
			}

			System.out.println("[스트라이크: " + strike + "] [볼: " + ball+"]");
			if (strike == 3) {
				run = false;
				System.out.println("[3 스트라이크!]");
				System.out.println("첫번째 수: " + n1 + "두번째 수: " + n2 + "세번째 수: " + n3);
			}
		}
		// System.out.println("첫번째 수: "+n1+"두번째 수: "+n2+"세번째 수: "+n3);
		// if(n1==user1) strike++;
		// else if(n1==user2||n1==user3) ball++;
	}

}
