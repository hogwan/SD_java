package chapter13;

public class GenericContainerMain {
	public static void main(String[] args) {
		// 문자열 아이템을 저장하는 객체
		GenericContainer<String> stringContainer = new GenericContainer<String>(5);
		stringContainer.addItem("Apple");
		stringContainer.addItem("Banana");
		stringContainer.addItem("Cherry");
		stringContainer.printItems();
		
		//타입제한으로 사용 불가능//
//		//String[] StringArray = {"1","2","3","4","5"};
		//stringContainer.sum(StringArray);
		
		// 숫자 아이템을 저장하는 객체
		GenericContainer<Integer> IntegerContainer = new GenericContainer<>(5);
		IntegerContainer.addItem(3);
		IntegerContainer.printItems();
		
		Integer[] IntegerArray = {1,2,3,4,5};
		stringContainer.sum(IntegerArray);
		
		GenericContainer<Double> doubleContainer = new GenericContainer<>(5);
		doubleContainer.addItem(3.0);
		doubleContainer.printItems();
	}
}
