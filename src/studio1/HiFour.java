package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String nameOne = ap.nextString("What is the first name in your group?");
		String nameTwo = ap.nextString("What is the second name in your group?");
		String nameThree = ap.nextString("What is the third name in your group?");
		String nameFour = ap.nextString("What is the fourth name in your group?");
		//
		// Say hello to the names in s0 through s3.
		//
		System.out.println("Hello, " + nameOne + ", " + nameTwo + ", " + nameThree + ", and " + nameFour + "!");

	}
}
