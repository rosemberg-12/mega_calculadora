package co.megaterios.dominio.servicioImp;

import co.megaterios.dominio.excepcion.CalculadoraException;
import co.megaterios.dominio.modelo.Operacion;
import co.megaterios.dominio.modelo.TipoOperacion;
import co.megaterios.dominio.servicio.ServicioCalculadora;
import co.megaterios.dominio.servicio.ServicioHistorial;
import co.megaterios.dominio.servicio.ServicioResta;
import co.megaterios.dominio.servicio.ServicioSuma;

public class ServicioCalculadoraImp implements ServicioCalculadora {

	private ServicioSuma servicioSuma;
	private ServicioResta servicioResta;
	private ServicioHistorial servicioHistorial;

	public ServicioCalculadoraImp(ServicioSuma servicioSuma, ServicioResta servicioResta, ServicioHistorial servicioHistorial) {
		this.servicioHistorial=servicioHistorial;
		this.servicioSuma = servicioSuma;
		this.servicioResta = servicioResta;
	}

	@Override
	public String sumarDecimal(String numero1, String numero2) {
		String resultado=servicioSuma.sumarDecimal(numero1,numero2);
		servicioHistorial.insertarOperacion(new Operacion(numero1,numero2, TipoOperacion.SUMA));
		return resultado;
	}


	@Override
	public String restarDecimal(String numero1, String numero2) {
		String resultado=servicioResta.restaDecimal(numero1,numero2);
		servicioHistorial.insertarOperacion(new Operacion(numero1,numero2, TipoOperacion.RESTA));
		return resultado;
	}

	@Override
	public String sumarBinario(String numero1, String numero2) {
		//code here
		throw new CalculadoraException("unsupported suma binaria operation");
	}

	@Override
	public String restarBinario(String numero1, String numero2) {
		//code here
		throw new CalculadoraException("unsupported resta binaria operation");
	}
}
