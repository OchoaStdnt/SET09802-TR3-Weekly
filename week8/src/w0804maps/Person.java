package w0804maps;

import javax.swing.JOptionPane;

public class Person {
	private String name;
	private String address;
	private int age;
	private String phoneNumber;
	
	public Person() {}
	
	public Person(String name, String address, int age, String phoneNumber) {
		setName(name);
		setAddress(address);
		setAge(age);
		setPhoneNumber(phoneNumber);
	}



	public String toString() {
		String output;
		
		output = "My name is " +this.name + " I am " +this.age +" years old \nand a I live in " +this.address +"\n";
		
		return output;
	}
	
	public void displayDetails() {
		String output;

	    output = toString();
	    // display message
	    JOptionPane.showMessageDialog(null, output, "Details of Person", JOptionPane.INFORMATION_MESSAGE);
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
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
