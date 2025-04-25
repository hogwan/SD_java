package chapter08;

import java.util.Scanner;

public class Example {

	// Example클래스를 만들고
	// getResult()함수를 정의하세요. 반환형은 정수.
	// 인자 두개(n1, n2)를 받고 -1로 리턴하게 만듭니다.

	// CalPlus클래스를 만들어 CalculatorExam클래스를 상속받으세요.
	// 오버라이딩을 이용하여 CalculatorExam의 getResult()함수를
	// 인자로 받은 n1과 n2를 더해주는 함수로 만듭니다.
	// 물론 리턴값도 -1이면 안되겠죠??

	// CalMinus클래스를 만들어 CalculatorExam클래스를 상속받으세요.
	// 오버라이딩을 이용하여 CalculatorExam의 getResult()함수를
	// 인자로 받은 n1과 n2를 빼주는 함수로 만듭니다.

	// Main에서 실행하여 아래와 같은 결과가 나오면 성공
	// CalPlus : 30
	// CalMinus : 15

	public int getResult(int n1, int n2) {
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Example[] calculators = { new CalPlus(), new CalMinus() };

		System.out.print("정수 A를 입력하세요: ");
		int a = scan.nextInt();

		System.out.print("정수 B를 입력하세요");
		int b = scan.nextInt();

		System.out.println("CalPlus : " + calc(new CalPlus(), a, b));
		System.out.println("CalMinus : " + calc(new CalMinus(), a, b));

		for (Example ex : calculators) {
			System.out.println(ex.getClass().getSimpleName() + " : " + calc(ex, a, b));
		}

	}

	public static int calc(Example c1, int a, int b) {
		return c1.getResult(a, b);
	}
}
