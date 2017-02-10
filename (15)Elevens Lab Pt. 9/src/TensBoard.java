import java.util.List;
public class TensBoard extends Board{


	private static final int BOARD_SIZE = 13;
	
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
	
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

	private static final boolean I_AM_DEBUGGING = false;

	public TensBoard() {
		super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	}

	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		switch (selectedCards.size()){
		case 2:
			return containsPairSum13(selectedCards);
		case 4:
			return containsTJQK(selectedCards);
		default:
			return false;
		}
	}

	@Override
	public boolean anotherPlayIsPossible() {
		if (containsPairSum13(cardIndexes()) || containsTJQK(cardIndexes())){
			return true;
		}
		return false;
	}
	
	public boolean containsPairSum13(List<Integer> selectedCards){
		for (int i : selectedCards){
			for (int k : selectedCards){
				int cardA = cardAt(i).pointValue();
				int cardB = cardAt(k).pointValue();
				if (cardA + cardB == 10 && i != k){
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean containsTJQK(List<Integer> selectedCards){
		int total = 0;
		for (int i : selectedCards){
			total += cardAt(i).pointValue();
		}
		if (total == 40 || total == 44 || total == 48 || total == 52){
			return true;
		}
		return false;
	}

}
