/*
 * Write a program that simulates tossing a coin. The program should display a message to 
 * say whether the coin landed on heads or tails.
 */


/*
 * Modify your solution to the above question so that it tosses the coin 1000 times.
 *  Count the number of times each side of the coin appears and print the results.
 *   You shouldn’t print the result of each individual toss of the coin, you only need to print 
 *   the total number of heads and the total number of tails.
 */
package question5;

import javax.swing.JOptionPane;

public class Question5 {

	public static void main(String[] args) {
		// variables
		String output, coinPos;
		
		coinPos = Q5Methods.coinToss(); //toss coin and return if its heads or tails
		
		//construct output
		output = "Coin tossed and landed on " +coinPos;
		//print result of coin toss
		JOptionPane.showMessageDialog(null, output, "Result of Coin Toss", JOptionPane.INFORMATION_MESSAGE);
		
		//variables for second part
		int coinTossCount = 1000;
		int[] coinCount;
		
		coinCount = Q5Methods.coinCount(coinTossCount);
		
		output = "Coin tossed " +coinTossCount +" times.\n"
				+ "Coin landed on tails " +coinCount[0] +" times.\n"
				+ "Coin landed on heads " +coinCount[1] +" times.";
		
		//print result of coin toss
		JOptionPane.showMessageDialog(null, output, "Result of Coin Toss", JOptionPane.INFORMATION_MESSAGE);
		
		
		
	}//end main

}//end class
