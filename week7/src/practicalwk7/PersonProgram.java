package practicalwk7;

public class PersonProgram {

	public static void main(String[] args) {
		
		//Part 1
		// variables and arrays
		Person p1 = new Person();
		
		p1.printDetails();
		
		
		//Part 2
		Person p2 = new Person("Altair", "Colombia", 307);
		
		p2.printDetails();
		
		Person p3 = new Person();
		p3.setName("Dana");
		p3.setAddress("Paris");
		p3.setAge(56);
		
		p3.printDetails();
		
		//Part 3
		p3.happyBirthday();
		
		p3.printDetails();
		
		//Part 4
		Person[] people = new Person[3];
		
		people[0] = new Person("Alex", "Belize", 35); 
		people[1] = new Person("Martha", "England", 39); 
		people[2] = new Person("John", "Edinburgh", 90); 
		
		for(int loop = 0; loop < 3; loop++) {
			people[loop].printDetails();
		}
		
		//Part 5
		
		
	}//end main

}//end PersonProgram
