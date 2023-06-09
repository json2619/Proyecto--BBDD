package sorteo;

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
 * @author jose miguel
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sorteo {

	private int id;
	private Date fecha_celebracion;
	private Date fecha_apertura;
	private Date fecha_cierre;
	private TipoJuego tipoJuego;
	private String resultado;
	
	public Sorteo(int id, Date fecha_celebracion, Date fecha_apertura, Date fecha_cierre, TipoJuego tipoJuego) {
		this.id = id;
		this.fecha_celebracion = fecha_celebracion;
		this.fecha_apertura = fecha_apertura;
		this.fecha_cierre = fecha_cierre;
		this.tipoJuego = tipoJuego;
		this.resultado = crearResultado();
	}

	public Sorteo(int id, Date fecha_celebracion, Date fecha_apertura, Date fecha_cierre, TipoJuego tipoJuego,
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

	public Date getFecha_celebracion() {
		return fecha_celebracion;
	}

	public void setFecha_celebracion(Date fecha_celebracion) {
		this.fecha_celebracion = fecha_celebracion;
	}

	public Date getFecha_apertura() {
		return fecha_apertura;
	}

	public void setFecha_apertura(Date fecha_apertura) {
		this.fecha_apertura = fecha_apertura;
	}

	public Date getFecha_cierre() {
		return fecha_cierre;
	}

	public void setFecha_cierre(Date fecha_cierre) {
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

	public String crearResultado() {
		String result;
		CrearJSON crearJson = new CrearJSON();
		
		if (tipoJuego.getNombre().equalsIgnoreCase("Loteria Nacional")) {
			ResultadoLotNac resultNac = new ResultadoLotNac();
			result = crearJson.creaJson(resultNac);
		}else if(tipoJuego.getNombre().equalsIgnoreCase("Euromillones")) {
			ResultadoEuromillones resultEuro = new ResultadoEuromillones();
			result = crearJson.creaJson(resultEuro);
		}else if (tipoJuego.getNombre().equalsIgnoreCase("El Gordo")) {
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
		return "Sorteo [id=" + id + ", fecha_celebracion=" + fecha_celebracion + ", fecha_apertura=" + fecha_apertura
				+ ", fecha_cierre=" + fecha_cierre + ", tipoJuego=" + tipoJuego + ", resultado=" + resultado + "]";
	}

}
