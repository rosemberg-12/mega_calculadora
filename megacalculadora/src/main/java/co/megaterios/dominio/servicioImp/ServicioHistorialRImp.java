package co.megaterios.dominio.servicioImp;

import co.megaterios.dominio.modelo.Operacion;
import co.megaterios.dominio.repositorio.RepositorioOperacion;
import co.megaterios.dominio.servicio.ServicioHistorial;

import java.util.List;

public class ServicioHistorialRImp implements ServicioHistorial {

    private RepositorioOperacion repositorioOperacion;

    public ServicioHistorialRImp(RepositorioOperacion repositorioOperacion) {
        this.repositorioOperacion = repositorioOperacion;
    }

    @Override
    public List<Operacion> obtenerHistorialOperaciones() {
        return repositorioOperacion.obtenerOperaciones();
    }

    @Override
    public void insertarOperacion(Operacion operacion) {
        repositorioOperacion.agregar(operacion);
    }
}
