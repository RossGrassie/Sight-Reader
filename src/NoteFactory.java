
public class NoteFactory {
	public Note createNote(Pitch pitch, Length length){
		Note retNote = new Note(pitch, length);
		return retNote;
	}
}
