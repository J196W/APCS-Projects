import java.util.Scanner;

public class RollTheDie {
	public static void main(String[] args){
		System.out.println("Please input a number to roll the dice.");
		run();
	}
	public static void run(){
		Scanner in = new Scanner (System.in);
		String statement = "";
		statement = in.nextLine();
		try{
		System.out.println(dieRoll(Integer.parseInt(statement)));
		run();
		}catch (Exception e){
			System.out.println("Please input a number");
			run();
		}
	}
	public static String dieRoll(int num){
		num--;
		String returnString = new String();
		String[] dieNum = new String[13];
		for(int i = 0; i < 12; i++){
			dieNum[i] = "";
		}
		for (int i = 0; i <= num; i++){
			int dieOne = (int) (Math.random() * ((6 - 1) + 1));
			int dieTwo = (int) (Math.random() * ((6 - 1) + 1));
			dieNum[dieOne+dieTwo+1] += "*";
		}
		for (int i = 1; i < 12; i++){
			int curNum = i + 1;
			String currentNum = Integer.toString(curNum);
			if (i < 9){
				returnString += currentNum + ":  " + dieNum[i] + "\n";
			}
			else{
				returnString += currentNum + ": " + dieNum[i] + "\n";
			}

		}
		return returnString;
	}
}

