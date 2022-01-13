package chapter13.lambda;

public class TestStringConcat {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		StringConcat concat2 = (x, y) -> System.out.println(x + "," + y);
		concat2.makeString(s1, s2);
	}

}
