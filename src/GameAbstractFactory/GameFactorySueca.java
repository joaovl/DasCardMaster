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

    public IRules createRules(){
        return new GameRulesSueca();
    }

    /* TODO - It is required to implement Rules and AI for Abstract factory */
    public IAI createAI(){
        return new GameAISueca();
    }

}
