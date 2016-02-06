package AbstractFactory;


public abstract class GameFactory {

    private ICards ICards;
//    private IRules IRules;
//    private I_AI_Game I_AI_Game;

    /**
     * Creates kingdom
     */
    public void createGame(final IGameFactory factory) {
        setICards(factory.createSuecaCards());
//        setIRules(factory.createRules());
//        setI_AI_Game(factory.createAI());
    }

    SuecaGameFactory getSuecaGameFactory() {
        return new SuecaGameFactory();
    }


    ICards getCards(final IGameFactory factory) {
        return factory.createSuecaCards();
        //getSuecaGameFactory().createSuecaCards()
    }

    public ICards getICards() {
        return ICards;
    }

    private void setICards(final ICards ICards) {
        this.ICards = ICards;
    }


//    IRules getRules(final IGameFactory factory) {
//        return factory.createRules();
//    }
//
//    public IRules getIRules() {
//        return IRules;
//    }
//
//    private void setIRules(final IRules IRules) {
//        this.IRules = IRules;
//    }
//
//    I_AI_Game getAI(final IGameFactory factory) {
//        return factory.createAI();
//    }
//
//    public I_AI_Game getI_AI_Game() {
//        return I_AI_Game;
//    }
//
//    private void setI_AI_Game(final I_AI_Game i_AI_Game) {
//        this.I_AI_Game = i_AI_Game;
//    }

    /**
     * Program entry point
     *
     * @param args
     *          command line args
     */
    public static void main(String[] args) {

        GameFactory gameFactory = new GameFactory();

        System.out.println("Prepare Sueca Game");
        IGameFactory suecaIGameFactory;

        suecaIGameFactory = gameFactory.getSuecaGameFactory();
        gameFactory.createGame(suecaIGameFactory);

//        suecaIGameFactory obj = new GameSuecaCards.shuffle();




//        System.out.println(gameFactory.getI_AI_Game().getDescription());
//        System.out.println(gameFactory.getIRules().getDescription());
        System.out.println(gameFactory.getICards().getDescription());

//        System.out.println(gameFactory.getICards().getCards());



    }

}