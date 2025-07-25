package addressEbook;

import java.util.TreeMap;

import javax.swing.JOptionPane;

public class AddressEbook {

	private static TreeMap<String, String> addressBook = new TreeMap<String, String>();
	
	public static void main(String[] args) {
		
		go();

	}//end main
	
	public static void addEntry() {
		String name = JOptionPane.showInputDialog("Enter Name");
		String address = JOptionPane.showInputDialog("Enter Address of " +name);
		
		addEntry(name, address);
	}
	
	public static void addEntry(String name, String address) {
		addressBook.put(name, address);
		
	}
	/*
	public static void deleteEntry() { //asks user to enter name to delte
		
		
		String selection = JOptionPane.showInputDialog("Enter Name of Person to delte its address");
		deleteEntry(selection);
	}
	*/
	
	public static void deleteEntry() {
		if (addressBook.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Address book is empty.");
			return;
		}

		// Step 1: Get the list of names (keys)
		Object[] names = addressBook.keySet().toArray(); //converts the set to array

		// Step 2: Show dropdown with names
		String selectedName = (String) JOptionPane.showInputDialog(null, "Select the entry to delete:", "Delete Entry", JOptionPane.PLAIN_MESSAGE, null, names, names[0]);
	
		
		// Step 3: Delete if something was selected
		if (selectedName != null) {
			deleteEntry(selectedName);
			JOptionPane.showMessageDialog(null, selectedName + " was removed.");
		}
	}
	public static void deleteEntry(String key) {
		addressBook.remove(key);
	}
	
	public static void displayContents() {
		String addresses = "";
		for(String contact : addressBook.keySet()) {
			addresses = addresses +contact +"->" +addressBook.get(contact) +"\n";
		}
		JOptionPane.showMessageDialog(null, addresses,"Address in Book", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void go() {
		 int choice;
		 String menu = "Electronic Address Book Menu\n\n"
				 +"1. Add Address\n"
				 +"2. Delete Address\n"
				 +"3. View Addresses\n"
				 +"4. Exit\n\n"
				 +"Enter the number for choice:";
				 
	        do {
	            // Display menu
	            choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
	            

	            
	            // Handle choice
	            switch (choice) {
	                case 1:
	                    addEntry();
	                    break;
	                case 2:
	                    deleteEntry();
	                    break;
	                case 3:
	                    displayContents();
	                    break;
	                case 4:
	                    JOptionPane.showMessageDialog(null, "Bye...", "", JOptionPane.INFORMATION_MESSAGE);
	                    break;
	                default:
	                	JOptionPane.showMessageDialog(null, "Invalid option, Try again", "", JOptionPane.INFORMATION_MESSAGE);
	                    //System.out.println("Invalid option. Try again.");
	            }

	        } while (choice != 4);
	}

}//end class
