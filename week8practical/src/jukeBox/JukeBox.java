package jukeBox;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JOptionPane;

public class JukeBox {
	private static LinkedList<Song> playList = new LinkedList<Song>(); //array list can have duplicats
	
	public static void main(String[] args) {
		
		ArrayList<Song> songs = new ArrayList<Song>();
		
		songs.add(new Song("No more Tears"));
		songs.add(new Song("Crazy Train"));
		songs.add(new Song("Dreamer"));
		songs.add(new Song("Paranoid"));
		songs.add(new Song("Straight to Hell"));
		songs.add(new Song("Changes"));
		
		printPlayList();
		play();
		addSongs(songs);
		printPlayList();
		play();
		printPlayList();
		addSong(songs.get(0)); //adds no more tears from the songs arrayList
		printPlayList();
		play();
		play();
		printPlayList();

	}//end main

	public static void addSong(Song song) {
		playList.add(song);
	}
	
	public static void play() {
		if(playList.size() != 0) {
		JOptionPane.showMessageDialog(null, playList.getFirst().getName(), "Playing Song", JOptionPane.INFORMATION_MESSAGE);
		playList.removeFirst();
		} else {
			JOptionPane.showMessageDialog(null, "No songs in playlist", "Empty playlist", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public static void printPlayList() {
		if(playList.size() != 0) {
		String songsInQueue ="Playlist Size: " +size() +"\n";
		for(Song tempSong : playList) {
			songsInQueue = songsInQueue + tempSong.getName() +"\n";
			}
		
		JOptionPane.showMessageDialog(null, songsInQueue, "Current Playlist", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "No songs in playlist", "Empty playlist", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public static int size() {
		return playList.size();
	}
	
	
	public static void addSongs(Collection<Song> songs) {
		playList.addAll(songs);
	}
	
}//end class
