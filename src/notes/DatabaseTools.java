package notes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
}
