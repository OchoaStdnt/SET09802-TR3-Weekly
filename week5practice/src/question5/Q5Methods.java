package question5;

import java.util.Random;

public class Q5Methods {
	public static String coinToss() {
		//variables
		int num;
		String coinPos;
		Random numGenerator = new Random();
		
		num = numGenerator.nextInt(2); //will give a value of 0 or 1.
		
		//assign head or tails string
		if(num == 0) {
			coinPos = "Tails";
		}
		else {
			coinPos = "Heads";
		}
		
		return coinPos;
	
	}//end coinToss
	
	public static int[] coinCount(int amountOfToss) {
		//variables and arrays
		int[] flipValues = new int[2]; //array position 0 will be tails and array position 1 will be heads
		int num;
		Random numGenerator = new Random();
		
		while(amountOfToss > 0) {
			num = numGenerator.nextInt(2); //toss coin
			
			//add count to array
			if(num == 0) { //tails
				flipValues[0]++;
			}
			else { //heads
				flipValues[1]++;
			}
			
			amountOfToss--;
		}
				
		return flipValues;
	}
}//end Q5Methods


