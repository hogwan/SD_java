package chapter03.switchtest;

public class SwitchCase_06 {

	public static void main(String[] args) {
		
		int time=(int)(Math.random()*10)+9;
		System.out.println("[현재시간]: "+time+"시");
		System.out.print("할 일: ");
		
		switch (time) {
		case 9:
			System.out.println("백설이 산책하기");
			break;
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
			System.out.println("공부하기");
			break;
		default:
			System.out.println("집가");
		}
		
		
	}

}
