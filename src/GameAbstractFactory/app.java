package GameAbstractFactory;

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


        //I want users to use cards and check if it is a valid play.

        List<Integer> generateCards = objCards.getShuffledCards();
        List<Integer> gamePlay = objAI.playGameDebugger(generateCards);
        String printResults = objRules.checkWhoWinnes(gamePlay);

        System.out.println(printResults);


    }
}
