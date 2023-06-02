package result;

import java.util.Arrays;

import com.Gambling.json.TipoJuego;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultadoPrimitiva {

	private int[] combinacionGanadora = new int[5];
	private int complementario;
	private int reintegro;

	public ResultadoPrimitiva() {
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
	
	

	public int[] getCombinacionGanadora() {
		return combinacionGanadora;
	}

	public int getComplementario() {
		return complementario;
	}

	public int getReintegro() {
		return reintegro;
	}

	@Override
	public String toString() {
		return super.toString() + "SorteoPrimitiva [combinacionGanadora=" + Arrays.toString(combinacionGanadora)
				+ ", complementario=" + complementario + ", reintegro=" + reintegro + "]";
	}
}
