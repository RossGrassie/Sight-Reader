
public class roughWorker {
	public static void main(String[] args) {
		NoteFactory foo= new NoteFactory();
		Song firstSong = new Song();
		firstSong.appendNote(foo.createNote(Pitch.A, Length.Crotchet));
		firstSong.appendNote(foo.createNote(Pitch.C, Length.Minim));
		System.out.println(firstSong.notes.get(0).getPitch());
		System.out.println(firstSong.notes.get(0).getLength());
		System.out.println(firstSong.notes.get(1).getPitch());
		System.out.println(firstSong.notes.get(1).getLength());
	}
}
