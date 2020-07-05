package co.megaterios.dominio.excepcion;

/**
 * Clase excepcion que representa los errores de dominio.
 * @author rosemberg.megaterios
 */
public class CalculadoraException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public CalculadoraException(String message) {
		super(message);
	}
}
