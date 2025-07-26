package w0903OneToManyAssociations;

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
		
		output = "Make: " +this.make + "\n";
		output = output + "Model: " + this.model + "\n";
		output = output + "Colour: " +this.colour +"\n";
		
		return output;
	}
	
	public void displayDetails() {
		String output;

	    output = toString();
	    // display message
	    JOptionPane.showMessageDialog(null, output, "Details of Car", JOptionPane.INFORMATION_MESSAGE);
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
}
