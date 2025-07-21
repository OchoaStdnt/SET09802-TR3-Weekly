package practicalwk7;

import javax.swing.JOptionPane;

public class Rectangle {

	private int height;
	private int width;
	private static int constructorCounts = 0; //static is used so that each time the class is used with a constucter a count is kept
	
	public Rectangle() {
		this(1,1);
	}
	
	/**
	 * Main constructor
	 * @param height sets value given
	 * @param width sets value given
	 */
	public Rectangle(int height, int width) {
		setHeight(height);
		setWidth(width);
		this.constructorCounts++;
	}
	
	public boolean isSquare() {
		if(this.height == this.width) {
			return true;
		}else {
			return false;
		}
	}//end isSquare()
	
	public void increaseHeightBy(int aY) {
		//this.height = this.height + aY;
		setHeight(this.height + aY);
	}//end increaseHeightBy()

	public void increaseWidthBy(int anX) {
		//this.width = this.width + anX;
		setWidth(this.width + anX);
	}
	
	public void increaseBy(int aValue) {
		setHeight(this.height + aValue);
		setWidth(this.width + aValue);
	}
	
	public int getArea() {
		int area = this.height * this.width;
		return area;
	}
	
	public int getPerimeter() {
		int perimeter = 2 * (this.height + this.width);
		return perimeter;
	}
	
	public void displayDetails() {
		String output;
		if(isSquare() == true) {
		output = "The area of the square is " +getArea() +"\n"
				+ "The perimieter of the square is " +getPerimeter() +"\n";
		}else {
		output = "The area of the rectangle is " +getArea() +"\n"
				+ "The perimieter of the rectangle is " +getPerimeter() +"\n";
		}
		
		output = output + "Constructor has been used " +Rectangle.constructorCounts +" Time/s";
		JOptionPane.showMessageDialog(null, output);
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWith() {
		return this.width;
	}
	
	
	
	
	
}//end Rectangle Class
