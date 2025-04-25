package chapter12.String;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import chapter12.hashcode.Student;

public class StBufferMain_08 {
	public static void main(String[] args) throws ClassNotFoundException {
		
		StringBuffer buf = new StringBuffer("Nice Day");
		System.out.println(buf);
		System.out.println(buf.length());
		System.out.println(buf.capacity());
		buf.append("sdjisidfjasdiofjoasdfji");
		System.out.println(buf.capacity());
		
		buf.insert(0, "Hi ");
		System.out.println(buf);
		
		buf.insert(12, "EveryBody! ");
		System.out.println(buf);
		
		buf.delete(3, 7);
		System.out.println(buf);
		
		StringBuilder sb = new StringBuilder();
		sb.ensureCapacity(50); //50만큼 용량 할당
		
		Student student = new Student();
		System.out.println(student);
		
		//클래스 정보를 가져오는 객체로 변환
		Class sClass = Class.forName("chapter12.String.StBufferMain_08");
		System.out.println(sClass);
		
		Constructor[] cons1 = sClass.getConstructors();
		for(Constructor c : cons1) {
			System.out.println(c);
		}
		
		Field[] field = sClass.getFields();
		for(Field f : field) {
			System.out.println(f);
		}
		
		Method[] method1=sClass.getMethods();
		for(Method m:method1) {
			System.out.println(m);
		}
		
	}
}
