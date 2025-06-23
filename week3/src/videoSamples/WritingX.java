/*
 * the program writes a rectangle in the command line
 * #     #
 *  #   #
 *   # #
 *    #
 *   # #
 *  #   #
 * #     # 
 * 
 * 1st row: the 1st and the 7th column is #
 * 2nd row: the 2nd and the 6th column is #
 * 3rd row: the 3rd and the 5th column is #
 * 4th row: the 4th and the 4th column is #
 * 5th row: the 3rd and the 5th column is #
 * 6th row: the 2nd and the 6th column is #
 * 7th row: the 1st and the 7th column is #
 */

package videoSamples;

public class WritingX {

	public static void main(String[] args) {
		// variables
		int numRows = 7;
		int numCols = 7;
		
		for(int row = 1; row <= numRows; row++) {
			
			int position2 = numCols - row + 1; //starting value is 7, this is for the position that goes in the direction /
			// the other direction which uses "row" is moving in the direction \
			for(int column = 1; column <= numCols; column++ ) {
				
				if(column == row || column == position2) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}	
				
			}
				System.out.println();
				
				
		}
		
	}

}
