package chapter4;

public class Q4 {
	public static void main(String[] args) {
		int height = 4;

		for (int i = 0; i < height; i++) {
			for (int j = height - 1 - i; j > 0; j--)
				System.out.print(' ');
			for (int z = 0; z < 2 * i + 1; z++)
				System.out.print('*');
			System.out.println();
		}
	}

}
