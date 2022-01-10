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
		Student studentLee = new Student(100,"이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100,"이상원");
		
		if(studentLee == studentLee2)
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		else
			System.out.println("studentLee와 studentLee2는 다릅니다.");
		
		
	}

}
