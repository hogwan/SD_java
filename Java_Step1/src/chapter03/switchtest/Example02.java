package chapter03.switchtest;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 요일을 입력받아(1~7) 해당 요일에 어떤 음식을 먹을지 출력하는 프로그램을 작성하세요. 
		 * (월요일:떡볶이,화요일:스파게티,------,일요일:초밥)-->여러분이 먹고싶은거 아무거나
		 */
		int day;
		Scanner scan = new Scanner(System.in);
		System.out.print("요일(1~7) : ");
		day=scan.nextInt();
		String food;
		
		switch (day) {
		case 1:
			food="월-떡볶이";
			System.out.println("오늘의 음식은 "+food);
			break;
		case 2:
			food="화-스파게티";
			System.out.println("오늘의 음식은 "+food);
			break;
		case 3:
			food="수-피자";
			System.out.println("오늘의 음식은 "+food);
			break;
		case 4:
			food="목-라면";
			System.out.println("오늘의 음식은 "+food);
			break;
		case 5:
			food="금-치킨";
			System.out.println("오늘의 음식은 "+food);
			break;
		case 6:
			food="토-돈까스";
			System.out.println("오늘의 음식은 "+food);
			break;
		case 7:
			food="일-초밥";
			System.out.println("오늘의 음식은 "+food);
			break;
		default:
			System.out.println("1~7의 숫자로 입력해주세요");
		}
		
		
		

	}

}
