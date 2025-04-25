package chapter12.Clone;

public class ObjectCloneMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(new Point(1,1), 5);
		Circle circleCopy = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(circleCopy);
	
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(circleCopy));
		
		Point point1 = new Point(1,2);
		Point point2 = (Point)point1.clone();

	}
}
