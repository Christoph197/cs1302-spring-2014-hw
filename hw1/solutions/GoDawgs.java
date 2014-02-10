
/**
 * Homework Assignment 1 - GoDawgs
 * @author YOUR NAME HERE (LAST 3 DIGITS OF 810 NUMBER HERE)
 */
public class GoDawgs {

    /**
     * The main entry point into the program.
     * @param args
     */
    public static void main(String[] args) {
	
	// In the space below, write a program that prints the numbers from 1 to 
	// 100 (both inclusive), but
	// - for multiples of 3 print "Go" instead of the number,
	// - for multiples of 5 print "Dawgs" instead of the number, and
	// - for multiples of both 3 and 5 print "GoDawgs" instead of the number.

	for (int n = 1; n <= 100; n++) {
	    
	    if (n % 3 == 0) {
		System.out.print("Go");
	    } // if

	    if (n % 5 == 0) {
		System.out.print("Dawgs");
	    } // if

	    if ((n % 3 != 0) && (n % 5 != 0)) {
		System.out.print(n);
	    } // if

	    System.out.println();

	} // for
		
    } // main
    
} // GoDawgs
