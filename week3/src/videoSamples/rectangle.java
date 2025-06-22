/*
 * the program writes a rectangle in the command line
 * #######
 * #     #
 * #     #
 * #     #
 * #     #
 * #     #
 * #######
 */

package videoSamples;

public class rectangle {

	public static void main(String[] args) {
		// variables
		int numRows = 7;
		int numColumns = 7;
		
		for(int row = 1; row <= numRows; row++) {
			for(int column = 1; column <= numColumns; column++ ) {				
				if(row == 1 || column == 1 || row == numRows || column == numColumns) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}				
			}
				System.out.println();
		}
	}

}