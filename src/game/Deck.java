package game;

//Use of object factory
public class Deck 
{
	private final CardList fDeck;

	/**
	 * Creates a new deck of 52 cards, not shuffled.
	 */
	public Deck()
	{
		fDeck = new CardList(Constants.NUMBER_OF_CARDS);
		refillDeck();
	}

	/**
	 * Utility function : Clear and refill deck with all cards.
	 */
	private void refillDeck()
	{
		fDeck.clear();
		for (Card.Suit suit : Card.Suit.values())
		{
			for (Card.Rank rank : Card.Rank.values())
			{
				fDeck.add(new Card(rank, suit));
			}
		}
	}

	/**
	 * Refill and shuffle the deck of cards by randomizing
	 * their order.
	 */
	public void shuffle()
	{
		refillDeck();
		fDeck.shuffle();
	}

	/**
	 * Draws a card from the deck and removes the card from the deck.
	 * @return The card drawn.
	 * @throws EmptyDeckException if called on an empty deck.
	 * @post final.size() == initial.size() - 1 or exception
	 */
	public Card draw()
	{
		return fDeck.remove(0);
	}

	/**
	 * Returns the size of the deck.
	 * @return The number of cards in the deck.
	 */
	public int size()
	{
		return fDeck.size();
	}

	/**
	 * @return Returns true if the deck is empty.
	 */
	public boolean isEmpty()
	{
		return fDeck.isEmpty();
	}
}


//list cards

//shuffling cards

//special cards
//Each card may have a special condition depending which game it is being played.

//	  class Data{
//		  int dia, mês, ano;
//		  Data(int d, int m, int a) { dia=d;mês=m;ano=a;}
//		  static ArrayList<Data> todasAsDatas=new ArrayList<>();
//		  public static Data criaData(int d, int m, int a){ //fábrica de objectos if (data não é válida) return null;
//		  Data nova=new Data(d,m,a);
//		  for(Data d: todasAsDatas)
//		  if(nova.equals(d)) //se a data já está criada return d;
//		  todasAsDatas.add(nova); return d;
//		  }
//		  }
//
//
//
//}
