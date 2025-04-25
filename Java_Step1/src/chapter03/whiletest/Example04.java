package chapter03.whiletest;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {

		boolean run = true;
		int balance = 0; // 예금(+) 출금(-)

		Scanner scan = new Scanner(System.in);

		// 1.예금|2.출금|3.잔고|4.종료
		while (run) {

			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");

			int menuNum = scan.nextInt();
			// 선택한 값으로 은행업무 수행
			if (menuNum == 1) {
				System.out.println("예금액> ");
				int money = scan.nextInt();
				if (money <= 0) {
					System.out.println("금액을 잘못 입력하셨습니다.");
				} else {
					balance += money;
					System.out.println("잔액> " + balance);
				}
			} else if (menuNum == 2) {
				System.out.println("출금액> ");
				int money2 = scan.nextInt();
				if (money2 <= balance) {
					balance -= money2;
				} else {
					System.out.println("잔액이 부족합니다.");
				}
				System.out.println("잔액> " + balance);
			} else if (menuNum == 3) {
				System.out.println("잔액> " + balance);
			} else {
				run = false;
				break;
			}

			System.out.println("프로그램 종료");
		} // w

	}// c
}// m

/*
 * 나이 int age=scan.nextInt(); 성별 String gen=scan.nextLine();
 * 
 * 나이>29 enter 성별>enter System.out.print("나이: "); int age=scan.nextInt();
 * scan.nextLine(); //필수입력 -> enter를 소비해야함
 * 
 * System.out.print("성별: "); String gen=scan.nextLine(); scan.nextLine();
 * 
 */
