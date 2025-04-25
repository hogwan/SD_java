package chapter03.iftest;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfTest_04 {

	public static void main(String[] args) {
		/*전시관의 입장료는 미취학 아동은 1000원 ->7
		전시관의 입장료는 초등학생은 2000원->13
		전시관의 입장료는 중,고등학생은 3500원 ->19
		전시관의 입장료는 성인은 5000원*/
		
		int age;
		/*Scanner scan=new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
		int age2=scan.nextInt();
		
		if(age2<8) {
			System.out.println("미취학 아동-1000원");
		}else if(age2<14 && age2>8) {
			System.out.println("초등학생-2000원");
		}else if(age2<20 && age2>13) {
			System.out.println("중,고등학생-3500원");
		}else if(age2>19) {
			System.out.println("성인-5000원");
		}
		*/
		age=Integer.parseInt(JOptionPane.showInputDialog("나이"));

		if(age<8) {
			System.out.println("미취학 아동-1000원");
		}else if(age<14 && age>8) {
			System.out.println("초등학생-2000원");
		}else if(age<20 && age>13) {
			System.out.println("중,고등학생-3500원");
		}else if(age>19) {
			System.out.println("성인-5000원");
		}

		
		
	}
}
