package chapter13;

public class CalcTest {
	public static void main(String[] args) {
		Calc c = (n1, n2) -> n1 + n2;
		System.out.println(c.add(10, 20));
	}

}
