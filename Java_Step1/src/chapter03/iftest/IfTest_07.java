package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfTest_07 {

	public static void main(String[] args) {
		// 데이터셋
		String ID = "soldesk";
		int PW =250408;
		
		//고객
		String id=JOptionPane.showInputDialog("아이디");
		
		if(id.equals(ID)) {
	    int pw=Integer.parseInt(JOptionPane.showInputDialog("비밀번호"));
	    if(PW==pw) {
	    	System.out.println(ID+"님 환영합니다.");
	    }else {System.err.println("비밀번호가 틀렸습니다.");
	    }
	    }else {System.out.println("일치하는 ID가 없습니다.");
	    }
	    
		
	}

}
