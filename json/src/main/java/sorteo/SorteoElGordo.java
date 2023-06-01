package sorteo;

import java.util.Arrays;

import com.Gambling.json.TipoJuego;

public class SorteoElGordo extends Sorteo {

	private int[] combinacionGanadora = new int[5];
	private int numClave;

	public SorteoElGordo(int id, String fecha_celebracion, TipoJuego tipoJuego, int premio) {
		super(id, fecha_celebracion, tipoJuego, premio);
	}

	public SorteoElGordo(String fecha_celebracion, TipoJuego tipoJuego, int premio) {
		super(fecha_celebracion, tipoJuego, premio);
		this.combinacionGanadora = generarCombGanadora();
		this.numClave = generarnumClave();
	}

	public int[] generarCombGanadora() {
		int numero;

		for (int i = 0; i < combinacionGanadora.length; i++) {
			numero = (int) (Math.random() * 10);
			combinacionGanadora[i] = numero;
		}
		return combinacionGanadora;
	}

	public int generarnumClave() {
		return numClave = (int) (Math.random() * 10);
	}

	@Override
	public String toString() {
		return super.toString() + "SorteoElGordo [combinacionGanadora=" + Arrays.toString(combinacionGanadora)
				+ ", numClave=" + numClave + "]";
	}

}
