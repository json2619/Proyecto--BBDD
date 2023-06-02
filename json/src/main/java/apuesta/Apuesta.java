package apuesta;

import java.sql.Date;

import com.Gambling.json.CrearJSON;
import com.Gambling.json.TipoJuego;
import com.fasterxml.jackson.annotation.JsonInclude;

import result.ResultadoElGordo;
import result.ResultadoEuromillones;
import result.ResultadoLotNac;
import result.ResultadoPrimitiva;

/**
 * 
 * @author josemiguel
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Apuesta {

	private int id;
	private TipoJuego tipoApuesta;
	private Date fechApuesta;
	private String serieNumérica;
	private String correoCliente;
	private int sorteoID;

	public Apuesta(int id, String correoCliente, int sorteoID, TipoJuego tipoApuesta, Date fechApuesta) {
		this.id = id;
		this.tipoApuesta = tipoApuesta;
		this.fechApuesta = fechApuesta;
		this.serieNumérica = crearSerieNumerica();
		this.correoCliente = correoCliente;
		this.sorteoID = sorteoID;
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

	public Date getFechApuesta() {
		return fechApuesta;
	}

	public void setFechApuesta(Date fechApuesta) {
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
	
	public String crearSerieNumerica() {
		String result;
		CrearJSON crearJson = new CrearJSON();
		
		if (tipoApuesta.getNombre().equalsIgnoreCase("Loteria Nacional")) {
			ResultadoLotNac resultNac = new ResultadoLotNac();
			result = crearJson.creaJson(resultNac);
		}else if(tipoApuesta.getNombre().equalsIgnoreCase("Euromillones")) {
			ResultadoEuromillones resultEuro = new ResultadoEuromillones();
			result = crearJson.creaJson(resultEuro);
		}else if (tipoApuesta.getNombre().equalsIgnoreCase("El Gordo")) {
			ResultadoElGordo resultGordo = new ResultadoElGordo();
			result = crearJson.creaJson(resultGordo);
		}else {
			ResultadoPrimitiva resultPrim = new ResultadoPrimitiva();
			result = crearJson.creaJson(resultPrim);
		}
		return result;
	}

	@Override
	public String toString() {
		return "Apuesta [id=" + id + ", tipoApuesta=" + tipoApuesta + ", fechApuesta=" + fechApuesta
				+ ", serieNumérica=" + serieNumérica + ", correoCliente=" + correoCliente + ", sorteoID=" + sorteoID
				+ "]";
	}

}
