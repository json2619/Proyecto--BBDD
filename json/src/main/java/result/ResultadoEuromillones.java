package result;

import java.util.Arrays;

import com.Gambling.json.TipoJuego;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultadoEuromillones {

	private int[] combinacionGanadora = new int[5];
	private int[] estrellas = new int[2];

	public ResultadoEuromillones() {
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
		return "SorteoEuromillones [combinacionGanadora=" + Arrays.toString(combinacionGanadora)
				+ ", estrellas=" + Arrays.toString(estrellas) + "]";
	}
}
