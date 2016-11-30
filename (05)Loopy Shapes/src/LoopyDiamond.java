/**|                                                       PLAGERISM CHECKER /p/LoopyShapes                                   |-------------------|------------------|
 * | -------------------------------------------------------------------------------------------------------------------------| username   J196W  | password  ****** |
 * | Created by 1902053                                                                                                       |-------------------|------------------|
 * | Created oa while ago                                                                                                     | [x]remember me                  login|
 * | -------------------------------------------------------------------------------------------------------------------------|--------------------------------------|
 */

public class LoopyDiamond {
	public static String create(int num){
		num++;
		String returnString = new String();
		int space = num + 1;
		int mid = num / 2;
		int maxSpace = new Integer(0);
		for (int i = 0; i <= mid; i++){
			maxSpace = ((i - 1)*2);
			for (int x = 0; x <= space; x++){
				returnString += " ";
			}
			for (int y = 0; y <= maxSpace; y++){
				returnString += "*";
			}
			space--;
			returnString += "\n";
			
		}
		for (int i = 0; i <= mid + 1; i++){
			returnString += " ";
		}
		for (int i = 0; i <= (mid)*2; i++){
			returnString += "*";
		}
		returnString += "\n";
		for (int i = 0; i < mid; i++){
			for (int x = space; x <= num + 2; x++){
				returnString += " ";
			}
			for (int y = maxSpace; y >= 0; y--){
				returnString += "*";
			}
			space--;
			maxSpace = (maxSpace - 2) ;
			returnString += "\n";
		}
		return returnString;
	}
}
/** 														  	        	   ___       __ 
                                                                              / / |     / /
                                                                         __  / /| | /| / / 
                                                                        / /_/ / | |/ |/ /  
                                                                        \____/  |__/|__/   
*/
