package GameAbstractFactory;

/**
 * Created by Joao on 06/02/2016.
 */
//AbstractVehicleFactory
//Body createBody()
public abstract class AbstractGameFactory {
    public abstract ICards createCards();
    /* TODO - It is required to implement Rules and AI for Each game
    public abstract Rules createRules();
    public abstract AI createAI();
     */


}

//
//public abstract class AbstractVehicleFactory {
//
//    public abstract Body createBody();
//    public abstract Chassis createChassis();
//    public abstract Windows createWindows();
//
//}