/**|                                                       PLAGERISM CHECKER /p/LoopyShapes                                   |-------------------|------------------|
 * | -------------------------------------------------------------------------------------------------------------------------| username   J196W  | password  ****** |
 * | Created by 1902053                                                                                                       |-------------------|------------------|
 * | Created oa while ago                                                                                                     | [x]remember me                  login|
 * | -------------------------------------------------------------------------------------------------------------------------|--------------------------------------|
 */

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
/** 														  	        	   ___       __ 
                                                                              / / |     / /
                                                                         __  / /| | /| / / 
                                                                        / /_/ / | |/ |/ /  
                                                                        \____/  |__/|__/   
*/