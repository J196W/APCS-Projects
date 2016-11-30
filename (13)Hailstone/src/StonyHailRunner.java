/**|                                                       PLAGERISM CHECKER /p/Hailstone                                     |-------------------|------------------|
 * | -------------------------------------------------------------------------------------------------------------------------| username   J196W  | password  ****** |
 * | Created by 1902053                                                                                                       |-------------------|------------------|
 * | Created on 11/29/16                                                                                                      | [x]remember me                  login|
 * | -------------------------------------------------------------------------------------------------------------------------|--------------------------------------|
 */

import java.util.Scanner;

public class StonyHailRunner {

	public static void main(String[] args) {
		while(true){
			Scanner in = new Scanner(System.in);
			System.out.println("Input a starting number");
			int start = in.nextInt();
			System.out.println("Input an ending number");
			int end = in.nextInt();
			StoneHail run = new StoneHail(start,end);
			System.out.println();
		}
	}

}
/** 														  	        	   ___       __
  																			  / / |     / /
																		 __  / /| | /| / / 
																		/ /_/ / | |/ |/ /  
																		\____/  |__/|__/   
*/