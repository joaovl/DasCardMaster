package GameAbstractFactory;

/**
 * Created by Joao on 06/02/2016.
 */
//CarFactory
//Body createBody
//rerurn carBody
public class GameFactorySueca extends AbstractGameFactory {

    public ICards createCards(){
        return new GameCardsSueca();
    }

    /* TODO - It is required to implement Rules and AI for Abstract factory
    public Rules createRules(){
        return new RulesGame();
    }

    public AI createAI(){
        return new AIGame();
    }*/


}


//public class CarFactory extends AbstractVehicleFactory {
//
//    public Body createBody() {
//        return new CarBody();
//    }
//
//}