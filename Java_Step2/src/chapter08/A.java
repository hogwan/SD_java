package chapter08;

public class A {
	// 상속전용 -> public 이지만 상속 전용
	// 상속 받지 않은 클래스에서는 사용할 수 없음 즉 private 역할도 있음
	protected String field;
	
	protected void method() {
		System.out.println("A Class");
		System.out.println("field");
	}
}
