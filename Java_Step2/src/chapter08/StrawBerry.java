package chapter08;

public class StrawBerry extends Berry {
	private String color;
	private int price;

	public void set3(String color, int price) {
		this.color = color;
		this.price = price;
	}

	public void Disp3() {
		System.out.println("색깔 : " + color);
		System.out.println("가격 : " + price);
	}
}
