package co.megaterios.infraestructura.persistencia.entidad;

import co.megaterios.dominio.modelo.TipoOperacion;

import javax.persistence.*;

@Entity(name = "Operacion")
public class OperacionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String numero1;

	@Column(nullable = false)
	private String numero2;

	@Column(nullable = false)
	private TipoOperacion operacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
