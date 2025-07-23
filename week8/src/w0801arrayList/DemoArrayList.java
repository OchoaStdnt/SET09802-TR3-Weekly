package w0801arrayList;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DemoArrayList {
	public static void main(String[] args) {

		Person p1 = new Person("John", "Edinburgh", 21);
		Person p2 = new Person("Mary", "Glasgow", 21);
		Person p3 = new Person("Fred", "London", 21);
		
		//follow template we get this
		//ArrayList myFriends = new ArrayList();
		
		ArrayList <Person> myFriends = new ArrayList <Person> ();
		
		myFriends.add(p1);
		myFriends.add(p2);
		myFriends.add(p3);
		myFriends.add(p1);//added duplicate object
		
		for(Person tempPerson : myFriends) {
			tempPerson.displayDetails();
		}
	}
}//end class
