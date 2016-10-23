
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
