package conexion;

import java.sql.DriverManager;
import java.sql.SQLException;


public class Connection {

	public java.sql.Connection crearConexion () throws ClassNotFoundException, SQLException {
		java.sql.Connection conexion = null;
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 conexion=DriverManager.getConnection("jdbc:mysql://192.168.56.103:3306/gambling","furiosa", "Imperat0r!");
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
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection prueba = new Connection();
		prueba.crearConexion();
	}
}
