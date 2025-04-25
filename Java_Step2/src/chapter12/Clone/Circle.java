package chapter12.Clone;

public class Circle implements Cloneable {
	
	Point point;
	int radius;
	
	public Circle(Point point, int radius) {
		this.point = point;
		this.radius = radius;
	}
	
	//클래스의 객체 복사
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + "]";
	}
	
	
}
