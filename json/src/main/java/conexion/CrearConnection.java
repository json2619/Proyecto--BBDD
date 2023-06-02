package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author josemiguel
 *
 */
public class CrearConnection {

	public Connection crearConexion () throws ClassNotFoundException, SQLException {
		Connection conexion = null;
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 conexion=DriverManager.getConnection("jdbc:mysql://192.168.56.103:3306/gambling?serverTimezone=UTC","furiosa", "Imperat0r!");
			 conexion.setAutoCommit(false);
			} catch (ClassNotFoundException cnfe) {
			 System.out.println("Error. No se ha podido cargar el driver");
			 cnfe.printStackTrace();
			 throw cnfe;
			} catch (SQLException sqle) {
			 System.out.println("Error. Se ha producido algún error al establecer la conexión");
			 sqle.printStackTrace();
			 throw sqle;
			}
		return conexion;
	}
	
	public void disconnect(Connection connection) throws SQLException {
		try {
			if (null != connection) {
				connection.close();
				connection = null;
			}
		} catch(SQLException e) {
			e.printStackTrace();
			throw e;
		}
	}
}
