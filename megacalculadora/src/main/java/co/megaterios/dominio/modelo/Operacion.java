package co.megaterios.dominio.modelo;

/**
 * Modelo que representa la operacion realizada.
 * @author rosemberg.megaterios
 */
public class Operacion {

	private String numero1;
	private String numero2;
	private TipoOperacion operacion;

	public Operacion(String numero1, String numero2, TipoOperacion operacion) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.operacion = operacion;
	}

	public String getNumero1() {
		return numero1;
	}

	public void setNumero1(String numero1) {
		this.numero1 = numero1;
	}

	public String getNumero2() {
		return numero2;
	}

	public void setNumero2(String numero2) {
		this.numero2 = numero2;
	}

	public TipoOperacion getOperacion() {
		return operacion;
	}

	public void setOperacion(TipoOperacion operacion) {
		this.operacion = operacion;
	}
}
