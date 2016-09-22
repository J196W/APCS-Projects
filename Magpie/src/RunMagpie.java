/* Runs Magpie Input and Output */
import java.util.Scanner;
public class RunMagpie {
	/* Methods */
	@SuppressWarnings("resource")
	public static void runMag(){
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine().toLowerCase();
		
		while (!statement.equals("exit"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
		System.out.println("Goodbye");
		System.exit(0);
	}
}
