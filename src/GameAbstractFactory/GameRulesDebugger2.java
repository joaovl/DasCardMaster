package GameAbstractFactory;

import java.util.List;

/**
 * Created by Joao on 08/02/2016.
 */
public class GameRulesDebugger2 implements IRules {

    public static final int NUMBER_OF_CARDS = 40;
    public static final int NUMBER_OF_TRICKS = 10;
    public static final int NUMBER_OF_PLAYERS = 4;
    public static final int NUMBER_OF_CARDS_PASSED = 3;
    public static final int MAX_SCORE = 100;
    public static final int CARDS_IN_HAND = 10;

    public String getGameRules() {
        return "Rules for Debugger2";
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

}
