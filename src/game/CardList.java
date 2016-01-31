package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A cloneable, bounded, sorted list of cards. The cards are sorted by increasing rank
 * and by suit. Does not support duplicates.
 */
public class CardList implements Cloneable, Iterable<Card>
{
	private List<Card> fCardList;
	private final int fMaxCards;
	
	
	public CardList(int pMaxCards)
	{
		fMaxCards = pMaxCards;
		fCardList = new ArrayList<Card>(fMaxCards);
	}
	

	public int size()
	{
		return fCardList.size();
	}
	

	public boolean isEmpty()
	{
		return fCardList.isEmpty();
	}
	
	
	public Card get(int i)
	{
		return fCardList.get(i);
	}
	
	
	//I need here the result of an object factory
	//HOW??????????
    public static List<Integer> shefull() {
    	List<Integer> array = new ArrayList<>(40);

    	for (int i = 1; i <= 40; i++){ 
    		array.add(i);
    	}
    	Collections.shuffle(array);
    	
    	return array;
    }

	@Override
	public Iterator<Card> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
