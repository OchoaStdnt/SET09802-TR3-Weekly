//Version goals at the bottom of code.
package caseStudy;

import javax.swing.JOptionPane;

/**
 * Main Application: Black Jack v1
 * 
 * @author Angel Ochoa
 * @version 1.0 18/07/2025
 */
public class BlackJackv1 {
	
/**
 * Start of Black Jack
 * @param args Command-line arguments
 */
	public static void main(String[] args) {
	
		//variables and arrays
		String windowTitle = "Black Jack";
		String card;
		String[][] packOfCards = 
			 { {"AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC"},
			   {"AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD"},
			   {"AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH"},
			   {"AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS"}
			 };
		
	    // define constants
	    final int NUMBER_OF_SUITS = 4;
	    final int CARDS_PER_SUIT = 13;
			    
		 // print pack
		printPack(packOfCards, NUMBER_OF_SUITS, CARDS_PER_SUIT);

	    // select and display a card
	    card = pickACard(packOfCards, NUMBER_OF_SUITS, CARDS_PER_SUIT);
	    JOptionPane.showMessageDialog(null, card, windowTitle, JOptionPane.INFORMATION_MESSAGE);

	}//end main

	/**
	 * Prints the entire Pack of Cards
	 * @param thePack the String array representing the pack of cards
	 * @param numberSuits The number of suites in the pack
	 * @param cardsPerSuit the number of cards per suit
	 */
	public static void printPack(String[][] thePack, int numberSuits, int cardsPerSuit) {
		
	    String output = "";

	    for (int suitloop = 0; suitloop < numberSuits; suitloop++) {
	      for (int cardloop = 0; cardloop < cardsPerSuit; cardloop++) {
	        output = output + thePack[suitloop] [cardloop] + "  ";
	      }
	    output = output + "\n";
	    }
	    // display cards
	    JOptionPane.showMessageDialog(null, output, "All Cards", JOptionPane.INFORMATION_MESSAGE);
	    
	  }//end printPack
	
	/**
	 * Selects a random card from the pack and returns the value
	 * @param thePack String array containing the cards
	 * @param numberSuits The number of suites in the pack
	 * @param cardsPerSuit The number of cards per suit
	 * @return A random card from the pack
	 */
	public static String pickACard(String[][] thePack, int numberSuits, int cardsPerSuit) {
		
		int suit = (int)(Math.random() * numberSuits);
	    int cardNumber = (int)(Math.random() * cardsPerSuit);

	    String theCard = thePack[suit][cardNumber];
	    return theCard;
	    
	  }//end pickACard
	
	
	
	
	
	
	
}//end class

/*
 * The aim of version 1 is to:
 * 1. represent a pack of playing cards
 * 2. write a method to select a card
 * 3. write a method to display the entire pack of cards
 * 
 * 
 */

