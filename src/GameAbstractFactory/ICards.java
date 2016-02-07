package GameAbstractFactory;

import java.util.List;

/**
 * Created by Joao on 06/02/2016.
 */
public interface ICards {

    public String getGameCards();
    public String toString();
    public List<Integer> getShuffledCards();
    //public List<Integer> cardsPerPlayer(int player);
    //public int getCards();

}
