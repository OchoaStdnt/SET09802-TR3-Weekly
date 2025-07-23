package postOfficeQueueSimulator;

import javax.swing.JOptionPane;

public class PostOfficeQueueSimulator {

	public static void main(String[] args) {
		
		int totalPersons;
		Person p1 = new Person("Agatha", "Morning");
		Person p2 = new Person("Bob", "Star");
		Person p3 = new Person("Angel", "Ochoa");
		Person p4 = new Person("Alex", "Sun");
		Person p5 = new Person("John", "Lost");
		
		PostOffice pOffice = new PostOffice();
		
		pOffice.add(p1);
		pOffice.add(p5);
		pOffice.add(p4);
		pOffice.add(p3);
		pOffice.add(p2);
		
		totalPersons = pOffice.queueLength();
		JOptionPane.showMessageDialog(null, totalPersons, "People in Line", JOptionPane.INFORMATION_MESSAGE);
		pOffice.printQueue();
		pOffice.whoseAt(4);
		pOffice.serve();
		pOffice.whoseAtFront();
		
		totalPersons = pOffice.queueLength();
		JOptionPane.showMessageDialog(null, totalPersons, "People in Line", JOptionPane.INFORMATION_MESSAGE);
		
		

	}

}
