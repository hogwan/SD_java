package chapter08;

public class Washer extends Appliance {
	public Washer(String brand) {
		super(brand);
	}

	@Override
	void turnOn() {
		System.out.println("세탁기를 작동시킵니다.");
	}

	@Override
	void turnOff() {
		System.out.println("세탁기를 끕니다.");
	}
	
	
}
