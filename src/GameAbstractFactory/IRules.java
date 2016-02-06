package GameAbstractFactory;

/**
 * Created by Joao on 06/02/2016.
 */
public interface IRules {
    public String getGameRules();
    public void printRules();
    public int numberOfGamesPerSession();
    public int numberOfValidPlays();
    public int maxNumberOfPlayers();
    public boolean stopPlayingDurnigSession();
    public boolean specialCardsAllowed();
    public int cardsValue();
    public boolean gameOrder(); //left to right OR right to left
    public int showTotalPoints();
    public int showSessionPoints();
    public int showActualPoints();
}
