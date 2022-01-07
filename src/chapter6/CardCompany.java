package chapter6;

public class CardCompany {
	private CardCompany() {}
	
	private static CardCompany instance = new CardCompany();
	
	public static CardCompany getInstance()
	{
		if(instance==null)
			instance = new CardCompany();
		return instance;
	}
	
	Card createCard()
	{
		Card c = new Card();
		return c;
	}
}
