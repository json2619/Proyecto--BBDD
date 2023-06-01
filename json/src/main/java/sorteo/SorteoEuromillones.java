package sorteo;

import java.util.Arrays;

import com.Gambling.json.TipoJuego;

public class SorteoEuromillones extends Sorteo {

	private int[] combinacionGanadora = new int[5];
	private int[] estrellas = new int[2];

	public SorteoEuromillones(int id, String fecha_celebracion, TipoJuego tipoJuego, int premio) {
		super(id, fecha_celebracion, tipoJuego, premio);
	}

	public SorteoEuromillones(String fecha_celebracion, TipoJuego tipoJuego, int premio) {
		super(fecha_celebracion, tipoJuego, premio);
		this.combinacionGanadora = generarCombGanadora();
		this.estrellas = generarEstrellas();
	}

	public int[] generarCombGanadora() {
		int numero;

		for (int i = 0; i < combinacionGanadora.length; i++) {
			numero = (int) (Math.random() * 10);
			combinacionGanadora[i] = numero;
		}
		return combinacionGanadora;

	}

	public int[] generarEstrellas() {
		int estrella;

		for (int i = 0; i < combinacionGanadora.length; i++) {
			estrella = (int) (Math.random() * 10);
			combinacionGanadora[i] = estrella;
		}
		return combinacionGanadora;
	}

	
	public int[] getCombinacionGanadora() {
		return combinacionGanadora;
	}

	public int[] getEstrellas() {
		return estrellas;
	}

	@Override
	public String toString() {
		return super.toString() + "SorteoEuromillones [combinacionGanadora=" + Arrays.toString(combinacionGanadora)
				+ ", estrellas=" + Arrays.toString(estrellas) + "]";
	}

}
