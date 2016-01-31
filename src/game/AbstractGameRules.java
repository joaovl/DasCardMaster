package game;

public abstract class AbstractGameRules {
	protected abstract int numberOfGamesPerSession();
	protected abstract int numberOfValidPlays();
	protected abstract int maxNumberOfPlayers();
	protected abstract boolean stopPlayingDurnigSession();
	protected abstract boolean specialCardsAllowed();
	protected abstract int cardsValue();
	protected abstract boolean gameOrder(); //left to right OR right to left
	protected abstract int showTotalPoints();
	protected abstract int showSessionPoints();
	protected abstract int showActualPoints();
	
	
	//this is the template method
	
	public final void printRules(){
		numberOfGamesPerSession();
		numberOfValidPlays();
		maxNumberOfPlayers();
		stopPlayingDurnigSession();
		specialCardsAllowed();
		cardsValue();
		gameOrder(); 
		showTotalPoints();
		showSessionPoints();
		showActualPoints();
		
	}
}
