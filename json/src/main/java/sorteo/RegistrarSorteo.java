package sorteo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cliente.Cliente;

public class RegistrarSorteo {

	public void insertarSorteo(Connection connection, Sorteo sorteo) throws SQLException {
		PreparedStatement sentencia = null;
		ResultSet generatedKeys = null;
		
		try {
			String sql = "INSERT INTO sorteo VALUES (?, ? , ?, ?, ?, ?)";
			sentencia = connection.prepareStatement(sql);
			sentencia.setInt(1, sorteo.getId());
			sentencia.setString(2, sorteo.getFecha_celebracion());
			sentencia.setString(3, sorteo.getFecha_apertura());
			sentencia.setString(4, sorteo.getFecha_cierre());
			sentencia.setString(5, sorteo.getTipoJuego().getNombre());
			sentencia.setString(6, sorteo.getResultado());
			
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
