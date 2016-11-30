/**|                                                       PLAGERISM CHECKER /p/LoopyShapes                                   |-------------------|------------------|
 * | -------------------------------------------------------------------------------------------------------------------------| username   J196W  | password  ****** |
 * | Created by 1902053                                                                                                       |-------------------|------------------|
 * | Created oa while ago                                                                                                     | [x]remember me                  login|
 * | -------------------------------------------------------------------------------------------------------------------------|--------------------------------------|
 */

public class LoopyPyramid {
	public static String create(int num){
		String returnString = new String();
		int space = num + 1;
		for (int i = 0; i <= num; i++){
			for (int x = 0; x <= space; x++){
				returnString += " ";
			}
			for (int y = 0; y <= ((i - 1)*2); y++){
				returnString += "*";
			}
			space--;
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
