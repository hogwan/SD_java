package chapter06;

public class Student_07 {
	//멤버변수
	public static final int studentID = 1000;
	public String studentName;
	int grade;
	String address;
	
	//기본 생성자
	public Student_07() {
		
	}
	
	public Student_07(String studentName, String address) {
		this.studentName =studentName;
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
}
