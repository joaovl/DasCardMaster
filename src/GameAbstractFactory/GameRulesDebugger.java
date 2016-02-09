package GameAbstractFactory;

import java.util.List;

/**
 * Created by Joao on 06/02/2016.
 */
public class GameRulesDebugger implements IRules {

    public static final int NUMBER_OF_CARDS = 40;
    public static final int NUMBER_OF_TRICKS = 10;
    public static final int NUMBER_OF_PLAYERS = 4;
    public static final int NUMBER_OF_CARDS_PASSED = 3;
    public static final int MAX_SCORE = 100;
    public static final int CARDS_IN_HAND = 10;

    public String getGameRules() {
        return "Rules for Debugger game created this is CGameRulesBody";
    }


    public String checkWhoWinnes(List<Integer> resultOfPlay){

        if(resultOfPlay.get(0) > resultOfPlay.get(1)) {
            return "Team A is the winner with : " + resultOfPlay.get(0).toString() + " points";
        }
        else if (resultOfPlay.get(0) < resultOfPlay.get(1)) {
            return "Team B is the winner with : " + resultOfPlay.get(1).toString() + " points";
        }
        else {
            return "Team A and B draw with : " + resultOfPlay.get(1).toString() + " points";
        }
    }


    /*
    public String numberOfGamesPerSession() {
        String println = "For Sueca Game only 4 games are allowed per session";
        // TODO Auto-generated method stub
        return println;
    }

    public String numberOfValidPlays() {
        String println = "There is no limit of valid plays. It ends when no cards are available";
        // TODO Auto-generated method stub
        return println;
    }

    public String maxNumberOfPlayers() {
        String println = "An exact number of 4 player can play this game";
        // TODO Auto-generated method stub
        return println;
    }

    public String stopPlayingDurnigSession() {
        String println = "It is not possible to stop this game in ";
        //       + "\n" + "the midle of a session without abort it");
        // TODO Auto-generated method stub
        return println;
    }

    public String specialCardsAllowed() {
        String println = "A special card rule is allowed";
        // TODO Auto-generated method stub
        return println;
    }

    public String cardsValue() {
        String println = "Each card has their own value";
        // TODO Auto-generated method stub
        return println;
    }

    public String gameOrder() {
        String println = "This game starts from left to right";
        // TODO Auto-generated method stub
        return println;
    }

    public String showTotalPoints() {
        String println = "Show your total point Expert, Medium or begginer level";
        // TODO Auto-generated method stub
        return println;
    }

    public String showSessionPoints() {
        String println = "Show session points";
        // TODO Auto-generated method stub
        return println;
    }

    public String showActualPoints() {
        String println = "Show the number of points in the table at each moment";
        // TODO Auto-generated method stub
        return println;
    }

    //this is the template method
    public String printRules() {
        return "all rules Printed";
//        String a = numberOfGamesPerSession();
//        String b = numberOfValidPlays();
//        String c = maxNumberOfPlayers();
//        String d = stopPlayingDurnigSession();
//        String e = specialCardsAllowed();
//        String f = cardsValue();
//        String g = gameOrder();
//        String h = showTotalPoints();
//        String i = showSessionPoints();
//        String j = showActualPoints();
//        return new String(a, b, c, d, e, f, g, h, i, j);

    }
    */

}
