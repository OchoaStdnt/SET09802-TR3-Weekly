package w0901oneToOneAssociation;

import javax.swing.JOptionPane;

public class Person {
	private String name;
	private String address;
	private int age;
	private Car car;
	
	
	public Person() {}
	
	public Person(String name, String address, int age) {
		setName(name);
		setAddress(address);
		setAge(age);
	}

	public String toString() {
		String output;
		
		output = "My name is " +this.name + " I am " +this.age +" years old \nand a I live in " +this.address + "\n";
		if(this.car != null) {
		output = output + this.car.toString();
		}
		
		
		return output;
	}
	
	public void displayDetails() {
		String output;

	    output = toString();
	    
	    // display message
	    JOptionPane.showMessageDialog(null, output, "Details of Person", JOptionPane.INFORMATION_MESSAGE);
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
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


	
	

}
