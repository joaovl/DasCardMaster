package GameAbstractFactory;

import java.util.List;

/**
 * Created by Joao on 06/02/2016.
 */
public class app {
    public static void main(String[] args) {
        String whatToMake = "Debugger";

        AbstractGameFactory factory = null;

        if (whatToMake.equals("Debugger")) {
            factory = new GameFactoryDebugger();
        } else {
            //null;
        }


        ICards objCards = factory.createCards();
//        IRules objRules = factory.createRules();
//        IAI objAI = factory.createAI();


        //I want users to use cards and check if it is a valid play.

        List<Integer> test = objCards.getShuffledCards();
        List<Integer> checkWinner = factory.createAI().playGameDebugger(test);
        String printResults = factory.createRules().checkWhoWinnes(checkWinner);

        System.out.println(printResults);


    }
}
