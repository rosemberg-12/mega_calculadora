package co.megaterios.infraestructura.REST.Adapter;

import co.megaterios.dominio.modelo.Operacion;
import co.megaterios.infraestructura.REST.dto.OperacionCompletaDTO;

public class OperacionDTOAdapter {

    private OperacionDTOAdapter() {}

    public static Operacion convertirADominio(OperacionCompletaDTO operacionDTO) {
        Operacion operacion = null;
        if(operacionDTO != null) {
            operacion = new Operacion(operacionDTO.getNumero1(), operacionDTO.getNumero2(), operacionDTO.getOperacion());
        }
        return operacion;
    }

    public static OperacionCompletaDTO convertirADTO(Operacion operacion) {
        OperacionCompletaDTO operacionDTO = new OperacionCompletaDTO();
        operacionDTO.setNumero1(operacion.getNumero1());
        operacionDTO.setNumero2(operacion.getNumero2());
        operacionDTO.setOperacion(operacion.getOperacion());
        return operacionDTO;
    }
}