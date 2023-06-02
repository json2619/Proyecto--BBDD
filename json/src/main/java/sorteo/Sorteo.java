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
	private TipoJuego tipoJuego;
	private int premio;

	public Sorteo(int id, String fecha_celebracion, TipoJuego tipoJuego, int premio) {
		this.id = id;
		this.fecha_celebracion = fecha_celebracion;
		this.tipoJuego = tipoJuego;
		this.premio = premio;
	}

	public Sorteo(String fecha_celebracion, TipoJuego tipoJuego, int premio) {
		this.fecha_celebracion = fecha_celebracion;
		this.tipoJuego = tipoJuego;
		this.premio = premio;
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

	public TipoJuego getTipoJuego() {
		return tipoJuego;
	}

	public void setTipoJuego(TipoJuego tipoJuego) {
		this.tipoJuego = tipoJuego;
	}

	public int getPremio() {
		return premio;
	}

	public void setPremio(int premio) {
		this.premio = premio;
	}

	@Override
	public String toString() {
		return "Sorteo [id=" + id + ", fecha_celebracion=" + fecha_celebracion + ", tipoJuego=" + tipoJuego
				+ ", premio=" + premio + "]";
	}

}
