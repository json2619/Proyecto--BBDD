package cliente;

import java.util.Scanner;

import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * 
 * @author jose miguel
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cliente {

	private String correo;
	private String contraseña;
	private String dni;
	private String telefono;
	private double saldo;

	public Cliente(String correo, String contraseña, String dni, String telefono, double saldo) {
		this.correo = correo;
		this.contraseña = contraseña;
		this.dni = dni;
		this.telefono = telefono;
		this.saldo = saldo;
	}

	public Cliente() {
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

	public String getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "Cliente [correo=" + correo + ", contraseña=" + contraseña + ", dni=" + dni + ", telefono=" + telefono
				+ ", saldo=" + saldo + "]";
	}

}
