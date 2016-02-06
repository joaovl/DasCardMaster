package GameAbstractFactory;

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
        IRules objRules = factory.createRules();
        ICards obj2 = factory.createCards();
//        ICards obj3 = factory.createCards();
//        ICards obj4 = factory.createCards();

        // TODO - implement rules and AI here

        //show what we created:
        System.out.println(objCards.getGameCards());
        System.out.println(objCards.getShuffledCards().subList(0,10));
        System.out.println(objRules.getGameRules());

        System.out.println(objRules.maxNumberOfPlayers());
        System.out.println(objRules.gameOrder());


        System.out.println(obj2.getShuffledCards().subList(10,20));
//        System.out.println(obj3.getShuffledCards().subList(20,30));
//        System.out.println(obj4.getShuffledCards().subList(30,40));
    }
}
