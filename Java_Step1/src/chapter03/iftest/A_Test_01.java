package chapter03.iftest;

import javax.swing.JOptionPane;

public class A_Test_01 {

	public static void main(String[] args) {
		//3일차 회원가입임시
		String id=JOptionPane.showInputDialog("사용할 아이디를 입력하세요");
		int pw=Integer.parseInt(JOptionPane.showInputDialog("사용할 비밀번호를 입력하세요"));

		String ID=id;
		int PW=pw;
		System.out.println("======================");
		String id2=JOptionPane.showInputDialog("아이디를 입력하세요");
				
		if(ID.equals(id2)) {
			int pw2=Integer.parseInt(JOptionPane.showInputDialog("비밀번호를 입력하세요"));
		if(pw2==PW) {
			System.out.println("정상적으로 로그인 되셨습니다.");
		}else {
			System.out.println("로그인에 실패하셨습니다.");
		}
		}else {
			System.out.println("없는 아이디 입니다.");
		}
		
		
		
		
	}
}
