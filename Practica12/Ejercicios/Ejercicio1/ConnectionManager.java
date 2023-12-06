import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/users";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String CREATE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS user (" +
            "id INT AUTO_INCREMENT PRIMARY KEY," +
            "nombre VARCHAR(50) NOT NULL," +
            "apellido VARCHAR(50) NOT NULL)";

    ConnectionManager() throws SQLException, ClassNotFoundException {
        try {
            System.setProperty(DRIVER, "");
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            // Verifies if the 'user' table already exists, and if not, creates it
            try (Statement statement = connection.createStatement()) {
                statement.execute(CREATE_TABLE_QUERY);
            }
            System.out.println("Successful connection");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error connecting to the database");
        }
    }
}
