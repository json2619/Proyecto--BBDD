package cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 
 * @author josem
 *
 */
public class Registrador {

	public void insertrSocio(Connection connection, Cliente cliente) throws SQLException {
		PreparedStatement sentencia = null;
		ResultSet generatedKeys = null;
		
		try {
			String sql = "INSERT INTO JUGADOR (CORREO, CONTRASEÑA, DNI, TELEFONO, SALDO) VALUES (?, ? , ?, ?, ?, ?)";
			sentencia = connection.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
			sentencia.setString(1, cliente.getCorreo());
			sentencia.setString(2, cliente.getContraseña());
			sentencia.setString(3, cliente.getDni());
			sentencia.setString(4, cliente.getTelefono());
			sentencia.setDouble(5, cliente.getSaldo());
			
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
