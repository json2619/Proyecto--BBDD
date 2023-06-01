package sorteo;

import java.util.Arrays;

import com.Gambling.json.TipoJuego;

public class SorteoPrimitiva extends Sorteo{

	int[] combinacionGanadora = new int[5];
	int complementario;
	int reintegro;
	
	public SorteoPrimitiva(int id, String fecha_celebracion, TipoJuego tipoJuego, int premio) {
		super(id, fecha_celebracion, tipoJuego, premio);
	}
	
	public SorteoPrimitiva(String fecha_celebracion, TipoJuego tipoJuego, int premio) {
		super(fecha_celebracion, tipoJuego, premio);
	}
	
	public void generarCombGanadora() {
		int numero;
		
		for (int i = 0; i < combinacionGanadora.length; i++) {
			numero = (int) (Math.random() * 10);
			combinacionGanadora[i] = numero;
		}
		
	}
	
	public void generarComplementario() {
		complementario = (int) (Math.random() * 10);
	}
	
	public void generarReintegro() {
		complementario = (int) (Math.random() * 10);
	}

	@Override
	public String toString() {
		return super.toString() + "SorteoPrimitiva [combinacionGanadora=" + Arrays.toString(combinacionGanadora) + ", complementario="
				+ complementario + ", reintegro=" + reintegro + "]";
	}
	
	
}
