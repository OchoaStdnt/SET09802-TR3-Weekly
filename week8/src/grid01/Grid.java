package grid01;

public class Grid {
	
	//instance variables
	final int ARRAY_WIDTH = 7;
	final int ARRAY_HEIGHT = 6;
	
								//rows			//columns
	int [] [] theGrid = new int[ARRAY_HEIGHT] [ARRAY_WIDTH];
	
	public void display() {
		this.theGrid[3] [2] = 1;
		
		for(int outerLoop  = 0; outerLoop < ARRAY_HEIGHT; outerLoop++) {
			for(int innerLoop = 0; innerLoop < ARRAY_WIDTH; innerLoop++) {
				System.out.print(theGrid[outerLoop] [innerLoop] +" ");
			}//end inner loop
			System.out.println("");
		}//end outer for loop
	}

}
