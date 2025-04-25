package chapter03.switchtest;

import javax.swing.JOptionPane;

public class Example03 {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("등급을 입력하세요 (A~F):");
		
		//null (아무것도 입력안된 상황) -> String str=null; 
		//isEmpty(문자길이가 0) -> String str="";
		
		//if문으로 input == null 이거나 input.isEmpty() 면 메세지 박스를 이용하여 출력
		//입력값이 없습니다.
		
		if(input==null||input.isEmpty()){
			JOptionPane.showMessageDialog(null,"입력값이 없습니다.");
		}
		
		//'A' 'B' 'C' 'D' 'F' 입력받기
		
		char grade=Character.toUpperCase(input.charAt(0));//받아온 input값을 대문자로 변환하는듯?
		String message;
		
		//switch 사용
		switch (grade) {
		case 'A':
			message=grade+"매우 우수한 성적 입니다";
			break;
		case 'B':
			message=grade+"우수한 성적 입니다";
			break;
		case 'C':
			message=grade+"보통입니다";
			break;
		case 'D':
			message=grade+"노력이 필요합니다.";
			break;
		case 'F':
			message=grade+"불합격입니다.";
			break;
		default:
			message="잘못된 입력입니다.";
			System.out.println("입력값이 없습니다.");
					}
	
		//messagedialog 출력
		JOptionPane.showMessageDialog(null,"입력한 등급: "+ grade +"\n코멘트: " + message);

	}//main

}//class
