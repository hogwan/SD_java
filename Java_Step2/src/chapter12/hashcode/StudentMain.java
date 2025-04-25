package chapter12.hashcode;

public class StudentMain {
	public static void main(String[] args)
	{
		String a = "909";
		String b = a;
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
	}
}
