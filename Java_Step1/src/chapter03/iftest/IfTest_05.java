package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfTest_05 {

	public static void main(String[] args) {
		/*BMI = 체중(kg) / 신장(m)*2
		  25이상: 과체중
		  18.5이상 25미만: 정상
		  18.5 미만: 저체중
		*/
		
		double weight=Double.parseDouble(JOptionPane.showInputDialog("몸무게(kg를 입력하세요"));
		double height=Double.parseDouble(JOptionPane.showInputDialog("키(m)를 입력하세요"));
		
		double bmi=weight/(height*height);
		System.out.println("bmi: "+bmi);
		String result;
		result=" ";
		
		if(bmi>=25) {
			result="과체중";
		}else if(bmi<25 && bmi>18.5) {
			result="정상";
		}else if(bmi<18.5) {
			result="저체중";
		}
		
		System.out.printf("당신의 BMI는 %.2f 이며, %s 입니다." ,bmi, result);
		
		
		/*if(bmi>25) {
			System.out.println("과체중");
		}else if(bmi<25 && bmi>18.5) {
			System.out.println("정상");
		}else if(bmi<18.5) {
			System.out.println("저체중");
		}*/
	}

}
