package employmentSimulator;

import javax.swing.JOptionPane;

//public class Person implements Comparable<Person>{
public class Person{
	
	private String name;
	private String surname;
	private String address;
	
	public Person () {
		this("unknown", "unknown", "unknown");
	}
	
	public Person (String name, String surname, String address) {
		setName(name);
		setSurname(surname);
		setAddress(address);
	}
	
	public Person(String name, String address) {
		this(name, "unknown", address);
	}
	
	public void displayName() {
		String output = this.name +" " +this.surname;
		JOptionPane.showMessageDialog(null, output, "Person Name", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	/*
	@Override
	public int compareTo(Person other) {
		return this.name.compareTo(other.name);
	}
	*/
}
