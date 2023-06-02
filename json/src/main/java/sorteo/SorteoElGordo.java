package sorteo;

import java.util.Arrays;

import com.Gambling.json.TipoJuego;

import result.ResultadoElGordo;

public class SorteoElGordo extends Sorteo {

	ResultadoElGordo resultado;

	public SorteoElGordo(int id, String fecha_celebracion, TipoJuego tipoJuego, int premio, ResultadoElGordo resultado) {
		super(id, fecha_celebracion, tipoJuego, premio);
		this.resultado = resultado;
	}

	public SorteoElGordo(String fecha_celebracion, TipoJuego tipoJuego, int premio) {
		super(fecha_celebracion, tipoJuego, premio);
	}

	public ResultadoElGordo getResultado() {
		return resultado;
	}

	public void setResultado(ResultadoElGordo resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return super.toString() + "SorteoElGordo [resultado=" + resultado + "]";
	}

	

}
