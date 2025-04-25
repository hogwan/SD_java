package chapter03.switchtest;

public class SwitchCase_01 {

	public static void main(String[] args) {

		int ranking = 5;
		char medalColor;
		
		// Jump Table 
		switch (ranking) {
		case 1: {
			medalColor = 'G';
			break;
		}
		case 2: {
			medalColor = 'S';
			break;
		}
		case 3: {
			medalColor = 'B';
			break;
		}
		default: {
			medalColor = 'A';
		}
		}// switch
		System.out.println(medalColor);

		System.out.println("----------------------");
		// if문
		char medalC2;

		if (ranking == 1) {
			medalC2 = 'G';
			System.out.println("medalC2");
		} else if (ranking == 2) {
			medalC2 = 'S';
			System.out.println("medalC2");
		} else if (ranking == 3) {
			medalC2 = 'B';
			System.out.println("medalC2");
		} else {
			medalC2 = 'A';
			System.out.println("medalC2");
		}

	}// main

}// class
