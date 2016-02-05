package game;

public abstract class AbstractDeck {
	protected abstract int cardValue();
	protected abstract String cardName();
	protected abstract int cardSpecial();
	
	
	public final void printCards(){
		cardValue();
		cardName();
		cardSpecial();
	}

}
