package chapter5.classpart;

public class OrderTest {
	public static void main(String[] args) {
		Order p1 = new Order();
		p1.orderNum = 201803120001L;
		p1.customerID = "abc123";
		p1.date = "2018년 3월 12일";
		p1.customerName = "홍길순";
		p1.productNum = "PD0345-12";
		p1.address = "서울시 영등포구 여의도동 20번지";

		System.out.println("주문번호 : " + p1.orderNum);
		System.out.println("주문자 아이디 : " + p1.customerID);
		System.out.println("주문 날짜 : " + p1.date);
		System.out.println("주문자 이름 : " + p1.customerName);
		System.out.println("주문 상품 번호 : " + p1.productNum);
		System.out.println("배송 주소 : " + p1.address);

	}

}
