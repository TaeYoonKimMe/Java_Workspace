package chapter10;

public class HeapSort implements Sort {
	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort descending");
	}

	@Override
	public void description() {
		System.out.println("���ڸ� �����ϴ� �˰������Դϴ�.");
		System.out.println("HeapSort�Դϴ�.");
	}
}