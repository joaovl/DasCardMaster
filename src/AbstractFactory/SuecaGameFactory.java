
package AbstractFactory;


public class SuecaGameFactory implements IGameFactory {

//    public IRules createRules() {
//        return new GameSuecaRules();
//    }

    public ICards createSuecaCards() {
        return new GameSuecaCards();
    }

//    public I_AI_Game createAI() {
//        return new GameSuecaAI();
//    }

}