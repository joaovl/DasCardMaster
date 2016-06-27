//package gameFactory;
//
//
///**
// * Created by Joao on 05/02/2016.
// */
//public class mainCards {
//
//    private CardsCardsSueca card;
//    //private IRules castle;
//    //private I_AI_Game army;
//
//    /**
//     * Creates kingdom
//     */
//    public void createSuecaCards(final IGameFactory factory) {
//        setCards(factory.createSuecaCards());
////        setCastle(factory.createRules());
////        setArmy(factory.createAI());
//    }
//
//    SuecaGameFactory getElfKingdomFactory() {
//        return new SuecaGameFactory();
//    }
//
//    /*OrcKingdomFactory getOrcKingdomFactory() {
//        return new OrcKingdomFactory();
//    }
//
//    ICards getICards(final IGameFactory factory) {
//        return factory.createSuecaCards();
//    }*/
//
//    public Card getCard() {
//        return Card;
//    }
//
//    private void setKing(final ICards king) {
//        this.king = king;
//    }
//
//    IRules getIRules(final IGameFactory factory) {
//        return factory.createRules();
//    }
//
//    public IRules getIRules() {
//        return castle;
//    }
//
//    private void setCastle(final IRules castle) {
//        this.castle = castle;
//    }
//
//    I_AI_Game getI_AI_Game(final IGameFactory factory) {
//        return factory.createAI();
//    }
//
//    public I_AI_Game getI_AI_Game() {
//        return army;
//    }
//
//    private void setArmy(final I_AI_Game army) {
//        this.army = army;
//    }
//
//    /**
//     * Program entry point
//     *
//     * @param args
//     *          command line args
//     */
//    public static void main(String[] args) {
//
//        GameFactoryDebugger app = new GameFactoryDebugger();
//
//        System.out.println("Elf AbstractFactory");
//        IGameFactory elfKingdomFactory;
//        elfKingdomFactory = app.getElfKingdomFactory();
//        app.createGame(elfKingdomFactory);
//        System.out.println(app.getI_AI_Game().getDescription());
//        System.out.println(app.getIRules().getDescription());
//        System.out.println(app.getICards().getDescription());
//
//        System.out.println("\nOrc AbstractFactory");
//        IGameFactory orcKingdomFactory;
//        orcKingdomFactory = app.getOrcKingdomFactory();
//        app.createGame(orcKingdomFactory);
//        System.out.println(app.getI_AI_Game().getDescription());
//        System.out.println(app.getIRules().getDescription());
//        System.out.println(app.getICards().getDescription());
//
//    }
//
//}
