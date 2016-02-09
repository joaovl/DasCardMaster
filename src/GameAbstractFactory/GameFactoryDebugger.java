package GameAbstractFactory;

/**
 * Created by Joao on 06/02/2016.
 */

public class GameFactoryDebugger extends AbstractGameFactory {

    public ICards createCards(){
        return new GameCardsDebugger();
    }

    public IRules createRules(){
        return new GameRulesDebugger();
    }

    public IAI createAI(){
        return new GameAIDebugger();
    }
}

//CarFactory
//Body createBody
//rerurn carBody