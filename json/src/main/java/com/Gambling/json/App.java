package com.Gambling.json;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import apuesta.Apuesta;
import apuesta.RegistrarApuesta;
import cliente.Cliente;
import cliente.Registrador;
import conexion.CrearConnection;
import selects.Select;
import sorteo.RegistrarSorteo;
import sorteo.Sorteo;
/**
 * 
 * @author jose miguel
 *
 */
public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CrearConnection prueba = new CrearConnection();
		Connection conexion = prueba.crearConexion();
		//Creación de objetos necesarios para la inserción
//		Cliente cliente = new Cliente("josemiguelf.19@hotmail.com", "Pokemon123", "05970510D", "608418644", 1200.60);
//		Sorteo sorteo = new Sorteo(1, new Date(123, 5, 10), new Date(123, 5, 2), new Date(123, 5, 8), TipoJuego.LOTNACIONAL);
//		Apuesta apuesta = new Apuesta(1, cliente.getCorreo(), sorteo.getId(), TipoJuego.LOTNACIONAL, new Date(123, 5, 3));
//		
//		//creando JSON de los objetos
//		
//		CrearJSON crearJSON = new CrearJSON();
//		crearJSON.creaJson(cliente);
//		crearJSON.creaJson(sorteo);
//		crearJSON.creaJson(apuesta);
//		
//		// InserCión de los objetos en la base de datos
//		Registrador registrarCliente = new Registrador();
//		registrarCliente.insertrSocio(conexion, cliente);
//		
//		RegistrarSorteo registrarSorteo = new RegistrarSorteo();
//		registrarSorteo.insertarSorteo(conexion, sorteo);
//		
//		RegistrarApuesta registrarApuesta = new RegistrarApuesta();
//		registrarApuesta.insertarApuesta(conexion, apuesta);
		
		Select pruebaSelect = new Select();
		
		Cliente cliente1 = pruebaSelect.selectCliente(conexion);
		System.out.println(cliente1);
		
		Sorteo sorteo1 = pruebaSelect.selectSorteo(conexion);
		System.out.println(sorteo1);
		
		Apuesta apuesta1 = pruebaSelect.selectApuesta(conexion);
		System.out.println(apuesta1);
				
		// Desconexión de la base de datos
		prueba.disconnect(conexion);
	}

}
