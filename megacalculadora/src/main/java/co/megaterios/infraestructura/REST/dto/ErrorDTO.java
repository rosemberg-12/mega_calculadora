package co.megaterios.infraestructura.REST.dto;

public class ErrorDTO {

    private String mensaje;

    public ErrorDTO(){

    }

    public ErrorDTO(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
