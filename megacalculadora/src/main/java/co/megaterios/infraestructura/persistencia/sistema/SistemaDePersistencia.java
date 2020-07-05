package co.megaterios.infraestructura.persistencia.sistema;

import javax.persistence.EntityManager;

import co.megaterios.dominio.repositorio.RepositorioOperacion;
import co.megaterios.infraestructura.persistencia.conexion.ConexionJPA;
import co.megaterios.infraestructura.persistencia.repositorio.RepositorioOperacionPersistente;

public class SistemaDePersistencia {

	private EntityManager entityManager;

	public SistemaDePersistencia() {
		this.entityManager = new ConexionJPA().createEntityManager();
	}

	public RepositorioOperacion obtenerRepositorioOperaciones() {
		return new RepositorioOperacionPersistente(entityManager);
	}

	public void iniciar() {
		entityManager.getTransaction().begin();
	}

	public void terminar() {
		entityManager.getTransaction().commit();
	}
}
