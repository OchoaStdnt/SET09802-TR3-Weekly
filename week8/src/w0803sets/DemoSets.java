package w0803sets;

import java.util.HashSet;
import java.util.TreeSet;


public class DemoSets {
	public static void main(String[] args) {
		Person p1 = new Person("Fred", "Edinburgh", 21);
		Person p2 = new Person("Mary", "Glasgow", 21);
		Person p3 = new Person("David", "Livingston", 21);
		
		//two types of set hashset & treeset
		HashSet <Person> myFriends = new HashSet <Person> ();
		//TreeSet <Person> myFriends = new TreeSet <Person> ();
		
		myFriends.add(p1);
		myFriends.add(p2);
		myFriends.add(p3);
		
		if(myFriends.add(p1)) {
			System.out.println("Object added");
		} else {
			System.out.println("Object NOT added");
		}
		
		
		for(Person tempPerson : myFriends) {
			tempPerson.displayDetails();
		}
		
	}
}//end class
