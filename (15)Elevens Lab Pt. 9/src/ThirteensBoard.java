import java.util.List;

public class ThirteensBoard extends Board{
	
	private static final int BOARD_SIZE = 9;

	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0};

	private static final boolean I_AM_DEBUGGING = false;

	public ThirteensBoard() {
		super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	}

	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		switch (selectedCards.size()){
		case 1:
			return containsK(selectedCards);
		case 2:
			return containsPairSum13(selectedCards);
		default:
			return false;
		}
	}

	@Override
	public boolean anotherPlayIsPossible() {
		if (containsPairSum13(cardIndexes()) || containsK(cardIndexes())){
			return true;
		}
		return false;
	}
	
	public boolean containsPairSum13(List<Integer> selectedCards){
		for (int i : selectedCards){
			for (int k : selectedCards){
				int cardA = cardAt(i).pointValue();
				int cardB = cardAt(k).pointValue();
				if (cardA + cardB == 13 && i != k){
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean containsK(List<Integer> selectedCards){
		return cardAt(selectedCards.get(0)).pointValue() == 0;
	}

}
