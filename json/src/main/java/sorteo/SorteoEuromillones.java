package sorteo;

import java.util.Arrays;

import com.Gambling.json.TipoJuego;

public class SorteoEuromillones extends Sorteo{

	int[] combinacionGanadora = new int[5];
	int[] estrellas = new int[2];
	
	public SorteoEuromillones(int id, String fecha_celebracion, TipoJuego tipoJuego, int premio) {
		super(id, fecha_celebracion, tipoJuego, premio);
	}
	
	public void generarCombGanadora() {
		int numero;
		
		for (int i = 0; i < combinacionGanadora.length; i++) {
			numero = (int) (Math.random() * 10);
			combinacionGanadora[i] = numero;
		}
		
	}
	
	public void generarEstrellas() {
		int estrella;
		
		for (int i = 0; i < combinacionGanadora.length; i++) {
			estrella = (int) (Math.random() * 10);
			combinacionGanadora[i] = estrella;
		}
	}

	@Override
	public String toString() {
		return "SorteoEuromillones [combinacionGanadora=" + Arrays.toString(combinacionGanadora) + ", estrellas="
				+ Arrays.toString(estrellas) + "]";
	}
	
}
