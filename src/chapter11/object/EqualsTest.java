package chapter11.object;

class Student {
	int studentId;
	String studentName;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentId + ", " + studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student)
		{
			Student s = (Student)obj;
			if(this.studentId == s.studentId)
				return true;
			else 
				return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentId;
	}
	
}

public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100,"�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100,"�̻��");
		
		if(studentLee == studentLee2)
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee�� studentLee2�� �����մϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �ٸ��ϴ�.");
		
		
	}

}
