//Version goals at the bottom of code.
package caseStudy;

import javax.swing.JOptionPane;

/**
 * Main Application: Black Jack v1
 * 
 * @author Angel Ochoa
 * @version 1.0 18/07/2025
 */
public class BlackJackv7 {
	
/**
 * Start of Black Jack
 * @param args Command-line arguments
 */
	public static void main(String[] args) {
	
		// define constants
	    final int NUMBER_OF_SUITS = 4;
	    final int CARDS_PER_SUIT = 13;
	    final int MAX_CARDS_PER_HAND = 7;
	    final int TARGET = 21;
	    
		//variables and arrays
		String card;
		int usersResponse;
		int valueOfHand = 0;
		int gameStatus; //1 computer wins, 0 play on, -1 player wins
		String[][] packOfCards = 
			 { {"AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC"},
			   {"AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD"},
			   {"AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH"},
			   {"AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS"}
			 };
	    
	    //Hand Arrays
	    String[] playersHand = new String[MAX_CARDS_PER_HAND];  //default value is null
	    String[] computersHand = new String[MAX_CARDS_PER_HAND];  //default value is null
	    
	 // play
	    deal(packOfCards, NUMBER_OF_SUITS, CARDS_PER_SUIT, playersHand, computersHand);
	    usersResponse = offerUserAnotherGo(playersHand, computersHand, MAX_CARDS_PER_HAND);

	    while (usersResponse == 0 && valueOfHand < TARGET) {
	      // user selects more cards
	      card = pickACard(packOfCards, NUMBER_OF_SUITS, CARDS_PER_SUIT);
	      addToHand(playersHand, card);
	      valueOfHand = getValue(playersHand);
	      if (valueOfHand < TARGET) {
	        usersResponse = offerUserAnotherGo(playersHand, computersHand, MAX_CARDS_PER_HAND);
	      }
	    }

	    gameStatus = gameStatus(playersHand, computersHand, TARGET);
	    while (gameStatus == 0) {
	      // computer picks another card
	      card = pickACard(packOfCards, NUMBER_OF_SUITS, CARDS_PER_SUIT);
	      addToHand(computersHand, card);
	      gameStatus = gameStatus(playersHand, computersHand, TARGET);
	    }
	    
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
		
		String theCard;
		int suit, cardNumber;
		//define constant
		final String EMPTY_VALUE = "empty";
		
		do {
		suit = (int)(Math.random() * numberSuits);
	    cardNumber = (int) (Math.random() * cardsPerSuit);

	    theCard = thePack[suit][cardNumber];
		}while(theCard == EMPTY_VALUE);
	    //remove card from pack
	    thePack [suit][cardNumber] = EMPTY_VALUE;
	    return theCard;
	    
	  }//end pickACard
	
	public static void deal(String[][] thePack, int numberSuits, int cardsPerSuit, String[] playersCards, String[] computersCards) {
	    
		final int CARDS_IN_DEAL = 2;
		
	    for (int cardsDealt = 0; cardsDealt < CARDS_IN_DEAL; cardsDealt++) {
	      playersCards[cardsDealt] = pickACard(thePack, numberSuits, cardsPerSuit);
	      computersCards[cardsDealt] = pickACard(thePack, numberSuits, cardsPerSuit);
	    }
	    
	  } // end deal()
	
	 public static void printGameStatus(String[] playersCards, String[] computersCards, int theTarget) {
		    String output = "Computer ";
		    int playerValue, computerValue;
		    for (int cardsInHand = 0; cardsInHand < computersCards.length; cardsInHand++) {
		      if (computersCards[cardsInHand] != null) {
		        // there is a card so display it
		        output = output + computersCards[cardsInHand] + " ";
		      }
		    }
		    computerValue = getValue(computersCards);
		    output = output + "Value: " + computerValue;


		    output = output + "\nPlayer ";
		    for (int cardsInHand = 0; cardsInHand < playersCards.length; cardsInHand++) {
		      if (playersCards[cardsInHand] != null) {
		        // there is a card so display it
		        output = output + playersCards[cardsInHand] + " ";
		      }
		    }
		    playerValue = getValue(playersCards);
		    output = output + "Value: " + playerValue;
		    if (playerValue > theTarget) {
		      output = output + "   BUST !! Bad Luck \n\nComputer Wins";
		    }
		    if (playerValue <= computerValue) {
		      output = output + "\n\n COMPUTER  WINS";
		    }

		    // display cards
		    JOptionPane.showMessageDialog(null, output, "Current Game Status", JOptionPane.INFORMATION_MESSAGE);

		  } // end printGameStatus()
	 
	 public static int offerUserAnotherGo(String[] playersCards, String[] computersCards, int maxCards) {
		    String output = "Computer ";
		    int value;
		    for (int cardsInHand = 0; cardsInHand < computersCards.length; cardsInHand++) {
		      if (computersCards[cardsInHand] != null) {
		        // there is a card so display it
		        output = output + computersCards[cardsInHand] + " ";
		      }
		    }
		    value = getValue(computersCards);
		    output = output + "Value: " + value;

		   output = output + "\nPlayer ";
		    for (int cardsInHand = 0; cardsInHand < playersCards.length; cardsInHand++) {
		      if (playersCards[cardsInHand] != null) {
		        // there is a card so display it
		        output = output + playersCards[cardsInHand] + " ";
		      }
		    }
		    value = getValue(playersCards);
		    output = output + "Value: " + value;
		    output = output + "\n\nAnother Card?";

		    // display cards
		    return JOptionPane.showConfirmDialog(null, output, "Please Answer", JOptionPane.YES_NO_OPTION);
		  } // end offerUserAnotherGo()
	
