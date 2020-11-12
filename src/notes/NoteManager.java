package notes;

import java.util.Scanner;

public class NoteManager {

    /**
     * Creates a new note
     * @return Note
     */
    public Note createNote(String noteText) {
        Note note = new Note(); // create a new Note
        note.setText(noteText); // set the note's text to the user input
        return note;
    }

    /**
     * Prompts the user to enter a new note in the terminal
     * @return String newNote
     */
    public String getUserNote() {
        Scanner scanner = new Scanner(System.in); // create a Scanner object
        System.out.println("Enter new note: "); // prompt the user for input
        return scanner.nextLine();
    }

    /**
     *
     * @param aNote a Note object
     */
    public void storeNote(Note aNote) {
        System.out.println(aNote.getText());
        // TODO: 11/11/2020 write the note's text to a text file
    }
}
