package cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 
 * @author josemiguel
 *
 */
public class Acceso {

	public Cliente selectSocio(Connection connection, String correoCliente) throws SQLException{
		Cliente socio = null;
		PreparedStatement sentencia = null;
		ResultSet resultado = null;
		try {
			String sql = "SELECT * FROM jugador WHERE correo LIKE ?";
			sentencia = connection.prepareStatement(sql);
			sentencia.setString(1, correoCliente);
			resultado = sentencia.executeQuery();
			 while (resultado.next()) {
				 String correo = resultado.getString("CORREO");
				 String contraseña = resultado.getString("CONTRASEÑA");
				 String dni = resultado.getString("DNI");
				 String telefono = resultado.getString("TELEFONO");
				 double saldo = resultado.getDouble("SALDO");
				 socio = new Cliente(correo, contraseña, dni, telefono, saldo);
			 }
		} catch (SQLException sqle) {
			sqle.getStackTrace();
			throw sqle;
		} finally {
			 if (resultado != null){
				 resultado.close();
				  }
			  if (sentencia != null){
			 sentencia.close();
			  }
		}
		
		return socio;
		
	}
}
