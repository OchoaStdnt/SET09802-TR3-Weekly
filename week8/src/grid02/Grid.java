package grid02;

import java.util.ArrayList;

public class Grid {
	
	private ArrayList <Row> theGrid = new ArrayList <Row> ();
	
	public Grid() {
		Row tempRow;
		
		for(int loop = 1; loop < 5; loop++) {
			tempRow = new Row(loop);
			this.theGrid.add(tempRow);
		}
	}

}
