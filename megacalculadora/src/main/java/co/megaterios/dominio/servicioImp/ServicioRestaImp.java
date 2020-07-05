package co.megaterios.dominio.servicioImp;

import co.megaterios.dominio.excepcion.CalculadoraException;
import co.megaterios.dominio.servicio.ServicioResta;

public class ServicioRestaImp implements ServicioResta {

    public ServicioRestaImp() {
    }

    @Override
    public String restaDecimal(String numero1, String numero2) {
        return (Long.valueOf(numero1)-Long.valueOf(numero2))+"";
    }

    @Override
    public String restarBinario(String numero1, String numero2) {
        //Code here
        throw new CalculadoraException("unsupported resta binaria operation");
    }
}
