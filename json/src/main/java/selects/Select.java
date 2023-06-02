package selects;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Gambling.json.TipoJuego;

import apuesta.Apuesta;
import cliente.Cliente;
import sorteo.Sorteo;

public class Select {

	public Cliente selectCliente(Connection connection) throws SQLException{
		Cliente cliente = null;
		PreparedStatement sentencia = null;
		ResultSet resultado = null;
		try {
			String sql = "SELECT * FROM jugador";
			sentencia = connection.prepareStatement(sql);
			resultado = sentencia.executeQuery();
			 while (resultado.next()) {
				 String correo = resultado.getString("CORREO");
				 String contraseña = resultado.getString("CONTRASEÑA");
				 String dni = resultado.getString("DNI");
				 String telefono = resultado.getString("TELEFONO");
				 double saldo = resultado.getDouble("SALDO");
				cliente = new Cliente(correo, contraseña, dni, telefono, saldo);
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
		
		return cliente;
		
	}
	
	public Sorteo selectSorteo(Connection connection) throws SQLException{
		Sorteo sorteo = null;
		PreparedStatement sentencia = null;
		ResultSet resultado = null;
		try {
			String sql = "SELECT * FROM SOCIO";
			sentencia = connection.prepareStatement(sql);
			resultado = sentencia.executeQuery();
			 while (resultado.next()) {
				 int id = resultado.getInt("ID");
				 Date fecha_celebracion = resultado.getDate("FECHA_CELEBRACION");
				 Date fecha_apertura = resultado.getDate("FECHA_CIERRE");
				 Date fecha_cierre = resultado.getDate("FECHA_CIERRE");
				 String tipoSorteo = resultado.getString("TIPO_JUEGO");
				 String result = resultado.getString("COMBINACION_GANADORA");
				sorteo = new Sorteo(id, fecha_celebracion, fecha_apertura, fecha_cierre, TipoJuego.valueOf(tipoSorteo.toUpperCase()), result);
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
		
		return sorteo;
		
	}
	
	public Apuesta selectApuesta(Connection connection) throws SQLException{
		Apuesta apuesta = null;
		PreparedStatement sentencia = null;
		ResultSet resultado = null;
		try {
			String sql = "SELECT * FROM SOCIO";
			sentencia = connection.prepareStatement(sql);
			resultado = sentencia.executeQuery();
			 while (resultado.next()) {
				 
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
		
		return apuesta;
		
	}
}
