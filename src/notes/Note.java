package notes;

import java.time.LocalDateTime;

/**
 * the class Note defines a note
 * @author Miguel
 * @version 1.0
 */
public class Note {
    /* Instance variables */
    private String text;
    private String dateCreated;

    /**
     * Constructor for objects of class note
     */
    public Note() {
        this.dateCreated = LocalDateTime.now().toString();
    }

    /**
     * @return The note text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return The date the note was created
     */
    public String getDateCreated() {
        return dateCreated;
    }

    public void setText(String aNote) {
        this.text = aNote;
    }
}
