package notes;

public class NoteManager {
    public Note createNote(String noteText) {
        Note note = new Note();
        note.setText(noteText);
        return note;
    }
}
