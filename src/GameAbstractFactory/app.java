package GameAbstractFactory;

import java.util.List;

/**
 * Created by Joao on 06/02/2016.
 */
public class app {
    public static void main(String[] args) {
        String whatToMake = "Sueca";

        AbstractGameFactory factory = null;

        //create the correct 'factory'

        if (whatToMake.equals("Sueca")) {
            factory = new GameFactorySueca();
        } else {
            //null;
        }

        //create other game components

        ICards objCards = factory.createCards();
        //IRules objRules = factory.createRules();


        //I want users to use cards and check if it is a valid play.

        // TODO - implement rules and AI here

        //show what we created:
        List<Integer> test = objCards.getShuffledCards();
        String printResults = factory.createRules().playGameSueca(test);

        System.out.println(printResults);


    }
}
