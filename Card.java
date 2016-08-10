

public class Card {
	
	private int rank;
	private static int[] rankPoint = {3,3,3,3,3,3,3,3,3,10,10,10,20};
	public Card(int rank)
	{
		this.rank=rank;
	}
	public int getRank()
	{
		return rank;
	}
	public int getPoint()
	{
		if(rank==2 || rank==3 || rank==4 || rank==5 || rank==6 || rank==7 || rank==8 || rank==9 || rank==10)
			return 3;
		if(rank==11 || rank==12 || rank==13)
			return 10;
		if(rank==14)
			return 20;
		return 0;
	}
	public String getStringCard(String face)
	{
		if(rank==2)
			return ("Two of "+face);
		if(rank==3)
			return ("Three of "+face);
		if(rank==4)
			return ("Four of "+face);
		if(rank==5)
			return ("Five of "+face);
		if(rank==6)
			return ("Six of "+face);
		if(rank==7)
			return ("Seven of "+face);
		if(rank==8)
			return ("Eight of "+face);
		if(rank==9)
			return ("Nine of "+face);
		if(rank==10)
			return ("Ten of "+face);
		if(rank==11)
			return ("Jack of "+face);
		if(rank==12)
			return ("Queen of "+face);
		if(rank==13)
			return ("King of "+face);
		if(rank==14)
			return ("Ace of "+face);
				
	}
	
	
}
