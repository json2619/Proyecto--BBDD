package sorteo;

import com.Gambling.json.TipoJuego;

public class SorteoLotNacional extends Sorteo{

	int numPremiado;
	int reintegro;
	
	public SorteoLotNacional(int id, String fecha_celebracion, TipoJuego tipoJuego, int premio) {
		super(id, fecha_celebracion, tipoJuego, premio);
	}
	
	public SorteoLotNacional(String fecha_celebracion, TipoJuego tipoJuego, int premio) {
		super(fecha_celebracion, tipoJuego, premio);
	}
	
	public void generarNumPremiado() {
		numPremiado = (int) (Math.random()*90000 + 10000);
	}
	
	public void generarEstrellas() {
		reintegro = (int) (Math.random() * 10);
	}

	@Override
	public String toString() {
		return super.toString() + "SorteoLotNacional [numPremiado=" + numPremiado + ", reintegro=" + reintegro + "]";
	}
	
	
}
