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

        //create the game components

        ICards obj = factory.createCards();
        // TODO - implement rules and AI here

        //show what we created:
        System.out.println(obj.getGameCards());
    }
}
