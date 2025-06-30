package week4samples;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class SearchingArrrays {

	public static void main(String[] args) {
		//variables and arrays
		String output, keyAsString;
		int [] myArray = {8, 3, 2, 7, 5}; //array size is 4
		int key, search;
		
		//ask user to enter an integer
		keyAsString = JOptionPane.showInputDialog("Please enter an integer");
		key = Integer.parseInt(keyAsString);
		
		//sort array. always good to sort an array before searching
		Arrays.sort(myArray);
		
		//search the array
		search = Arrays.binarySearch(myArray, key); //this is saying search for key in myArray and if it exists give a positive number to search
		
		//check to see if the key was found
		if(search >= 0) {
			output = key +" found in array";
		} else {
			output = key +" not found in array";
		}
		
		//print message
		JOptionPane.showMessageDialog(null, output, "Array", JOptionPane.INFORMATION_MESSAGE);
		
		
		

	}//end main
}//end class
