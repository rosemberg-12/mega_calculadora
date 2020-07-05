package co.megaterios.infraestructura.REST.dto;

public class ResultadoOperacionDTO {

    private String resultado;

    public ResultadoOperacionDTO(){
        //Constructor vacio para deserealizacion Json
    }

    public ResultadoOperacionDTO(String resultado) {
        this.resultado = resultado;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
