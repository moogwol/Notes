package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import notes.Note;

public class NoteTest {
    private Note note = new Note();
    String message = "This is a test note";

    @Test
    @DisplayName("Should return the note's text")
    void text() {
        note.setText(message);
        assertEquals("This is a test note", note.getText());
  }
}
