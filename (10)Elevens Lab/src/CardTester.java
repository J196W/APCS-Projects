/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card jackSpade = new Card("Jack", "Spades", 11);
		Card jackHearts = new Card("Jack", "Hearts", 11);
		Card aceDiamonds = new Card("Ace", "Diamonds", 1);
		Card jackSpadesTrue = new Card("Jack", "Spades", 11);
		System.out.println(jackSpade.toString() + "\n" + jackSpade.matches(jackHearts) + "\n" + jackSpade.matches(aceDiamonds) + "\n" + jackSpade.matches(jackSpadesTrue));
		System.out.println(jackHearts.toString() + "\n" + jackHearts.matches(jackSpade) + "\n" + jackHearts.matches(aceDiamonds) + "\n" + jackHearts.matches(jackSpadesTrue));
		System.out.println(aceDiamonds.toString() + "\n" + aceDiamonds.matches(jackSpade) + "\n" + aceDiamonds.matches(jackHearts) + "\n" + aceDiamonds.matches(jackSpadesTrue));
		System.out.println(jackSpadesTrue.toString() + "\n" + jackSpadesTrue.matches(jackSpade) + "\n" + jackSpadesTrue.matches(aceDiamonds) + "\n" + jackSpadesTrue.matches(jackHearts));
	}
}