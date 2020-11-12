package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import notes.Note;
import notes.NoteManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NoteManagerTest {
    private NoteManager manager = new NoteManager(); // create a noteManager object (build phase)

    @Test
    @DisplayName("Note text set correctly")
    void createNoteGetTextTest() {
        Note note = manager.createNote("This is a new note."); // create a new note (operate phase)
        assertEquals("This is a new note.", note.getText()); // (check phase)
    }
}
