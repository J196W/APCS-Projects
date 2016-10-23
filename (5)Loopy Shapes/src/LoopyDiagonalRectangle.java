
public class LoopyDiagonalRectangle {
	public static String create(int num){
		String returnString = new String();
		int numStars = num;
		for (int i = 0; i <= num; i++) {
			for (int x = 0; x <= i; x++){
				returnString += " ";
			}
			for (int j = 0; j <= (numStars - 2)*2; j++){
				returnString += "*";
			}
			numStars--;
			returnString += ("\n");
		}
		return returnString;
	}
}
