package sorteo;

import java.util.Arrays;

import com.Gambling.json.TipoJuego;

public class SorteoPrimitiva extends Sorteo {

	private int[] combinacionGanadora = new int[5];
	private int complementario;
	private int reintegro;

	public SorteoPrimitiva(int id, String fecha_celebracion, TipoJuego tipoJuego, int premio) {
		super(id, fecha_celebracion, tipoJuego, premio);
	}

	public SorteoPrimitiva(String fecha_celebracion, TipoJuego tipoJuego, int premio) {
		super(fecha_celebracion, tipoJuego, premio);
		this.combinacionGanadora = generarCombGanadora();
		this.complementario = generarComplementario();
		this.reintegro = generarReintegro();
	}

	public int[] generarCombGanadora() {
		int numero;

		for (int i = 0; i < combinacionGanadora.length; i++) {
			numero = (int) (Math.random() * 10);
			combinacionGanadora[i] = numero;
		}
		return combinacionGanadora;

	}

	public int generarComplementario() {
		return complementario = (int) (Math.random() * 10);
	}

	public int generarReintegro() {
		return complementario = (int) (Math.random() * 10);
	}

	@Override
	public String toString() {
		return super.toString() + "SorteoPrimitiva [combinacionGanadora=" + Arrays.toString(combinacionGanadora)
				+ ", complementario=" + complementario + ", reintegro=" + reintegro + "]";
	}

}
