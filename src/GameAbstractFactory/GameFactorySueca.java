package GameAbstractFactory;

/**
 * Created by Joao on 06/02/2016.
 */

public class GameFactorySueca extends AbstractGameFactory {

    public ICards createCards(){
        return new GameCardsSueca();
    }

    public IRules createRules(){
        return new GameRulesSueca();
    }

    public IAI createAI(){
        return new GameAISueca();
    }
}

//CarFactory
//Body createBody
//rerurn carBody