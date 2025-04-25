package chapter03.iftest;

import java.util.Scanner;

public class Example01T {

	public static void main(String[] args) {
		// wizard라는 이름과 일치하면 문이 열리고 퀴즈의 답은 fire
		// 문이 열린후 퀴즈의 답은 fire다 퀴즈까지 맞히면 "정답입니다 동굴의 문이 열립니다."
	    // 이름이 일치하지 않으면 "이름이 틀렸습니다. 접근이 거부됩니다"
		// 이름은 일치하였으나 퀴즈의 답이 틀리면 "틀렸습니다. 도망치세요"
				
		String correctName = "wizard";
		String correctAnswer = "fire";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("======비밀동굴======");
		System.out.println("당신의 이름을 입력하세요: ");
		//nextLine(): 한줄전체 입력(공백포함)
		//next(): 문자 단어 하나(공백에서 끊김)
		String name=scan.nextLine();
		
		//equalsIgnoreCase: 대소문자 구분 없이 비교
		if(correctName.equalsIgnoreCase(name)) {
			System.out.println("\n[문지기] 오, 위대한 마법사여. 마지막 관문은 퀴즈로 정해졌소.");
			System.out.println("문제: 불, 물, 바람 중에서 드래곤이 가장 두려워하는 것은?");
			System.out.print("정답을 입력하세요: ");
			String answer = scan.nextLine();
			if(correctAnswer.equalsIgnoreCase(answer)) {
				System.out.println("정답입니다. 동굴의 문이 열립니다. 들어가세요");
			}else {	
				System.out.println("틀렸습니다. 드래곤이 나타납니다. 도망가세요");
			}//in if
		}else {
			System.out.println("이름이 틀렸습니다. 접근할 수 없습니다.");
					
		}//out if
		

	}

}
