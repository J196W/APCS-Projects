import java.util.Scanner;


public class Test
{   
     /* 
	 ** Website where I checked my numbers : http://webspace.ship.edu/deensley/mathdl/Joseph.html
     */
    public static void run()
    {   
        int peo = 10;
        int inc = 2;
        CusJos custom = new CusJos(peo);

        System.out.println( "Josephus " + peo + " people, every " + inc + " people die : " + custom.lastPersonStanding(inc));
    }
}