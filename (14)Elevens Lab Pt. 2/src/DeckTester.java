
public class DeckTester {
	public static void main (String[] args){
		//Example Test
		String[] ranksA = {"A", "B", "C"};
		String[] suitsA = {"Giraffes", "Lions"};
		int[] valuesA = {2,1,6};
		Deck d = new Deck(ranksA, suitsA, valuesA);
		d.deal();
		System.out.println(d.toString() +"\n");
		
		
		//Size Test
		String[] ranksB = {"jack", "queen", "king"};
		String[] suitsB = {"blue", "red"};
		int[] valuesB = {11, 12, 13};
		d = new Deck(ranksB, suitsB, valuesB);
		
		//Twenty-One Test
		String[] ranksC = {"two", "three", "four", "five", "six", 
				"seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
		String[] suitsC = {"Hearts", "Spades", "Diamond", "Clubs"};
		int[] valuesC = {2,3,4,5,6,7,8,9,10,10,10,10,11};
		d = new Deck(ranksC, suitsC, valuesC);
		
	}
}
