package week4samples;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ComparingArrays {

	public static void main(String[] args) {
		// variables and arrays
		String output;
		
		int [] array1 = {1, 2, 3, 4, 5, 6};
		int [] array2 = {1, 2, 3, 4, 5, 6};
		
		if(Arrays.equals(array1, array2)) {
			output = "Arrays are equal";
		} else {
			output = "Arrays are not equal";
		}
		
		//print message
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);

	}//end main

}//end class
