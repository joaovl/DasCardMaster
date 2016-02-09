package AbstractFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Joao on 05/02/2016.
 */
public class GameSuecaCards implements ICards {

    static final String DESCRIPTION = "This is Sueca card game Class!";


    public String getDescription() {
        return DESCRIPTION;
    }


    public void getCards(){
    }

//    public IGameFactory getCards(){
//        Arrays.toString(shuffle());
//        return test;
//
//    }

    private static final int POINTS_CLUBS       = 0;
    private static final int POINTS_DIAMONDS    = 0;
    private static final int POINTS_SPADES      = 0;
    private static final int POINTS_HEARTS      = 0;
    private static final int POINTS_SPECIAL     = 0;


    public enum Rank
//    { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}
    { TWO, THREE, FOUR, FIVE, SIX, SEVEN, JACK, QUEEN, KING, ACE}

    public enum Suit
    { CLUBS, DIAMONDS, SPADES, HEARTS }

    public static List<Integer> shuffle() {
        List<Integer> array = new ArrayList<>(40);

        for (int i = 1; i <= 40; i++){
            array.add(i);
            System.out.println(array.get(i));
        }
        Collections.shuffle(array);

        return array;
    }

//    private final Rank gameRank;
//    private final Suit gameSuit;

//    Card(Rank rank, Suit suit)
//    {
//        gameRank = rank;
//        gameSuit = suit;
//    }

//    public Rank getRank()
//    {
//        return gameRank;
//    }
//
//    public Suit getSuit()
//    {
//        return gameSuit;
//    }
//
//
//    public int getPoints()
//    {
//        if(gameSuit == Suit.SPADES && gameRank==Rank.QUEEN)
//        {
//            return POINTS_QUEEN_OF_SPADES;
//        }
//        else if(gameSuit == Suit.HEARTS)
//        {
//            return POINTS_HEARTS;
//        }
//        else
//        {
//            return POINTS_OTHERS;
//        }
//    }






}