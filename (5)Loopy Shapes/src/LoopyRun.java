/**|                                                       PLAGERISM CHECKER /p/LoopyShapes                                   |-------------------|------------------|
 * | -------------------------------------------------------------------------------------------------------------------------| username   J196W  | password  ****** |
 * | Created by 1902053                                                                                                       |-------------------|------------------|
 * | Created oa while ago                                                                                                     | [x]remember me                  login|
 * | -------------------------------------------------------------------------------------------------------------------------|--------------------------------------|
 */

import java.util.Scanner;

public class LoopyRun {
	public static void main(String[] args){
		System.out.println("Please input diamond, pyramid, diamond outline, upsidedown pyramid, or triangle");
		begin();
	}
	public static void begin(){
		while(true) {
			String define = new String();
			Scanner in = new Scanner (System.in);
			String statement = in.nextLine().toLowerCase().trim();
			switch (statement){
			case "diamond":
				System.out.println("How large do you want the diamond?");
				define = in.nextLine();
				System.out.println(LoopyDiamond.create(LoopyErrorCheck.errorCheck(define)));
				break;
			case "pyramid":
				System.out.println("How large do you want the pyramid");
				define = in.nextLine();
				System.out.println(LoopyPyramid.create(LoopyErrorCheck.errorCheck(define)));
				break;
			case "diamond outline":
				System.out.println("How large do you want the diamond outline");
				define = in.nextLine();
				System.out.println(LoopyDiamondOutline.create(LoopyErrorCheck.errorCheck(define)));
				break;
			case "triangle":
				System.out.println("How large do you want the triangle");
				define = in.nextLine();
				System.out.println(LoopyTriangle.create(LoopyErrorCheck.errorCheck(define)));
				break;
			case "upsidedown pyramid":
				System.out.println("How large do you want the upsidedown pyramid");
				define = in.nextLine();
				System.out.println(LoopyDiagonalRectangle.create(LoopyErrorCheck.errorCheck(define)));
				break;
			default:
				System.out.println("Please input diamond, pyramid, diamond outline, upsidedown pyramid, or triangle");
			}
		}
	}
}
/** 														  	        	   ___       __ 
                                                                              / / |     / /
                                                                         __  / /| | /| / / 
                                                                        / /_/ / | |/ |/ /  
                                                                        \____/  |__/|__/   
*/
