import java.util.LinkedList;

public class Song {

	public LinkedList<Note> notes;
	
	public Song(){
		this.notes = new LinkedList<Note>();
	}
	
	public void appendNote(Note n) {
		notes.add(n);
	}
	
}
