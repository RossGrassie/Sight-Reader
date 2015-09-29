
public class Note {
	Pitch pitch;
	Length length;
	
	public Note(Pitch pitch, Length length){
		this.pitch=pitch;
		this.length=length;
	}
	
	public Pitch getPitch(){
		return pitch;
	}
	
	public Length getLength(){
		return length;
	}
}
