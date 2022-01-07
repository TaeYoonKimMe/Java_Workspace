package chapter6;

public class CardTest {
	public static void main(String[] args) {
		CardCompany user1 = CardCompany.getInstance();
		Card user1Card = user1.createCard();
		System.out.println(Card.serialNum);
		
		CardCompany user2 = CardCompany.getInstance();
		Card user2Card = user2.createCard();
		System.out.println(Card.serialNum);
	}

}
