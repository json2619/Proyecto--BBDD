package apuesta;

import com.Gambling.json.TipoJuego;

/**
 * 
 * @author josemiguel
 *
 */
public abstract class Apuesta {

	private int id;
	private TipoJuego tipoApuesta;
	private String fechApuesta;
	private String serieNumérica;
	private String correoCliente;
	private int sorteoID;

	public Apuesta(int id, String correoCliente, int sorteoID, TipoJuego tipoApuesta, String fechApuesta,
			String serieNumerica) {
		this.id = id;
		this.tipoApuesta = tipoApuesta;
		this.fechApuesta = fechApuesta;
		this.serieNumérica = serieNumerica;
		this.correoCliente = correoCliente;
		this.sorteoID = sorteoID;
	}

	public Apuesta(TipoJuego tipoApuesta, String fechApuesta, String serieNumerica) {
		this.tipoApuesta = tipoApuesta;
		this.fechApuesta = fechApuesta;
		this.serieNumérica = serieNumerica;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TipoJuego getTipoApuesta() {
		return tipoApuesta;
	}

	public void setTipoApuesta(TipoJuego tipoApuesta) {
		this.tipoApuesta = tipoApuesta;
	}

	public String getFechApuesta() {
		return fechApuesta;
	}

	public void setFechApuesta(String fechApuesta) {
		this.fechApuesta = fechApuesta;
	}

	public String getSerieNumérica() {
		return serieNumérica;
	}

	public void setSerieNumérica(String serieNumérica) {
		this.serieNumérica = serieNumérica;
	}

	public String getCorreoCliente() {
		return correoCliente;
	}

	public int getSorteoID() {
		return sorteoID;
	}

	@Override
	public String toString() {
		return "Apuesta [id=" + id + ", tipoApuesta=" + tipoApuesta + ", fechApuesta=" + fechApuesta
				+ ", serieNumérica=" + serieNumérica + ", correoCliente=" + correoCliente + ", sorteoID=" + sorteoID
				+ "]";
	}

}
