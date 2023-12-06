import java.sql.*;

public class App {

    // Configuración de la conexión a la base de datos
    static final String URL = "jdbc:mysql://localhost:3306/javatarea";
    static final String USUARIO = "root";
    static final String CONTRASEÑA = "root";

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);

            // Insertar un registro
            insertarRegistro(conexion, 1, "Franco", "Paredes", 30, "Desarrollador");
            insertarRegistro(conexion, 2, "Franco", "Zamora", 30, "Desarrollador");

            // Recuperar registros
            recuperarRegistros(conexion);

            // Actualizar un registro
            actualizarRegistro(conexion, 1, "Jason", "Rodriguez", 31, "Abogado");

            // Borrar un registro
            borrarRegistro(conexion, 1);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                    System.out.println("Conexión cerrada.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Operación para insertar un registro
    public static void insertarRegistro(Connection conexion, int id, String nombre, String apellido, int edad,
            String profesion) throws SQLException {
        String insertQuery = "INSERT INTO datos (id, nombre, apellido, edad, profesion) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(insertQuery)) {
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, nombre);
            preparedStatement.setString(3, apellido);
            preparedStatement.setInt(4, edad);
            preparedStatement.setString(5, profesion);
            preparedStatement.executeUpdate();
            System.out.println("Registro insertado con éxito.");
        }
    }

    // Operación para recuperar registros
    public static void recuperarRegistros(Connection conexion) throws SQLException {
        String selectQuery = "SELECT * FROM datos";
        try (Statement statement = conexion.createStatement();
                ResultSet resultSet = statement.executeQuery(selectQuery)) {
            while (resultSet.next()) {
                System.out.println("Id: " + resultSet.getInt("id") +
                        ", Nombre: " + resultSet.getString("nombre") +
                        ", Apellido: " + resultSet.getString("apellido") +
                        ", Edad: " + resultSet.getInt("edad") +
                        ", Profesión: " + resultSet.getString("profesion"));
            }
        }
    }

    // Operación para actualizar un registro
    public static void actualizarRegistro(Connection conexion, int id, String nombre, String apellido, int edad,
            String profesion) throws SQLException {
        String updateQuery = "UPDATE datos SET nombre = ?, apellido = ?, edad = ?, profesion = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setInt(3, edad);
            preparedStatement.setString(4, profesion);
            preparedStatement.setInt(5, id);
            preparedStatement.executeUpdate();
            System.out.println("Registro actualizado con éxito.");
        }
    }

    // Operación para borrar un registro
    public static void borrarRegistro(Connection conexion, int id) throws SQLException {
        String deleteQuery = "DELETE FROM datos WHERE id = ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Registro borrado con éxito.");
        }
    }
}

