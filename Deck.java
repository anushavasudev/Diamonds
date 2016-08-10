import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private static ArrayList<Card> deck;
	private static String face;
	
	public void GetDeck(String face){
		deck = new ArrayList<Card>();
		this.face=face;
		for (int i = 2; i < 14; i++) {
			Card obj=new Card(i);
			deck.add(obj);
		}
	}
	
	public void isDiamond(){
		shuffle();
		}
	
	public void shuffle() {
		Collections.shuffle(this.deck);
}
	public int RemoveFrom(int x)
	{
		Card obj=new Card(x);
		deck.remove(obj);
		return obj.getRank();
	}
	public int RemoveDiamond()
	{
		Card obj=new Card(x);
		obj=deck.get(0);
		deck.remove(0);
		return obj.getRank();
	}
	public void PrintDeck()
	{
		for(int i=0;i<deck.size();i++)
			deck.get(i).getStringCard(face);
	}
}
