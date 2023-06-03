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
/**
 * 
 * @author jose miguel
 *
 */
public class Select {

	public Cliente selectCliente(Connection connection, String correoJugador) throws SQLException{
		Cliente cliente = null;
		PreparedStatement sentencia = null;
		ResultSet resultado = null;
		try {
			String sql = "SELECT * FROM jugador WHERE CORREO = ?";
			sentencia = connection.prepareStatement(sql);
			sentencia.setNString(1, correoJugador);
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
	
	public Sorteo selectSorteo(Connection connection, int codigoSorteo) throws SQLException{
		Sorteo sorteo = null;
		PreparedStatement sentencia = null;
		ResultSet resultado = null;
		try {
			String sql = "SELECT * FROM sorteo WHERE ID = ?";
			sentencia = connection.prepareStatement(sql);
			sentencia.setInt(1, codigoSorteo);
			resultado = sentencia.executeQuery();
			 while (resultado.next()) {
				 int id = resultado.getInt("ID");
				 Date fecha_celebracion = resultado.getDate("FECHA_CELEBRACION");
				 Date fecha_apertura = resultado.getDate("FECHA_CIERRE");
				 Date fecha_cierre = resultado.getDate("FECHA_CIERRE");
				 String tipoSorteo = resultado.getString("TIPO_JUEGO");
				 String result = resultado.getString("COMBINACION_GANADORA");
				sorteo = new Sorteo(id, fecha_celebracion, fecha_apertura, fecha_cierre, findEnumValue(tipoSorteo), result);
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
	
	public Apuesta selectApuesta(Connection connection, int codigoApuesta) throws SQLException{
		Apuesta apuesta = null;
		PreparedStatement sentencia = null;
		ResultSet resultado = null;
		try {
			String sql = "SELECT * FROM apuesta WHERE ID = ?";
			sentencia = connection.prepareStatement(sql);
			sentencia.setInt(1, codigoApuesta);
			resultado = sentencia.executeQuery();
			 while (resultado.next()) {
				 int id = resultado.getInt("ID");
				 String tipoSorteo = resultado.getString("TIPO_JUEGO");
				 Date fechApuesta = resultado.getDate("FECHA_APUESTA");
				 String serieNumerica = resultado.getString("SERIE_NUMERICA");
				 String correoCliente = resultado.getString("JUGADOR_CORREO");
				 int sorteoID = resultado.getInt("SORTEO_ID");
				 
				 apuesta = new Apuesta(id, findEnumValue(tipoSorteo), fechApuesta, serieNumerica, correoCliente, sorteoID);
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
	
	public TipoJuego findEnumValue(String cadena) {
        switch (cadena) {
            case "Loteria Nacional":
                return TipoJuego.LOTNACIONAL;
            case "Euromillones":
                return TipoJuego.EUROMILLONES;
            case "Primitiva":
                return TipoJuego.PRIMITIVA;
            case "El Gordo":
                return TipoJuego.ELGORDO; 
            default:
                throw new IllegalArgumentException("El valor proporcionado no corresponde a ningún elemento del enumerado.");
        }
    }
}
