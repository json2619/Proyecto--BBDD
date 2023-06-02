package sorteo;

import com.Gambling.json.TipoJuego;

/**
 * 
 * @author josemiguel
 *
 */
public abstract class Sorteo {

	private int id;
	private String fecha_celebracion;
	private String fecha_apertura;
	private String fecha_cierre;
	private TipoJuego tipoJuego;
	private String resultado;
	
	public Sorteo(int id, String fecha_celebracion, String fecha_apertura, String fecha_cierre, TipoJuego tipoJuego,
			String resultado) {
		this.id = id;
		this.fecha_celebracion = fecha_celebracion;
		this.fecha_apertura = fecha_apertura;
		this.fecha_cierre = fecha_cierre;
		this.tipoJuego = tipoJuego;
		this.resultado = resultado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha_celebracion() {
		return fecha_celebracion;
	}

	public void setFecha_celebracion(String fecha_celebracion) {
		this.fecha_celebracion = fecha_celebracion;
	}

	public String getFecha_apertura() {
		return fecha_apertura;
	}

	public void setFecha_apertura(String fecha_apertura) {
		this.fecha_apertura = fecha_apertura;
	}

	public String getFecha_cierre() {
		return fecha_cierre;
	}

	public void setFecha_cierre(String fecha_cierre) {
		this.fecha_cierre = fecha_cierre;
	}

	public TipoJuego getTipoJuego() {
		return tipoJuego;
	}

	public void setTipoJuego(TipoJuego tipoJuego) {
		this.tipoJuego = tipoJuego;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "Sorteo [id=" + id + ", fecha_celebracion=" + fecha_celebracion + ", fecha_apertura=" + fecha_apertura
				+ ", fecha_cierre=" + fecha_cierre + ", tipoJuego=" + tipoJuego + ", resultado=" + resultado + "]";
	}

}
