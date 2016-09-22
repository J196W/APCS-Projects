/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		statement = statement.trim();
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("print readme") >= 0){
			response = " Custom MAGPIE build with QWERTY integration."
					 + "\n The whole purpose of this project is to mess with Brogan."
					 + "\n"
					 + "\n To launch QWERTY mode, type \"qwerty\""
					 + "\n To exit QWERTY mode, type \"exit\""
					 + "\n To exit MAGPIE mode, type \"exit\" while in MAGPIE mode. WARNING: THIS WILL CLOSE THE PROGRAM."
					 + "\n"
					 + "\n v0.1 ALPHA"
					 + "\n"
					 + "\n This file is specifically designed for BROGAN to see, and cringe at it's stupidity. And all of the added complexity.";
					
		}
		else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0){
			response = "Tell me more about you pets.";
		}
		else if (statement.indexOf("mr. miller") >= 0){
			response = "He sounds like a good teacher.";
		}
		else if (statement.equals("something")){
			response = "Really, you are going to go there?";
		}
		else if (statement.indexOf("hi") >= 0 
				|| statement.indexOf("hello") >= 0){
			response = "How are you?";
		}
		else if (statement.indexOf("attack helicopter") >= 0
				|| statement.indexOf("girl") >= 0
				|| statement.indexOf("boy") >= 0){
			response = "Are you assuming my gender?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("qwerty") >= 0){
			System.out.println("QWERTY mode engaged");
			InputQwerty.qwertymode();
		}
		else if (statement.equals("")){
			response = "Say something, please.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4){
			response = "I don't understand.";
		}
		else if (whichResponse == 5){
			response = "But why?";
		}
		else if (whichResponse == 6){
			response = "Tell me something I don't know....";
		}

		return response;
	}
}
