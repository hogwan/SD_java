package chapter13;

public class GenericValueMain {
	public static void main(String[] args) {
		
		GenericValue<String> v1 = new GenericValue<>();
		v1.setValue("100");
		System.out.println(v1.getValue());
		
		GenericValue<Character> v2 = new GenericValue<>();
		v2.setValue('A');
		System.out.println(v2.getValue());
		
		GenericValue<Integer> v3 = new GenericValue<>();
		v3.setValue(100);
		System.out.println(v3.getValue());
		
		GenericValue<Double> v4 = new GenericValue<>();
		v4.setValue(100.0);
		System.out.println(v4.getValue());
		
	}
}
