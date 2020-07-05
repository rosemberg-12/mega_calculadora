package co.megaterios.infraestructura.persistencia.Adapter;

import co.megaterios.dominio.modelo.Operacion;
import co.megaterios.infraestructura.persistencia.entidad.OperacionEntity;

public class OperacionEntityAdapter {
	
	private OperacionEntityAdapter() {}
	
	public static Operacion convertirADominio(OperacionEntity operacionEntity) {
		Operacion operacion = null;
		if(operacionEntity != null) {
			operacion = new Operacion(operacionEntity.getNumero1(), operacionEntity.getNumero2(), operacionEntity.getOperacion());
		}
		return operacion;
	}
	
	public static OperacionEntity convertirAEntity(Operacion operacion) {
		OperacionEntity operacionEntity = new OperacionEntity();
		operacionEntity.setNumero1(operacion.getNumero1());
		operacionEntity.setNumero2(operacion.getNumero2());
		operacionEntity.setOperacion(operacion.getOperacion());
		return operacionEntity;
	}
}
