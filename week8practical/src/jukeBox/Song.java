package jukeBox;

import javax.swing.JOptionPane;

public class Song {
	private String name;
	
	public Song() {
		this("unknown");
	}
	
	public Song(String titleName) {
		setName(titleName);
	}
	
	public void songName() {
		//return getName();
		JOptionPane.showMessageDialog(null, getName(), "Song Name", JOptionPane.INFORMATION_MESSAGE);
	}
	
	//getters and setters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