	 public static int getValue(String[] cards) {
		    int value = 0;
		    char firstLetter;
		    for (int cardsInHand = 0; cardsInHand < cards.length; cardsInHand++) {
		      if (cards[cardsInHand] != null) {
		        // there is a card so get its value
		        firstLetter = cards[cardsInHand].charAt(0);
		        switch (firstLetter) {
		          case 'A':
		            value = value + 11;
		            break;
		          case '2':
		            value = value + 2;
		            break;
		          case '3':
		            value = value + 3;
		            break;
		          case '4':
		            value = value + 4;
		            break;
		          case '5':
		            value = value + 5;
		            break;
		          case '6':
		            value = value + 6;
		            break;
		          case '7':
		            value = value + 7;
		            break;
		          case '8':
		            value = value + 8;
		            break;
		          case '9':
		            value = value + 9;
		            break;
		          case '1': // ie 10
		          case 'J':
		          case 'Q':
		          case 'K':
		            value = value + 10;
		            break;
		        } // end switch
		      } // end if
		    } // end for
		    return value;
		  } // end getValue()
	
	 public static void addToHand(String[] theHand, String theCard) {
		    for (int loop = 0; loop < theHand.length; loop++) {
		      if (theHand[loop] == null) {
		        // if there is no card at this position
		        theHand[loop] = theCard;
		        break;
		      }
		    }
		  } // addToHand()
	 
	 public static int gameStatus(String [] playersCards, String [] computersCards, int theTarget) {
		    int computerSticksAt = 17;
		    int status = 0; // 1 computer wins, 0 play on, -1 player wins
		    String output = "Computer ";
		    int playerValue, computerValue;

		    // get computers details for dispaying
		    for (int cardsInHand = 0; cardsInHand < computersCards.length; cardsInHand++) {
		      if (computersCards[cardsInHand] != null) {
		        // there is a card so display it
		        output = output + computersCards[cardsInHand] + " ";
		      }
		    }
		    // get value of computers hand
		    computerValue = getValue(computersCards);
		    output = output + "Value: " + computerValue;


		    // get players details for displaying
		    output = output + "\nPlayer ";
		    for (int cardsInHand = 0; cardsInHand < playersCards.length; cardsInHand++) {
		      if (playersCards[cardsInHand] != null) {
		        // there is a card so display it
		        output = output + playersCards[cardsInHand] + " ";
		      }
		    }
		    // get value of players hand
		    playerValue = getValue(playersCards);
		    output = output + "Value: " + playerValue;

		    // check to see if game is over or not
		    if (playerValue > theTarget) {
		      // player has more than 21
		      output = output + "\n\n COMPUTER  WINS";
		      status = 1;
		    }
		    else {
		      // player has 21 or less
		      if (computerValue > theTarget) {
		        // computer has more than 21
		        output = output + "\n\n YOU WIN";
		        status = -1;
		      }
		      else {
		        // neither computer or player has more than 21
		        // check to see if computer wants another card
		        if (computerValue < computerSticksAt) {
		          // play on - another card for the computer
		          status = 0;
		        }
		        else {
		          // compare values to see who has won
		          if (computerValue >= playerValue) {
		            // computer wins
		            output = output + "\n\n COMPUTER  WINS";
		            status = 1;
		          }
		          else {
		            // player wins
		            output = output + "\n\n YOU WIN";
		            status = -1;
		          } // end if/else
		        } // end if/else
		      } // end if/else
		    } // end if/else

		    // display cards
		    JOptionPane.showMessageDialog(null, output, "Current Game Status", 
								JOptionPane.INFORMATION_MESSAGE);

		    return status;
		  } // end gameStatus()
	
}//end class

/*
 * The aim of version 1 is to:
 * 1. represent a pack of playing cards
 * 2. write a method to select a card
 * 3. write a method to display the entire pack of cards
 * 
 * The aim of version 2:
 * to modify the method pickACard() so that it removes the card from the pack 
 * after picking it so as to ensure that the same card is not picked again.
 * We are also going to write a small test routine to convince ourselves that
 * the method is working correctly.
 * 
 * The aim of version 3:
 * 1. Create a “hand” of cards for the computer and for the player.
 * 2. deal the cards.
 * 3. print the current game status to show how things stand after the deal.
 * 
 * The aim of version 4:
 * to also display the value of the cards
 * 
 * The aim of version 5:
 * write one new method to select a card and add it to an existing hand, 
 * modify the method printGameStatus() so that it asks the user if 
 * they want another go and we are also going to modify the method main() 
 * so that we can keep adding new cards to the users hand.
 * 
 * The aim of version 6:
 * the value of your hand can not exceed 21.  The aim of version 6 is to 
 * introduce this and to modify the game so that the user automatically 
 * loses if the value of their hand exceeds 21
 * 
 * The aim of version 7:
 * This is the final part of the game, when the user has a hand of cards 
 * with a value of 21 or below and the computer must decide whether to stick 
 * with the cards it has or to select one or more cards. Notice that 
 * to simulate the real game the computer must not be allowed to see 
 * the value of the players hand.  It must decide to twist or stick without 
 * knowing what the player has.
 */


