package grid02;

public class Square {
	
	private int number;
	private boolean empty;
	private Disc theDisc;
	
	public Square(int number) {
		setNumber(number);
		setEmpty(true);
	}
	
	public void addDisc(Disc theDisc) {
		this.theDisc = theDisc;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	
	///likewise for the rest

}
