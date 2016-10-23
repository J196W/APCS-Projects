
public class LoopyDiamondOutline {
	public static String create(int num){
		String returnString = new String();
		int mid = num / 2;
		int space = new Integer(num - 1);
		int maxNum = new Integer(0);
		for (int i = 0; i <= mid - 1; i++){
			for (int x = 0; x <= space; x++){
				returnString += " ";
			}
			space--;
			returnString += "*";
			if (i != 0){
				maxNum = ((i - 1)*2);
				for (int y = 0; y <= maxNum; y++){
					returnString += " ";
					
				}
				returnString += "*";
			}
			returnString += "\n";
		}
		maxNum+= 2;
		for (int i = 0; i <= mid; i++){
			for (int x = space; x >= 0; x--){
				returnString += " ";
			}
			space++;
			returnString += "*";
			if (i != mid){
				for (int y = maxNum; y >= 0; y--){
					returnString += " ";
				}
				returnString += "*";
			}
			maxNum-=2;
			returnString += "\n";
		}
		return returnString;
	}
}
