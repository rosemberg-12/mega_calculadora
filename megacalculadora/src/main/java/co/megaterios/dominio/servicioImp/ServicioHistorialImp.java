package co.megaterios.dominio.servicioImp;

import co.megaterios.dominio.excepcion.CalculadoraException;
import co.megaterios.dominio.modelo.Operacion;
import co.megaterios.dominio.repositorio.RepositorioOperacion;
import co.megaterios.dominio.servicio.ServicioHistorial;

import java.util.List;

public class ServicioHistorialImp implements ServicioHistorial {

    private RepositorioOperacion repositorioOperacion;

    public ServicioHistorialImp(RepositorioOperacion repositorioOperacion) {
        this.repositorioOperacion = repositorioOperacion;
    }

    @Override
    public List<Operacion> obtenerHistorialOperaciones() {
        //Code here
        throw new CalculadoraException("unsupported obtener operaciones operation");    }

    @Override
    public void insertarOperacion(Operacion operacion) {
        //Code here
        throw new CalculadoraException("unsupported insertar operation");    }
}
