package com.Gambling.json;
/**
 * 
 * @author josemiguel
 *
 */
public enum TipoJuego {

	EUROMILLONES("Euromillones"), LOTNACIONAL("Loteria Naciona"), PRIMITIVA("Primitiva"), ELGORDO("El Gordo ");
	
	private String nombre;

	private TipoJuego(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
