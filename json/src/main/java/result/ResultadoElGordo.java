package result;

import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * 
 * @author jose miguel
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultadoElGordo {

	private int[] combinacionGanadora = new int[5];
	private int numClave;

	public ResultadoElGordo() {
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

	
	public int[] getCombinacionGanadora() {
		return combinacionGanadora;
	}

	public int getNumClave() {
		return numClave;
	}

	@Override
	public String toString() {
		return super.toString() + "SorteoElGordo [combinacionGanadora=" + Arrays.toString(combinacionGanadora)
				+ ", numClave=" + numClave + "]";
	}
}
