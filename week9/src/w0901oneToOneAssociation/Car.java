package w0901oneToOneAssociation;

import javax.swing.JOptionPane;

public class Car {
	
	private String make;
	private String model;
	private String colour;
	
	public Car(String make, String model, String colour) {
		setMake(make);
		setModel(model);
		setColour(colour);
	}
	
	public String toString() {
		String output;
		output = "Make: " +this.make +"\n";
		output = output + "Model: " +this.model +"\n";
		output = output + "Colour : " +this.colour;
		
		return output;
	}
	
	public void displayDetails() {
		String output;

	    output = toString();
	    
	    // display message
	    JOptionPane.showMessageDialog(null, output, "Details of Car", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public String getMake() {
		return this.make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColour() {
		return this.colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}

	
}//end class
