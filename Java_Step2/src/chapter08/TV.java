package chapter08;

public class TV extends Appliance{
	public TV(String brand)
	{
		super(brand);
	}

	@Override
	void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	
}
