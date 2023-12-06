import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DatabaseRequests {
    private ConnectionManager connectionManager;

    DatabaseRequests() throws SQLException, ClassNotFoundException {
        connectionManager = new ConnectionManager();
    }

    public void runQuery(String query, JTable table) throws SQLException,
            ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        PreparedStatement statement = connectionManager.getConnection().prepareStatement(query);
        statement.executeUpdate();
        executeFilter("SELECT * FROM user", table);
        statement.close();
    }

    public void applyFilter(String query, JTable table) throws SQLException {
        Statement statement = connectionManager.getConnection().createStatement();
        ResultSet result = statement.executeQuery(query);
        ResultSetMetaData metaData = result.getMetaData();
        int columns = metaData.getColumnCount();
        List<String[]> data = new ArrayList<>();
        while (result.next()) {
            String[] row = new String[columns];
            for (int i = 0; i < columns; i++) {
                row[i] = result.getString(i + 1);
            }
            data.add(row);
        }
        String[][] dataArray = data.toArray(new String[0][0]);
        table.setModel(new DefaultTableModel(dataArray, new String[] { "AUTHORID",
                "FIRSTNAME", "LASTNAME" }));
        statement.close();
    }
}
