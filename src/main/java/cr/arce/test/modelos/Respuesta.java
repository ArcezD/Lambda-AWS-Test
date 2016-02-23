package cr.arce.test.modelos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Respuesta {
	
	@JsonProperty("respuesta")
	private String respuesta;
	
	public Respuesta() {
	}

	/**
	 * @param respuesta
	 */
	@JsonCreator
	public Respuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	/**
	 * @return the respuesta
	 */
	public String getRespuesta() {
		return respuesta;
	}

	/**
	 * @param respuesta the respuesta to set
	 */
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

}
