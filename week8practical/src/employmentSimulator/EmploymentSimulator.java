package employmentSimulator;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import postOfficeQueueSimulator.Person;

public class EmploymentSimulator {
	
	private static LinkedList<Person> companyEmployees = new LinkedList<Person>();

	public static void main(String[] args) {
		
		Person p1 = new Person("Agatha", "Morning");
		Person p2 = new Person("Bob", "Star");
		Person p3 = new Person("Angel", "Ochoa");
		Person p4 = new Person("Alex", "Sun");
		Person p5 = new Person("John", "Lost");
		
		employ(p1);
		employ(p2);
		employ(p3);
		employ(p4);
		employ(p5);
		
		companySize();
		printEmployees();
		printNextForChop();
		makeRedundant();
		companySize();
		printEmployees();
		

	}//end main
	
	public static void employ(Person p) {
		companyEmployees.addLast(p);
	}
	
	public static void makeRedundant() {
		companyEmployees.removeLast();
	}
	
	public static void printNextForChop() {
		companyEmployees.getLast().displayName();
	}
	
	public static void companySize() {
		JOptionPane.showMessageDialog(null, companyEmployees.size(), "# of company employess", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void printEmployees() {
		String output = "";
		for(Person tempPerson : companyEmployees) {
			//String output = "";
			output = output + tempPerson.getName() +" " +tempPerson.getSurname() +"\n";
			
		}
		JOptionPane.showMessageDialog(null, output, "Employeess", JOptionPane.INFORMATION_MESSAGE);
	}

}//end class
