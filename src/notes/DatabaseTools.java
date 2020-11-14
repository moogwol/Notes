package notes;

import java.sql.*;

public class DatabaseTools {

    String databaseName;

    public DatabaseTools () {
        databaseName = "notes.db";
    }

    /**
     * Makes a connection to SQLite database
     * @return Connection
     */
    private Connection getNewConnection()  {
        Connection conn = null;
        try {
        conn  = DriverManager.getConnection("jdbc:sqlite:" + databaseName);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void createNotesTable() {

        // Connect to the database then get the database object
        Connection db = this.getNewConnection();
        try {
            Statement stmt = db.createStatement();
            String sql = """
                           CREATE TABLE IF NOT EXISTS notes (
                           id INTEGER PRIMARY KEY,
                           note_text TEXT NOT NULL,
                           date_created TEXT NOT NULL
                           );
                         """;

            stmt.execute(sql);
            db.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Takes a note object and inserts its text and date into the notes database table
     * @param aNote a Note object
     */
    public void insertNoteData(Note aNote) {
        // Connect to the database then get the database object
//        this.setDatabase();
        Connection db = this.getNewConnection();
        try {
            /*
            Create an SQLite insert query with with the ability to set the note_text
            and date_created values to arbitrary strings
             */
            String sql = """
                    INSERT INTO notes (note_text, date_created)
                    VALUES (?,?) 
                    ;                                        
                    """;

            PreparedStatement stmt = db.prepareStatement(sql);

            stmt.setString(1, aNote.getText()); // set the note_text string
            stmt.setString(2, aNote.getDateCreated()); //set the date_created string

            stmt.execute(); // execute the prepared statement

            db.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
