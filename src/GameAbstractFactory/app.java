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

        int numPlayers = objRules.getMaxNumberOfPlayers();
        System.out.println("Number of valid Players is: " + numPlayers);

        //ask for players
        //TODO - This is hard coded to check that the function is working.
        String test = objRules.checkNumberOfPlayers(4);
        System.out.println(test);

        List<List<Integer>> numberOfPlayer = new Player().PlayerCreator(objRules, objCards);

        //AI plays accordingly HUMAN or AUTOMATION
        List<Integer> gamePlay = objAI.playGame(objRules, numberOfPlayer);

        //returns winner
        String printResults = objRules.checkWhoWinnes(gamePlay);

        System.out.println(printResults);

    }
}
