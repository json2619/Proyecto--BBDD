package apuesta;

import com.Gambling.json.TipoJuego;
/**
 * 
 * @author josemiguel
 *
 */
public class Apuesta {

	private int id;
	private TipoJuego tipoApuesta;
	private String fechApuesta;
	private double precioApuesta;
	private String correoCliente;
	private int SorteoID;

	public Apuesta(int id, TipoJuego tipoApuesta, String fechApuesta, double precioApuesta) {
		this.id = id;
		this.tipoApuesta = tipoApuesta;
		this.fechApuesta = fechApuesta;
		this.precioApuesta = precioApuesta;
	}

	public Apuesta(TipoJuego tipoApuesta, String fechApuesta, double precioApuesta) {
		this.tipoApuesta = tipoApuesta;
		this.fechApuesta = fechApuesta;
		this.precioApuesta = precioApuesta;
	}

	public double getPrecioApuesta() {
		return precioApuesta;
	}

	public void setPrecioApuesta(double precioApuesta) {
		this.precioApuesta = precioApuesta;
	}

	public int getId() {
		return id;
	}

	public TipoJuego getTipoApuesta() {
		return tipoApuesta;
	}

	public String getFechApuesta() {
		return fechApuesta;
	}

	@Override
	public String toString() {
		return "Apuesta [id=" + id + ", tipoApuesta=" + tipoApuesta + ", fechApuesta=" + fechApuesta
				+ ", precioApuesta=" + precioApuesta + "]";
	}

}
