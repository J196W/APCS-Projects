/* Checks the string for every single character on a qwerty keyboard and removes each matching */
public class Output {
	static String[] alpha = new String[101];
	
	public static String printOut (String statement){
		//Put characters you would like to use
		String output = "abcdefghijklmnopqrstuvwxyz `1234567890-=[]\\;',./~!@#$%^&*()_+{}|:\"<>?";
		int numChar = output.length();
		if (numChar >= 101){
			return "This program has an error. See a programmer for help. \nOUT OF MEMORY, PLEASE LOWER OUTPUT STRING.";
		}
		//Sets strings 
		for (int i = 0; i < numChar; i++){
			alpha[i] = output.substring(i, i+1);
		}
		String out = "";
		//Checks if the letter in the array matches the current letter the code has selected from the input string
		for (int i = 0; i < statement.length(); i++){
			String temp = statement.substring(i, i+1);
			for (int x = 0; x < numChar; x++){
				if (temp.equals(alpha[x])){
					alpha[x] = "";
				}
			}
		}	
		//Output code
		double r = Math.random();
		int whichResponse = (int)(r * numChar);
		for (int i = whichResponse; i < numChar; i++){
			out += alpha[i];
		}
		for (int i = 0; i < whichResponse; i++){
			out+= alpha[i];
		}
		return out;
	}
}
