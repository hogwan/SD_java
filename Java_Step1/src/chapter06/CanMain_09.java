package chapter06;

import java.util.Scanner;

public class CanMain_09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money = 0;
		
		//음료 준비
		Vending vend = new Vending();
		vend.init();
		System.out.print("돈을 투입하세요: ");
		money = Integer.parseInt(scan.nextLine());
		vend.showCans(money);
		System.out.println("============================");
		
		System.out.print("음료를 선택하세요: ");
		String select = scan.next();
		vend.outCan(select);
		
		scan.close();
	}
}
