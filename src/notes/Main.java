package notes;

public class Main {
    public static void main(String[] args) {
        NoteManager manager = new NoteManager();
        Note newNote = manager.createNote();
        manager.storeNote(newNote);
    }
}
