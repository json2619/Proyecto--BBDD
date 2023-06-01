package cliente;

import java.util.Scanner;

public class Cliente {

	private int id;
	private String correo;
	private String contraseña;
	private String dni;
	private String telefono;
	private double saldo;

	public Cliente(int id, String correo, String contraseña, String dni, String telefono) {
		this.id = id;
		this.correo = correo;
		this.contraseña = contraseña;
		this.dni = dni;
		this.telefono = telefono;
	}

	public Cliente(String correo, String contraseña, String dni, String telefono) {
		this.correo = correo;
		this.contraseña = contraseña;
		this.dni = dni;
		this.telefono = telefono;
		this.saldo = ingresarSaldo();
	}

	public double ingresarSaldo() {
		Scanner teclado = new Scanner(System.in);
		double dinero;

		System.out.println("Ingrese saldo");
		dinero = teclado.nextDouble();
		return this.saldo = dinero;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", correo=" + correo + ", contraseña=" + contraseña + ", dni=" + dni
				+ ", telefono=" + telefono + ", saldo=" + saldo + "]";
	}

}