package chapter5.classpart;

public class OrderTest {
	public static void main(String[] args) {
		Order p1 = new Order();
		p1.orderNum = 201803120001L;
		p1.customerID = "abc123";
		p1.date = "2018�� 3�� 12��";
		p1.customerName = "ȫ���";
		p1.productNum = "PD0345-12";
		p1.address = "����� �������� ���ǵ��� 20����";

		System.out.println("�ֹ���ȣ : " + p1.orderNum);
		System.out.println("�ֹ��� ���̵� : " + p1.customerID);
		System.out.println("�ֹ� ��¥ : " + p1.date);
		System.out.println("�ֹ��� �̸� : " + p1.customerName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + p1.productNum);
		System.out.println("��� �ּ� : " + p1.address);

	}

}
