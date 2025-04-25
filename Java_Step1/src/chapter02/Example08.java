package chapter02;

import java.util.Scanner;

public class Example08 {

	public static void main(String[] args) {

		// 두 개의 숫자를 입력 받아서 첫 번째(num1) 숫자가 두 번째(num2) 숫자보다
		// 큰지 여부를 출력하는 프로그램을 작성하세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫 번째 숫자 입력: ");
		int number=scan.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("두 번째 숫자 입력: ");
		int number2=scan2.nextInt();
		
		String result;
		result=number>number2? "크다":"작다";
		System.out.println("첫번째 숫자가 두번째 숫자보다 큰가요?: " +result);
		
		
	}

}
