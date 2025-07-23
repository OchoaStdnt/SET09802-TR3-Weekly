package postOfficeQueueSimulator;
import java.util.LinkedList;

public class PostOffice {

	private LinkedList<Person> po= new LinkedList<Person>();
	
	public void add(Person person) {
		this.po.addLast(person);
	}
	
	public void serve() {
		this.po.removeFirst();
	}
	
	public int queueLength() {
		return this.po.size();
	}
	
	public void printQueue() {
		for(Person tempPerson : po) {
			tempPerson.displayName();
		}
	}
	
	public void whoseAt(int y) {
		this.po.get(y).displayName();
	}
	
	public void whoseAtFront() {
		this.po.getFirst().displayName();
	}
}
