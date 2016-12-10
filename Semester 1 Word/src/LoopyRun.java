public class LoopyRun {
	public static void begin(){
		System.out.println(LoopyDiamond.create(LoopyErrorCheck.errorCheck("10")));
		System.out.println(LoopyPyramid.create(LoopyErrorCheck.errorCheck("10")));
		System.out.println(LoopyDiamondOutline.create(LoopyErrorCheck.errorCheck("10")));
		System.out.println(LoopyTriangle.create(LoopyErrorCheck.errorCheck("10")));
		System.out.println(LoopyDiagonalRectangle.create(LoopyErrorCheck.errorCheck("10")));
	}
}