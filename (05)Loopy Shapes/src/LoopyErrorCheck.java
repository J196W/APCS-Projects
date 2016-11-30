/**|                                                       PLAGERISM CHECKER /p/LoopyShapes                                   |-------------------|------------------|
 * | -------------------------------------------------------------------------------------------------------------------------| username   J196W  | password  ****** |
 * | Created by 1902053                                                                                                       |-------------------|------------------|
 * | Created oa while ago                                                                                                     | [x]remember me                  login|
 * | -------------------------------------------------------------------------------------------------------------------------|--------------------------------------|
 */

public class LoopyErrorCheck {
	public static int errorCheck(String in){
		int correctInt = 0;
		try{
			correctInt = Integer.parseInt(in);
		}
		catch (Exception e){
			correctInt = in.length();
		}
		if (correctInt % 2 != 0){
			correctInt++;
		}
		return correctInt;
	}
}
/** 														  	        	   ___       __ 
                                                                              / / |     / /
                                                                         __  / /| | /| / / 
                                                                        / /_/ / | |/ |/ /  
                                                                        \____/  |__/|__/   
*/