package sorteo;

import com.Gambling.json.TipoJuego;

public class SorteoLotNacional extends Sorteo {

	private int numPremiado;
	private int reintegro;

	public SorteoLotNacional(int id, String fecha_celebracion, TipoJuego tipoJuego, int premio) {
		super(id, fecha_celebracion, tipoJuego, premio);
	}

	public SorteoLotNacional(String fecha_celebracion, TipoJuego tipoJuego, int premio) {
		super(fecha_celebracion, tipoJuego, premio);
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
		return super.toString() + "SorteoLotNacional [numPremiado=" + numPremiado + ", reintegro=" + reintegro + "]";
	}

}
