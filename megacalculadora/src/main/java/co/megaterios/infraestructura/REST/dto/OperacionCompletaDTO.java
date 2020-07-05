package co.megaterios.infraestructura.REST.dto;

import co.megaterios.dominio.modelo.TipoOperacion;

public class OperacionCompletaDTO extends OperacionDTO {

    private TipoOperacion operacion;

    public OperacionCompletaDTO(){
        //Constructor vacio para deserealizacion Json
    }

    public OperacionCompletaDTO(String numero1, String numero2, TipoOperacion operacion) {
        super(numero1, numero2);
        this.operacion = operacion;
    }

    public TipoOperacion getOperacion() {
        return operacion;
    }

    public void setOperacion(TipoOperacion operacion) {
        this.operacion = operacion;
    }
}
