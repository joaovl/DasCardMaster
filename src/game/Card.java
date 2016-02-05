package game;

public final class Card implements Comparable<Card>
{
	private static final int POINTS_QUEEN_OF_SPADES = 13;
	private static final int POINTS_HEARTS = 1;
	private static final int POINTS_OTHERS = 0;
	
	
	public enum Rank 
	{ TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}
	

	public enum Suit 
	{ CLUBS, DIAMONDS, SPADES, HEARTS }
	
	private final Rank fRank;
	private final Suit fSuit;

	Card(Rank rank, Suit suit)
	{
		fRank = rank;
		fSuit = suit;
	}
	

	public int getPoints()
	{
		if(fSuit == Suit.SPADES && fRank==Rank.QUEEN)
		{
			return POINTS_QUEEN_OF_SPADES;
		}
		else if(fSuit == Suit.HEARTS)
		{
			return POINTS_HEARTS;
		}
		else
		{
			return POINTS_OTHERS;
		}
	}
	

	public Rank getRank()
	{
		return fRank;
	}
	

	public String toCompactString()
	{
		String lReturn = "";
		if(fRank.ordinal()<=Rank.NINE.ordinal())
		{
			lReturn = new Integer(fRank.ordinal() + 2).toString();
		}
		else
		{
			lReturn = fRank.toString().substring(0, 1);
		}
		return lReturn + fSuit.toString().substring(0, 1);
	}
	

	public Suit getSuit()
	{
		return fSuit;
	}
	

	public String toString()
	{
		return fRank + " of " + fSuit;
	}
	

	//Compares two cards according to game rules (rank only, ace high), heart trump.
	public int compareTo(Card card)
	{
		if (getSuit() != card.getSuit())
		{
			return getSuit().ordinal() - card.getSuit().ordinal();
		}
		
		return getRank().ordinal() - card.getRank().ordinal();
	}
	
	//Two cards are equal if they have the same suit and rank.
		//Note that this is different from the behavior of compareTo, 
		//which returns 0 (equal) independently of the suits.
	@Override
	public boolean equals(Object gCards) 
	{
		if(gCards == null)
		{
			return false;
		}
		if(gCards == this)
		{
			return true;
		}
		if(gCards.getClass() != getClass())
		{
			return false;
		}
		return (((Card)gCards).getRank() == getRank()) && (((Card)gCards).getSuit() == getSuit());
	}


	//This is not required for now
	//The hashcode for a card is the suit*13 + that of the rank (perfect hash).
	@Override
	public int hashCode() 
	{
		return getSuit().ordinal() * Rank.values().length + getRank().ordinal();
	}
}
