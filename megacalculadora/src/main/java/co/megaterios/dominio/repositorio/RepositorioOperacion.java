package co.megaterios.dominio.repositorio;

import co.megaterios.dominio.modelo.Operacion;

import java.util.List;

/**
 * Repositorio que permite acceder a todas las operaciones de co.megaterios.infraestructura.REST.persistencia del modelo Operacion.
 * @author rosemberg.megaterios
 */
public interface RepositorioOperacion {

	/**
	 * Permite agregar una operacion al repositorio de operaciones.
	 */
	void  agregar(Operacion operacion);
	
	/**
	 * Permite obtener todas las operaciones guardadas.
	 */
	List<Operacion> obtenerOperaciones();

}
