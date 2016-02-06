package GameAbstractFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Joao on 06/02/2016.
 */
// CarBody implements Body
// String getBodyParts
public class GameCardsSueca implements ICards {

    public String getGameCards() {
        return "Cards for Sueca game created this is CGameCardsBody";
    }


    public List<Integer> getShuffledCards(){
        return shuffle();
    }

    private static final int POINTS_CLUBS       = 0;
    private static final int POINTS_DIAMONDS    = 0;
    private static final int POINTS_SPADES      = 0;
    private static final int POINTS_HEARTS      = 0;
    private static final int POINTS_SPECIAL     = 0;


    public enum Rank
    { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE}


    public enum Suit
    { CLUBS, DIAMONDS, SPADES, HEARTS }

    private Rank cardRank;
    private Suit cardSuit;

    public void Card (Rank rank, Suit suit)
    {
        cardRank = rank;
        cardSuit = suit;
    }

    public Suit getSuit()
    {
        return cardSuit;
    }

    public Rank getRank()
    {
        return cardRank;
    }

    public String toString()
    {
        return cardRank + " of " + cardSuit;
    }


    public static List<Integer> shuffle() {
        List<Integer> array = new ArrayList<>(40);
        for (int i = 1; i <= 40; i++){
            array.add(i);
        }
        Collections.shuffle(array);
        return array;
    }

    public String getSuecaCardName(List<Integer> suecaCardValue){
        return "test";
    }

//    public int getCards(){
//        return 1;
//    }
}