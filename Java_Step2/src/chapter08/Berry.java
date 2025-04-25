package chapter08;

public class Berry extends Fruit_01 {
	private String name;
	private String size;

	public void set2(String name, String size) {
		this.name = name;
		this.size = size;
	}

	public void Disp2() {
		System.out.println("이름 : " + name);
		System.out.println("크기 : " + size);
	}
}
