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
		Cliente cliente = new Cliente("josemiguelf.19@hotmail.com", "Pokemon123", "05970510D", "608418644", 1200.60);
		Sorteo sorteo = new Sorteo(1, new Date(123, 5, 10), new Date(123, 5, 2), new Date(123, 5, 8), TipoJuego.LOTNACIONAL);
		Apuesta apuesta = new Apuesta(1, cliente.getCorreo(), sorteo.getId(), TipoJuego.LOTNACIONAL, new Date(123, 5, 3));
		
		Cliente cliente2 = new Cliente("angelantoniof.19@hotmail.com", "Fifa23", "05070950D", "608418644", 120.50);
		Sorteo sorteo2 = new Sorteo(2, new Date(123, 5, 15), new Date(123, 5, 5), new Date(123, 5, 14), TipoJuego.ELGORDO);
		Apuesta apuesta2 = new Apuesta(2, cliente2.getCorreo(), sorteo2.getId(), TipoJuego.ELGORDO, new Date(123, 5, 6));
		
		Sorteo sorteo3 = new Sorteo(3, new Date(123, 5, 18), new Date(123, 5, 8), new Date(123, 5, 17), TipoJuego.EUROMILLONES);
		Apuesta apuesta3 = new Apuesta(3, cliente2.getCorreo(), sorteo3.getId(), TipoJuego.EUROMILLONES, new Date(123, 5, 9));
		
		Sorteo sorteo4 = new Sorteo(4, new Date(123, 5, 20), new Date(123, 5, 10), new Date(123, 5, 19), TipoJuego.PRIMITIVA);
		Apuesta apuesta4 = new Apuesta(4, cliente.getCorreo(), sorteo4.getId(), TipoJuego.PRIMITIVA, new Date(123, 5, 11));
		
				
		//creando JSON de los objetos
		CrearJSON crearJSON = new CrearJSON();
		crearJSON.creaJson(cliente);
		crearJSON.creaJson(sorteo);
		crearJSON.creaJson(apuesta);
		
		crearJSON.creaJson(cliente2);
		crearJSON.creaJson(sorteo2);
		crearJSON.creaJson(apuesta2);
		
		crearJSON.creaJson(sorteo3);
		crearJSON.creaJson(apuesta3);
		
		crearJSON.creaJson(sorteo4);
		crearJSON.creaJson(apuesta4);

		
		// InserCión de los objetos en la base de datos
		Registrador registrarCliente = new Registrador();
		registrarCliente.insertrSocio(conexion, cliente);
		registrarCliente.insertrSocio(conexion, cliente2);
		
		RegistrarSorteo registrarSorteo = new RegistrarSorteo();
		registrarSorteo.insertarSorteo(conexion, sorteo);
		registrarSorteo.insertarSorteo(conexion, sorteo2);
		registrarSorteo.insertarSorteo(conexion, sorteo3);
		registrarSorteo.insertarSorteo(conexion, sorteo4);
		
		RegistrarApuesta registrarApuesta = new RegistrarApuesta();
		registrarApuesta.insertarApuesta(conexion, apuesta);
		registrarApuesta.insertarApuesta(conexion, apuesta2);
		registrarApuesta.insertarApuesta(conexion, apuesta3);
		registrarApuesta.insertarApuesta(conexion, apuesta4);
		
		//Seleccionamos los datos de la base de datos que queremos recuperar
		Select pruebaSelect = new Select();
		
		Cliente cliente5 = pruebaSelect.selectCliente(conexion, cliente2.getCorreo());
		System.out.println(cliente5);
		
		Sorteo sorteo5 = pruebaSelect.selectSorteo(conexion, sorteo3.getId());
		System.out.println(sorteo5);
		
		Apuesta apuesta5 = pruebaSelect.selectApuesta(conexion, apuesta4.getId());
		System.out.println(apuesta5);
				
		// Desconexión de la base de datos
		prueba.disconnect(conexion);
	}

}
