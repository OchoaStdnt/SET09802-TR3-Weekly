package method7Arrays;

import javax.swing.JOptionPane;

public class Methods7Arrays {

	public static void main(String[] args) {
		// variables
		String output;
		int[] array = {1, 2, 3, 4, 5, 6};

		//print array
		output = "Array contents before call to method:\n";
		
		for(int loop = 0; loop < array.length; loop++) {
			output = output +array[loop] +"   ";
		}
		
		JOptionPane.showMessageDialog(null, output, "Methods 7", JOptionPane.INFORMATION_MESSAGE);
		
		addOneToEachElement(array);
		
		//print array
		output = "Array contents after call to method:\n";
		
		for(int loop = 0; loop < array.length; loop++) {
			output = output +array[loop] +"   ";
		}
		
		JOptionPane.showMessageDialog(null, output, "Methods 7", JOptionPane.INFORMATION_MESSAGE);
		
		
	}//end main
	
	
	public static void addOneToEachElement(int[] anArray) { 	//this does not do a copy it uses the original array and modifies it
		for(int loop = 0; loop < anArray.length; loop++) {
			anArray[loop] = anArray[loop] + 1;
		}
		
	}
	
	

}//end class
