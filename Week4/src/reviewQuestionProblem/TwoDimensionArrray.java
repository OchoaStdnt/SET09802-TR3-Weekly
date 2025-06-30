package reviewQuestionProblem;
import javax.swing.JOptionPane;

public class TwoDimensionArrray {

	public static void main(String[] args) {
		// variables and arrays
		String output;
		int[][] myArray = {
				{2, 3, 4, 5, 34, 23},
				{67, 3, 45, 23, 2, 47}
			};
		
		//can also create with
		//int[][] myArray = new int[2][6];
		
		output = "Contents of the 2D array:\n";
		for(int rowLoop = 0; rowLoop < myArray.length; rowLoop++) {
			for(int colLoop=0; colLoop < myArray[rowLoop].length; colLoop++) {
				output = output +myArray[rowLoop][colLoop] +" ";
			}
			output = output +"\n";
		}
		
		JOptionPane.showMessageDialog(null, output, "contents", JOptionPane.INFORMATION_MESSAGE);
		
	}//end main

}//end class
