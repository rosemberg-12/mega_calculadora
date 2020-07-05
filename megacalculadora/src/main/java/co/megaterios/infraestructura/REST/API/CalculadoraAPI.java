package co.megaterios.infraestructura.REST.API;

import co.megaterios.dominio.excepcion.CalculadoraException;
import co.megaterios.dominio.fachada.FachadaCalculadora;
import co.megaterios.infraestructura.REST.Adapter.OperacionDTOAdapter;
import co.megaterios.infraestructura.REST.dto.ErrorDTO;
import co.megaterios.infraestructura.REST.dto.OperacionDTO;
import co.megaterios.infraestructura.REST.dto.ResultadoHistorialDTO;
import co.megaterios.infraestructura.REST.dto.ResultadoOperacionDTO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.stream.Collectors;

@Path("/api")
public class CalculadoraAPI {

    private FachadaCalculadora fachadaCalculadora;

    public CalculadoraAPI(FachadaCalculadora fachada){
        fachadaCalculadora=fachada;
    }
    @POST
    @Path("/sumar/decimal")
    @Produces(MediaType.APPLICATION_JSON)
    public Response sumarDecimal(OperacionDTO operacion){
        try{
            return Response.ok().
                    entity(new ResultadoOperacionDTO(fachadaCalculadora.sumaDecimal(operacion.getNumero1(),operacion.getNumero2()))).
                    build();
        }catch (CalculadoraException ex){
            return Response.status(Response.Status.BAD_REQUEST).
                    entity(new ErrorDTO(ex.getMessage())).
                    build();
        }
    }

    @POST
    @Path("/sumar/binario")
    @Produces(MediaType.APPLICATION_JSON)
    public Response sumarBinario(OperacionDTO operacion){
        try{
            return Response.ok().
                    entity(new ResultadoOperacionDTO(fachadaCalculadora.sumaBinaria(operacion.getNumero1(),operacion.getNumero2()))).
                    build();
        }catch (CalculadoraException ex){
            return Response.status(Response.Status.BAD_REQUEST).
                    entity(new ErrorDTO(ex.getMessage())).
                    build();
        }
    }

    @POST
    @Path("/restar/decimal")
    @Produces(MediaType.APPLICATION_JSON)
    public Response restarDecimal(OperacionDTO operacion){
        try{
            return Response.ok().
                    entity(new ResultadoOperacionDTO(fachadaCalculadora.restaDecimal(operacion.getNumero1(),operacion.getNumero2()))).
                    build();
        }catch (CalculadoraException ex){
            return Response.status(Response.Status.BAD_REQUEST).
                    entity(new ErrorDTO(ex.getMessage())).
                    build();
        }
    }

    @POST
    @Path("/restar/binario")
    @Produces(MediaType.APPLICATION_JSON)
    public Response restarBinario(OperacionDTO operacion){
        try{
            return Response.ok().
                    entity(new ResultadoOperacionDTO(fachadaCalculadora.
                            restaBinaria(operacion.getNumero1(),operacion.getNumero2()))).
                    build();
        }catch (CalculadoraException ex){
            return Response.status(Response.Status.BAD_REQUEST).
                    entity(new ErrorDTO(ex.getMessage())).
                    build();
        }
    }

    @GET
    @Path("/historial")
    @Produces(MediaType.APPLICATION_JSON)
    public Response obtenerHistorial(){
        try{
            return Response.ok().
                    entity(new ResultadoHistorialDTO(fachadaCalculadora.
                            obtenerHistorialOperaciones().
                            stream().
                            map(OperacionDTOAdapter::convertirADTO).
                            collect(Collectors.toList()))).
                    build();
        }catch (CalculadoraException ex){
            return Response.status(Response.Status.BAD_REQUEST).
                    entity(new ErrorDTO(ex.getMessage())).
                    build();
        }
    }

}
