package co.megaterios.infraestructura.persistencia.conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexionJPA {
	
	private static final String MEGACALCULADORA_TEST = "megacalculadora-test";
	private static EntityManagerFactory entityManagerFactory;

	public ConexionJPA() {
		entityManagerFactory = Persistence.createEntityManagerFactory(MEGACALCULADORA_TEST);
	}
	
	public EntityManager createEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}
