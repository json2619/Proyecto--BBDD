package apuesta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 
 * @author jose miguel
 *
 */
public class RegistrarApuesta {

	public void insertarApuesta(Connection connection, Apuesta apuesta) throws SQLException {
		PreparedStatement sentencia = null;
		
		try {
			String sql = "INSERT INTO apuesta VALUES (?, ? , ?, ?, ?, ?)";
			sentencia = connection.prepareStatement(sql);
			sentencia.setInt(1, apuesta.getId());
			sentencia.setInt(2, apuesta.getSorteoID());
			sentencia.setString(3, apuesta.getCorreoCliente());
			sentencia.setString(4, apuesta.getTipoApuesta().getNombre());
			sentencia.setDate(5, apuesta.getFechApuesta());
			sentencia.setString(6, apuesta.getSerieNumérica());
			
			sentencia.executeUpdate();
			
			connection.commit();
		} catch (SQLException sqle) {
			connection.rollback();
			
			sqle.getStackTrace();
			throw sqle;
		} finally {
			if (sentencia != null) {
				sentencia.close();
			}
		}
	}
}
