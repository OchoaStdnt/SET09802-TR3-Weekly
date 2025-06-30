package week4samples;

import javax.swing.JOptionPane;

public class CopingArrays {

	public static void main(String[] args) {
		// variables and arrays
		String output;
		int[] array1 = {1, 2, 3, 4, 5, 6,};
		int[] array2 = new int[array1.length]; //this is creating the arrray2 with the size of array1 which is 5
		
		//copy array1 into array2
		System.arraycopy(array1, 0, array2, 0, array2.length); //this is a built in copy, the array2.length specifies to copy all. 
		
		//increment array1
		for(int loop = 0; loop < array1.length; loop++) {
			array1[loop] = array1[loop] +1;
		}
		
		//modify array2
		for(int loop = 0; loop < array1.length; loop++) {
			array2[loop] = array2[loop] +99;
		}
		
		//create output for array1
		output = "Array 1:  ";
		for(int loop = 0; loop < array1.length; loop++) {
			output = output +array1[loop] +" ";			
		}
		
		//print message
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
		
		//create output for array2
				output = "Array 2:  ";
				for(int loop = 0; loop < array2.length; loop++) {
					output = output +array2[loop] +" ";			
				}
				
				//print message
				JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);

	}//end main

}//end class
