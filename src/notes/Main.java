package notes;

public class Main {
    public static void main(String[] args) {
        NoteManager manager = new NoteManager(); // create noteManager object
        String noteText = manager.getUserNote(); // Get some user text input
        Note newNote = manager.createNote(noteText); // Create a Note and set its text value to the user input
//

        DatabaseTools db = new DatabaseTools(); // Create a new database object
        db.createNotesTable(); // creates the motes table if it doesn't already exist
        db.insertNoteData(newNote); // insert the note into the notes table
    }
}
