package gameFactory;

/**
 * Created by Joao on 05/02/2016.
 */
public class CardsCardsSueca implements ICardsSueca {
    static final String DESCRIPTION = "This is cards for Sueca!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    public void ListDeckCards(){
        System.out.println("List all Sueca cards");
    }
}
