package addressEbook;

import javax.swing.JOptionPane;

public class Person {

	private String name;
	private String surname;
	
	public Person () {
		this("unknown", "unknown");
	}
	
	public Person (String name, String surname) {
		setName(name);
		setSurname(surname);
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
}
