/*
 * Using a class write a method to print the name, address and age of a person, 
 * the method signature is shown.
 * 
 * void printDetails(String, String, int);
 * 
 * Using the same class write a method to print the name and address of a person,
 * the method signature is shown.
 * 
 * void printDetails(String, String);
 * 
 * Add a method to print the name and age.
 * 
 * void printDetails(String,  int);
 * 
 * Can you now add a method to print the address and age? 
 *  If you can, go ahead, if not why not? Demonstrate each of your methods working.
 */

package question8;

public class Question8 {

	public static void main(String[] args) {
		// variables
		String name, address;
		int age;
		
		//will enter the name, address and age to the variables instead of prompting a user to enter them. This is for testing
		name = "John";
		address = "Back of Bush";
		age = 50;
		
		//print name, address and age
		Q8Methods.printDetails(name, address, age);
		
		//print name and address
		Q8Methods.printDetails(name, address);
		
		//print name and age
		Q8Methods.printDetails(name, age);
		
		//print address and age
		Q8Methods.printDetails(age, address);

	}//end main

}//end class
