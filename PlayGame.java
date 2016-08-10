import java.util.Scanner;

public class PlayGame {

	PlayGame() {
		Deck humanObj = new Deck();
		humanObj.GetDeck("Clubs");

		Deck compObj = new Deck();
		compObj.GetDeck("Hearts");

		Deck diamond = new Deck();
		diamond.GetDeck("Diamond");
		diamond.isDiamond();
	}

	static int ReadDiamond() {
		Card obj=diamond.

	}void

	int HumanMove() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Select your card:");
		int humanRank = reader.nextInt();
		return humanRank;

	}

	void ComputerMove()

	Play()
	{
		
	}

	public static void main()
}
