package notes;

public class Main {
    public static void main(String[] args) {
        NoteManager manager = new NoteManager();
        Note note = manager.createNote("This is a new note");
        System.out.println(note.getText());
        System.out.println(note.getDateCreated());
    }
}
