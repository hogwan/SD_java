package chapter03.whiletest;

import java.util.Scanner;

public class WhileTest_06 {

	public static void main(String[] args) {
		//if -> 60점 이상이고 100점 이하면 합격
		// 0이상이고 60점 미만이면 불합격
		//그 밖에 "0~100까지의 점수만 입력 가능합니다."
		// AND -> &&
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.println("Java 교과목 점수를 입력하세요: ");
			int scr=scan.nextInt();
			if(scr>=60 && scr<=100) {
				System.out.println("합격입니다.");
			}else if(scr>=0 || scr<60) {
				System.out.println("불합격입니다.");
			}else {
				System.out.println("0~100까지의 점수만 입력 가능합니다.");
			}
				break;
			
		}
		System.out.println("프로그램을 종료합니다.");
	}//m
}//c
