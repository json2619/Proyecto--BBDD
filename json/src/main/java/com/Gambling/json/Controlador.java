package com.Gambling.json;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conexion.*;
import cliente.Acceso;
import cliente.Cliente;
import cliente.Registrador;

public class Controlador {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CrearConnection prueba = new CrearConnection();
		Connection conexion = prueba.crearConexion();
		Controlador realizarMenu = new Controlador();
		realizarMenu.menu(conexion);
	}
	
	public void menu(Connection conexion) throws SQLException {
		Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
 
            System.out.println("1. Registrarse");
            System.out.println("2. Acceder y crear apuesta");
            System.out.println("3. salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = teclado.nextInt();
 
                switch (opcion) {
                    case 1:
                        Registrador registrar = new Registrador();
                        System.out.println("Ingrese su correo electrónico");
                        String nvCorreo = teclado.next();
                        System.out.println("Ingrese una contraseña");
                        String nvContraseña = teclado.next();
                        System.out.println("Ingrese su dni");
                        String nvDni = teclado.next();
                        System.out.println("Ingrese su telefono");
                        String nvTelefono = teclado.next();
                        System.out.println("Ingrese el saldo de inicio");
                        double nvSAldo = teclado.nextDouble();
                        registrar.insertrSocio(conexion, new Cliente(nvCorreo, nvContraseña, nvDni, nvTelefono, nvSAldo));
                        break;
                    case 2:
                        Acceso acceder = new Acceso();
                        System.out.println("Ingrese su correo electrónico");
                        String correo = teclado.next();
                        Cliente cliente = acceder.selectSocio(conexion, correo);
                        break;
                    case 3:
                    	salir = true;
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                teclado.next();
            }
        }
	}
}
