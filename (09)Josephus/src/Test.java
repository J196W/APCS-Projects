/**|                                                       PLAGERISM CHECKER /p/Josephus                                      |-------------------|------------------|
 * | -------------------------------------------------------------------------------------------------------------------------| username   J196W  | password  ****** |
 * | Created by 1902053                                                                                                       |-------------------|------------------|
 * | Created a while ago                                                                                                      | [x]remember me                  login|
 * | -------------------------------------------------------------------------------------------------------------------------|--------------------------------------|
 */

import java.util.Scanner;


public class Test
{   
     /* 
	 ** Website where I checked my numbers : http://webspace.ship.edu/deensley/mathdl/Joseph.html
     */
    public static void main( String [] args )
    {   
    	//Testers
        Josephus joe = new Josephus(43);
        Josephus thirty = new Josephus(30);
        Josephus ten = new Josephus(10);
        
        //Custom with user input
        Scanner in = new Scanner (System.in);
        System.out.println("Select number of people in the ring");
        int peo = in.nextInt();
        System.out.println("Select increment of people that die");
        int inc = in.nextInt();
        CusJos custom = new CusJos(peo);
        
        //Testers
        System.out.println( "Josephus 43 people, every 5th dies, last left 31 : " + joe.lastPersonStanding( 5 ) );  
        System.out.println( "Josephus 30 people, every 2nd dies, last left 29 : " + thirty.lastPersonStanding( 2 ) );
        System.out.println( "Josephus 10 people, every 10th dies, last left 8 : " + ten.lastPersonStanding( 10 ) );
        
        //Custom with user input
        System.out.println( "Josephus " + peo + " people, every " + inc + " people die : " + custom.lastPersonStanding(inc));
    }
}
/** 														  	        	   ___       __
                                                                              / / |     / /
                                                                         __  / /| | /| / / 
                                                                        / /_/ / | |/ |/ /  
                                                                        \____/  |__/|__/   
*/