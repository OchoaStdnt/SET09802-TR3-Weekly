package week4samples;

import javax.swing.JOptionPane;
import java.util.Arrays; //needed for array functions

public class sortingArrays {
	public static void main(String[] args) {
		//variables and arrays
		String output;
		int[] myArray = {11, 23, 762, 4, 12}; //this makes array and assigns integers to 5 "boxes" making the array size "4"
		
		//sort Arrays
		Arrays.sort(myArray);
		
		//create output to check sort
		output = "Array sorted: ";
		for(int loop = 0; loop < myArray.length; loop++) { //myArray.length is 4 size there are 5 variables stored.
			output = output + myArray[loop] +" ";
		}
		
		//print output
		JOptionPane.showMessageDialog(null, output, "Sorted Arrays", JOptionPane.INFORMATION_MESSAGE);
		
		
	}//end main
}//end class

	