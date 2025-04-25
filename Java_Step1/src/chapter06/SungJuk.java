package chapter06;

import javax.swing.JOptionPane;

public class SungJuk {
	
	// 멤버 변수 = 필드 = 속성
	public String std_num;
	public String std_name;
	private int java, oracle, spring;
	
	void sum()
	{
		System.out.println("합계-" + (java+oracle+spring));
	}
	
	void avg()
	{
		System.out.println("평균-" + (double)(java+oracle+spring)/3);
	}
	
	// 메서드
	public static void main(String[] args)
	{
		SungJuk rec = new SungJuk();
		rec.std_num = JOptionPane.showInputDialog("학번");
		rec.std_name = JOptionPane.showInputDialog("이름");
		
		rec.java = Integer.parseInt(JOptionPane.showInputDialog("자바점수"));
		rec.oracle = Integer.parseInt(JOptionPane.showInputDialog("오라클점수"));
		rec.spring = Integer.parseInt(JOptionPane.showInputDialog("스트링점수"));
		
		System.out.println("학번-" + rec.std_num + "|성명-" + rec.std_name + "님의 성적입니다.");
		System.out.println("----------------------------------------------------------------");
		rec.sum();
		rec.avg();
	}
}
