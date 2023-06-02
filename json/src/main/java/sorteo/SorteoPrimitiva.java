package sorteo;

import java.util.Arrays;

import com.Gambling.json.TipoJuego;

public class SorteoPrimitiva extends Sorteo {

	String resultado;

	public SorteoPrimitiva(int id, String fecha_celebracion, String fecha_apertura, String fecha_cierre,
			TipoJuego tipoJuego, int premio, String resultado) {
		super(id, fecha_celebracion, fecha_apertura, fecha_cierre, tipoJuego, premio);
		this.resultado = resultado;
	}

	public SorteoPrimitiva(String fecha_celebracion, String fecha_apertura, String fecha_cierre,
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
		return "SorteoPrimitiva [resultado=" + resultado + "]";
	}

}
