package notes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTools {

    Connection database;

    public DatabaseTools () {
        database = null;
    }

    /**
     * Makes a connection to SQLite database
     * @return Connection
     */
    private Connection getNewConnection(String filename)  {
        Connection conn = null;
        try {
        conn  = DriverManager.getConnection("jdbc:sqlite:" + filename);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void setDatabase(String filename) {
        this.database = getNewConnection(filename);
    }

    /**
     *
     * @return Connection
     */
    public Connection getDatabase() {
        return this.database;
    }

    public void createNotesTable() {

        // Connect to the database then get the database object
        this.setDatabase("test.db");
        Connection db = this.getDatabase();
        try {
            Statement stmt = db.createStatement();
            String sql = """
                           CREATE TABLE IF NOT EXISTS notes (
                           id INT PRIMARY KEY,
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
}
