
public class TensGUIRunner {
	public static void main(String[] args){
		Board board = new TensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}
