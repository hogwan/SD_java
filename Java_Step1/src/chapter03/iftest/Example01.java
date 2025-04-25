package chapter03.iftest;

import javax.swing.JOptionPane;

public class Example01 {

	public static void main(String[] args) {
		// wizard라는 이름과 일치하면 문이 열리고 퀴즈의 답은 fire
		// 문이 열린후 퀴즈의 답은 fire다 퀴즈까지 맞히면 "정답입니다 동굴의 문이 열립니다."
		// 이름이 일치하지 않으면 "이름이 틀렸습니다. 접근이 거부됩니다"
		// 이름은 일치하였으나 퀴즈의 답이 틀리면 "틀렸습니다. 도망치세요"
		
		String ID = "wizard";
		String PW = "fire";
		
		String id=JOptionPane.showInputDialog("이름은?");
		if(id.equals(ID)) {
		System.out.println("문이 열립니다");
		String pw=JOptionPane.showInputDialog("퀴즈의 답은?");
			if(pw.equals(PW)) {
				System.out.println("정답입니다. 동굴의 문이 열립니다");
			}else {
				System.out.println("틀렸습니다. 도망치세요");
			}
				
			}else {
				System.out.println("이름이 틀렸습니다. 접근이 거부됩니다");
			
		}
		
		

	}

}
