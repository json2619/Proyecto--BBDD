package sorteo;

import com.Gambling.json.TipoJuego;

public class SorteoLotNacional extends Sorteo {

	String resultado;

	public SorteoLotNacional(int id, String fecha_celebracion, String fecha_apertura, String fecha_cierre,
			TipoJuego tipoJuego, int premio, String resultado) {
		super(id, fecha_celebracion, fecha_apertura, fecha_cierre, tipoJuego, premio);
		this.resultado = resultado;
	}

	public SorteoLotNacional(String fecha_celebracion, String fecha_apertura, String fecha_cierre,
			TipoJuego tipoJuego, int premio, String resultado) {
		super(fecha_celebracion, fecha_apertura, fecha_cierre, tipoJuego, premio);
		this.resultado = resultado;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "SorteoLotNacional [resultado=" + resultado + "]";
	}

}
