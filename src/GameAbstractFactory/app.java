package GameAbstractFactory;

import GameAbstractFactory.Debugger.GameFactoryDebugger;
import GameAbstractFactory.Debugger2.GameFactoryDebugger2;

import java.util.List;

/**
 * Created by Joao on 06/02/2016.
 */
public class app {
    public static void main(String[] args) {
        String whatToMake = "Debugger2";


        AbstractGameFactory factory = null;

        if (whatToMake.equals("Debugger")) {
            factory = new GameFactoryDebugger();
        } else {
            factory = new GameFactoryDebugger2();
        }


        ICards objCards = factory.createCards();
        IRules objRules = factory.createRules();
        IAI objAI = factory.createAI();


        //ask for players
        Player numberOfPlayer = new Player().PlayerCreator(Boolean.FALSE);

        //return X number of players according to the game
        //System need to ask user how many human players are
        //it is required to create AI players for remaining users in order to play the game.


        //I want users to use cards and check if it is a valid play.

        List<Integer> generateCards = objCards.getShuffledCards();
        // assign cards to users


        //AI needs to know which play is this one.
        //THe number of plays per game is responsibility of RULES

        //AI plays accordingly HUMAN or AUTOMATION
        List<Integer> gamePlay = objAI.playGameDebugger(generateCards);

        //During each play checks that rule is valid

        //returns winner
        String printResults = objRules.checkWhoWinnes(gamePlay);

        System.out.println(printResults);

    }
}
