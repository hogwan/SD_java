package chapter02;

public class AssignTest_03 {

	public static void main(String[] args) {
		//대입연산(assignment)
		int num1=10; //10 리터럴(literal)
		int num2=20;
		
		System.out.println(num1);
		
		num1=num1+num2;
		num2=num2+30;
		System.out.println(num1);
		System.out.println(num2);
		//축약형
		num1+=num2;
		System.out.println(num1);
		
	}
}
