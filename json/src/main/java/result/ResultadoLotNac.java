package result;

import com.Gambling.json.TipoJuego;

public class ResultadoLotNac {

	private int numPremiado;
	private int reintegro;

	public ResultadoLotNac() {
		this.numPremiado = generarNumPremiado();
		this.reintegro = generarEstrellas();
	}

	public int generarNumPremiado() {
		return numPremiado = (int) (Math.random() * 90000 + 10000);
	}

	public int generarEstrellas() {
		return reintegro = (int) (Math.random() * 10);
	}

	
	public int getNumPremiado() {
		return numPremiado;
	}

	public int getReintegro() {
		return reintegro;
	}

	@Override
	public String toString() {
		return "SorteoLotNacional [numPremiado=" + numPremiado + ", reintegro=" + reintegro + "]";
	}
}
