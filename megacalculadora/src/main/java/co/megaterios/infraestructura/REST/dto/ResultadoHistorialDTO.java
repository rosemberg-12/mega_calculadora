package co.megaterios.infraestructura.REST.dto;

import java.util.List;

public class ResultadoHistorialDTO {
    private List<OperacionCompletaDTO> operaciones;

    public ResultadoHistorialDTO() {
        //Constructor vacio para deserealizacion Json
    }

    public ResultadoHistorialDTO(List<OperacionCompletaDTO> operaciones) {
        this.operaciones = operaciones;
    }

    public List<OperacionCompletaDTO> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(List<OperacionCompletaDTO> operaciones) {
        this.operaciones = operaciones;
    }
}
