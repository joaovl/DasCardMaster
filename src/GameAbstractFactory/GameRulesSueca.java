package GameAbstractFactory;

/**
 * Created by Joao on 06/02/2016.
 */
public class GameRulesSueca implements IRules {

    public static final int NUMBER_OF_CARDS = 40;
    public static final int NUMBER_OF_TRICKS = 10;
    public static final int NUMBER_OF_PLAYERS = 4;
    public static final int NUMBER_OF_CARDS_PASSED = 3;
    public static final int MAX_SCORE = 100;
    public static final int CARDS_IN_HAND = 10;

    public String getGameRules() {
        return "Rules for Sueca game created this is CGameRulesBody";
    }


    @Override
    public int numberOfGamesPerSession() {
        //System.out.println("For Sueca Game only 4 games are allowed per session");
        // TODO Auto-generated method stub
        return 30;
    }

    @Override
    public int numberOfValidPlays() {
        //System.out.println("There is no limit of valid plays. It ends when no cards are available");
        // TODO Auto-generated method stub
        return 30;
    }

    @Override
    public int maxNumberOfPlayers() {
        //System.out.println("An exact number of 4 player can play this game");
        // TODO Auto-generated method stub
        return NUMBER_OF_PLAYERS;
    }

    @Override
    public boolean stopPlayingDurnigSession() {
        //System.out.println("It is not possible to stop this game in "
         //       + "\n" + "the midle of a session without abort it");
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean specialCardsAllowed() {
        //System.out.println("A special card rule is allowed");
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int cardsValue() {
        //System.out.println("Each card has their own value");
        // TODO Auto-generated method stub
        return 5;
    }

    @Override
    public boolean gameOrder() {
        //System.out.println("This game starts from left to right");
        // TODO Auto-generated method stub
        return false;
    }

    public int showTotalPoints() {
        //System.out.println("Show your total point Expert, Medium or begginer level");
        // TODO Auto-generated method stub
        return 6;
    }

    public int showSessionPoints() {
        //System.out.println("Show session points");
        // TODO Auto-generated method stub
        return 7;
    }

    public int showActualPoints() {
        //System.out.println("Show the number of points in the table at each moment");
        // TODO Auto-generated method stub
        return 8;
    }

    //this is the template method
    public void printRules(){
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