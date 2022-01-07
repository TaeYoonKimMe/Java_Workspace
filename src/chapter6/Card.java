package chapter6;

public class Card {
	public static int serialNum = 0;
	private int cardNum;
	
	public Card()
	{
		serialNum++;
		cardNum = serialNum;
	}
}
