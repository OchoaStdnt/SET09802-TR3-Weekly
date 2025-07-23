package w0804maps;

import java.util.TreeMap;

public class DemoMaps {
	public static void main(String[] args) {

		Person p1 = new Person("Fred", "Edinburgh", 21, "079992");
		Person p2 = new Person("Mary", "Glasgow", 22, "079456");
		Person p3 = new Person("David", "Livingston", 23, "073456");
		
		TreeMap <String, String> phoneBook = new TreeMap <String, String> ();
		
		phoneBook.put(p1.getName(), p1.getPhoneNumber());
		phoneBook.put(p2.getName(), p2.getPhoneNumber());
		
		System.out.println(phoneBook.get("Fred"));
		
	}//end main
}//end class
