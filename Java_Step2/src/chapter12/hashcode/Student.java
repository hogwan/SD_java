package chapter12.hashcode;

import java.util.Objects;

public class Student {
	int studentId;
	String studentName;

	public Student() {
		
	}
	
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public String toString() {
		return studentId + ", " + studentName;
	}

	@Override
	public int hashCode() {
		return studentId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (studentId == std.studentId) { // 존재하는 id인지 확인
				return true;
			}
		}

		return false;
	}
}
