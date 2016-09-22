/* Imports the user inputed line into output and prints returned string */
import java.util.Scanner;

public class InputQwerty {
	/* Methods */
	@SuppressWarnings("resource")
	public static void qwertymode() {
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine().toLowerCase();
		while (!statement.equals("exit")){
			System.out.println(Output.printOut(statement));
			statement = in.nextLine();
		}
		System.out.println("Returning to MAGPIE mode.");
		RunMagpie.runMag();
	}
}
