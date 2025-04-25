package chapter08;

public class Student extends People {
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn);
		this.studentNo = studentNo;
	}
	
	public String toString()
	{
		return "이름 : " + name + ", 전화번호 : " + ssn + ", 학번 : " + studentNo;
	}
}
