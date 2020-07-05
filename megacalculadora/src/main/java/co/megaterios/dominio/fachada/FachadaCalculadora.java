package co.megaterios.dominio.fachada;

import co.megaterios.dominio.modelo.Operacion;
import co.megaterios.dominio.servicio.ServicioCalculadora;
import co.megaterios.dominio.servicio.ServicioHistorial;

import java.util.List;

/**
 * Punto de entrada a la logica del dominio.
 * @author rosemberg.megaterios
 */
public class FachadaCalculadora {

    private ServicioCalculadora servicioCalculadora;
    private ServicioHistorial servicioHistorial;

    public FachadaCalculadora(ServicioCalculadora servicioCalculadora, ServicioHistorial servicioHistorial) {
        this.servicioCalculadora = servicioCalculadora;
        this.servicioHistorial = servicioHistorial;
    }

    public String sumaDecimal(String numero1, String numero2){
        return this.servicioCalculadora.sumarDecimal(numero1,numero2);
    }

    public String sumaBinaria(String numero1, String numero2){
        return this.servicioCalculadora.sumarBinario(numero1,numero2);
    }

    public String restaDecimal(String numero1, String numero2){
        return this.servicioCalculadora.restarDecimal(numero1,numero2);
    }

    public String restaBinaria(String numero1, String numero2){
        return this.servicioCalculadora.restarBinario(numero1,numero2);
    }

    public List<Operacion> obtenerHistorialOperaciones(){
        return this.servicioHistorial.obtenerHistorialOperaciones();
    }
}
