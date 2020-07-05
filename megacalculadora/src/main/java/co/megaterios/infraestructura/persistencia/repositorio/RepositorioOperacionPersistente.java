package co.megaterios.infraestructura.persistencia.repositorio;

import co.megaterios.dominio.modelo.Operacion;
import co.megaterios.dominio.repositorio.RepositorioOperacion;
import co.megaterios.infraestructura.persistencia.Adapter.OperacionEntityAdapter;
import co.megaterios.infraestructura.persistencia.entidad.OperacionEntity;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioOperacionPersistente implements RepositorioOperacion {
	
	private EntityManager entityManager;

	public RepositorioOperacionPersistente(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}	

	@Override
	public void agregar(Operacion operacion) {
		try{
			entityManager.getTransaction().begin();
			entityManager.persist(OperacionEntityAdapter.convertirAEntity(operacion));
			entityManager.getTransaction().commit();
		}catch (Exception ex){
			entityManager.getTransaction().rollback();
			throw ex;
		}
	}

	@Override
	public List<Operacion> obtenerOperaciones() {
		try{
			entityManager.getTransaction().begin();
			CriteriaBuilder cb = entityManager.getCriteriaBuilder();
			CriteriaQuery<OperacionEntity> cq = cb.createQuery(OperacionEntity.class);
			Root<OperacionEntity> rootEntry = cq.from(OperacionEntity.class);
			CriteriaQuery<OperacionEntity> all = cq.select(rootEntry);
			TypedQuery<OperacionEntity> allQuery = entityManager.createQuery(all);
			entityManager.getTransaction().commit();
			return allQuery.getResultList().stream().map(OperacionEntityAdapter::convertirADominio).collect(Collectors.toList());
		}catch (Exception ex){
			entityManager.getTransaction().rollback();
			throw ex;
		}

	}
}
