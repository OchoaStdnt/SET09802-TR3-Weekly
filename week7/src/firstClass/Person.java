package firstClass;

import javax.swing.JOptionPane;

public class Person {

	private String name;
	private String address;
	private int age;
	
	public Person() { //constructor
		String output;
		output = "The constructor was called";
		 
		//display message
		JOptionPane.showMessageDialog(null, output, "", JOptionPane.INFORMATION_MESSAGE);
		
		 
	}
	
	public String toString() {
		
		String output;
		
		output = "My name is " +this.name +" I live at " +this.address +"\n";
		output = output + "and I am " +this.age +" years old";
		
		return output;
	}
	
	public void printDetails() {
		String output;
		
		output = toString();
		
		//display message
		JOptionPane.showMessageDialog(null, output, "Details of Person", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
		
	}
}//end Person class
