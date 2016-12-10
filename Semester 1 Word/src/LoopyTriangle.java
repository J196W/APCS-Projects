public class LoopyTriangle {
	public static String create(int num){
		String returnString = new String();
		for (int i = 0; i < num; i++){
			for (int x = 0; x <= i; x++){
				returnString += "*";
			}
			returnString += ("\n");
		}
		return returnString;
	}
}