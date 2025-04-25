package chapter03.switchtest;

import java.util.Scanner;

public class SwitchCase_04 {

	public static void main(String[] args) {
		// A, a -> 최우수고객
	    // B, b -> 우수고객
		// 나머지 -> 일반고객
		Scanner scan=new Scanner(System.in);
		
		System.out.print("고객등급을 입력하세요(A,a,B,b): ");
		char lank;
		lank=scan.nextLine().charAt(0);

		
		switch (lank) {
		case 'a':
		case 'A':{
			System.out.println("최우수고객.");
			break;
		}
		case 'b':
		case 'B':{
			System.out.println("우수고객.");
			break;
		}
		default:{
			System.out.println("일반고객.");
		}
	}//switch
		

	}//main

}//class
