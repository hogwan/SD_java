package chapter03.fortest;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// 몇명의 성적을 입력 받을 것인지 정수로 인원수(cnt)를 입력 받고,
		// 총점(sum)과 평균(avg)을 구하시오.(단, 평균은 실수로 출력할 것)
		//
		Scanner scan=new Scanner(System.in);
		System.out.print("인원 수를 입력하시오: ");
		int cnt = scan.nextInt();// 몇 명
		double avg;
		int sum=0;
		for(int a=1; a<=cnt; a++) {
			System.out.print(a+"번째 성적 입력: ");
			int score = scan.nextInt(); //점수
			sum += score; //총점
		}
		avg=(double)sum/cnt;
		System.out.println(cnt+"명의 점수 총점은" + sum+"점, 평균은 "+avg+"점 입니다.");
		
		

	}

}
