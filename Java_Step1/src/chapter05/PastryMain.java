package chapter05;

public class PastryMain {

	public static void main(String[] args) {

		Pastry_09 bread = new Pastry_09();

		bread.makeBread();
		System.out.println("-------------------------");
		bread.makeBread(5);
		System.out.println("-------------------------");
		bread.makeBread(5, "단팥");
		System.out.println("-------------------------");
		bread.order();
	}

}
