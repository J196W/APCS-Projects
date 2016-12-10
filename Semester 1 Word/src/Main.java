public class Main {
	public static void main(String[] args){
		System.out.println("A Semester Writeup of APCS");
		System.out.println("Written in Java\n");
		
		System.out.println("The first project we did was Dice Roll: \n");
		RollTheDie.run();
		
		System.out.println("We quickly moved into a shape generator: \n");
		LoopyRun.begin();
		
		System.out.println("Afterwards, we began Josephus, which took a considerable amount of time:\n");
		Test.run();
		
		System.out.println("\nOnly one project to go, and it also has to do with numbers... it is a hailstone generator:\n");
		StonyHailRunner.run();
		
		System.out.println("That is all we did this semester in APCS, if you exclude all of the PixLab and Magpie, as well as Elevens Lab, which are all not written by me.");
		System.out.println("P.S. This only takes up 318 lines of code.");
	}
}