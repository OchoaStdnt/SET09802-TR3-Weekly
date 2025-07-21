package practicalwk7;

import javax.swing.JOptionPane;

public class Person {

	private String name;
	private String address;
	private int age;
	
	public Person() {
	 this("unknown", "unknown", 0);	
	}
	
	public Person(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public Person(String name, int age) {
		this(name, "unknown" , age);
	}
	
	public Person(String name, String address) {
		this(name, address, 0);
	}
	
	public Person(int age) {
		this("unknown", "unknown", age);
	}
	
	
	public String toString() {
		String output = "Person name is " +this.name +" from " +this.address +" and is of age " +this.age +"\n";
		return output;
	}
	
	public void printDetails() {
		String output = toString();
		JOptionPane.showMessageDialog(null, output, "Person Details", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void happyBirthday() {
		this.age = this.age + 1;
	}
}//end Person class
