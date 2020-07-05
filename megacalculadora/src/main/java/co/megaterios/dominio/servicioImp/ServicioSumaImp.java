package co.megaterios.dominio.servicioImp;

import co.megaterios.dominio.excepcion.CalculadoraException;
import co.megaterios.dominio.servicio.ServicioSuma;

public class ServicioSumaImp implements ServicioSuma {

    public ServicioSumaImp() {

    }

    @Override
    public String sumarDecimal(String numero1, String numero2) {
        return (Long.valueOf(numero1)+Long.valueOf(numero2))+"";
    }

    @Override
    public String sumarBinario(String numero1, String numero2) {
        //Code here
        throw new CalculadoraException("unsupported operation");
    }
}
