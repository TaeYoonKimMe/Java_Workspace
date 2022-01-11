package chapter12;

public class Student {
	private String studentId;
	private String studentName;

	public Student(String studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if (this.studentId == s.studentId) {
				return true;
			} else
				return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return studentId + ":" + studentName;
	}

}
