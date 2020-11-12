package notes;

public class Main {
    public static void main(String[] args) {
//        NoteManager manager = new NoteManager();
//        String noteText = manager.getUserNote();
//        Note newNote = manager.createNote(noteText);
//        manager.storeNote(newNote);
//
//        TextFileWriter writer = new TextFileWriter();
//        writer.writeToFile(manager.getUserNote() + "\n");

        DatabaseTools db = new DatabaseTools();
        db.setDatabase();
        System.out.println(db.getDatabase());
    }
}
