/**|                                                       PLAGERISM CHECKER /p/Hailstone                                     |-------------------|------------------|
 * | -------------------------------------------------------------------------------------------------------------------------| username   J196W  | password  ****** |
 * | Created by 1902053                                                                                                       |-------------------|------------------|
 * | Created on 11/29/16                                                                                                      | [x]remember me                  login|
 * | -------------------------------------------------------------------------------------------------------------------------|--------------------------------------|
 */
import java.util.ArrayList;

public class StoneHail {
	private ArrayList<Integer> list = new ArrayList<Integer>(); //Contains current hailstone
	private boolean marked = false; //Is true when the current hailstone is the highest
	private int[] highest = new int[2]; //Contains highest data
	private int[] longest = new int[2]; //Contains longest data
	
	public StoneHail(int start, int end){
		for (int i = start; i < end + 1; i++){ 
			getHailstone(i); //Creates the hailstone
			if (list.size() > longest[1]){ //Longest checking
				longest[1] = list.size();
				longest[0] = i;
			}
			if (marked){ //Highest checking
				highest[0] = i;
				marked = false;
			}
			list = new ArrayList<Integer>(); //Clears the hailstone
		}
		System.out.println("Longest : " + longest[1] + " in seed " + longest[0]); //Prints longest data
		System.out.println("Highest : " + highest[1] + " in seed " + highest[0]); //Prints highest data
	}
	
	public int getHailstone(int i){
		list.add(i); //Adds num to current hailstone
		if(i > highest[1]){ //Highest Checking
			highest[1] = i;
			marked = true;
		}
		if (i == 1){ //Checks if hailstone is over
			return 1;
		}
		else if(i % 2 == 0){ //Checks if current number is divisible by 2
			return getHailstone((i/2)); //Here we go again
		}
		else{ //Otherwise
			return getHailstone(((3 * i) + 1)); //Here we go again
		}
	}
}
/** 														  	        	   ___       __
      																		  / / |     / /
 																		 __  / /| | /| / / 
																		/ /_/ / | |/ |/ /  
																		\____/  |__/|__/   
*/