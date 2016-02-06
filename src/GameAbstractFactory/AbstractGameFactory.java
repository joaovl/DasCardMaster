package GameAbstractFactory;

/**
 * Created by Joao on 06/02/2016.
 */
//AbstractVehicleFactory
//Body createBody()
public abstract class AbstractGameFactory {
    public abstract ICards createCards();

    public abstract IRules createRules();

    /* TODO - It is required to implement Rules and AI for Each game
    public abstract AI createAI();
     */


}

