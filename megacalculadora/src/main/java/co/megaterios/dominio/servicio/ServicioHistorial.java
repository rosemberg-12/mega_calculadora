package co.megaterios.dominio.servicio;

import co.megaterios.dominio.modelo.Operacion;

import java.util.List;

/**
 * Servicio historial donde se lleva a cabo las operaciones de gestion de las operaciones realizadas para almacenar estas en base de datos.
 * @author rosemberg.megaterios
 */
public interface ServicioHistorial {
	/**
	 * Retorna el listado de todas las operaciones realizada, que se encuentren almacenadas en la base de datos.
	 * @return listado de operaciones realizadas
	 */
	List<Operacion> obtenerHistorialOperaciones();

	/**
	 * Inserta una operacion en la base de datos.
	 */
	void insertarOperacion(Operacion operacion);
	
}
