package co.megaterios.dominio.servicio;

/**
 * Servicio suma donde se lleva a cabo las operaciones de suma.
 * @author rosemberg.megaterios
 */
public interface ServicioSuma {

    /**
     * Metodo que recibe dos numeros y si son decimales, realiza su resta decimal, de lo contrario lanza una Calculadora Exception diciendo que los numeros
     * no son validos, ademas que guarda un registro de la operacion realizada en la base de datos.
     * @exception co.megaterios.dominio.excepcion.CalculadoraException domain exception
     * @param numero1 numero 1 decimal a operar
     * @param numero2 numero 2 decimal a operar
     * @return resultado de la operacion
     */
    String sumarDecimal(String numero1, String numero2);

    /**
     * Metodo que recibe dos numeros y si son binarios, realiza su suma binaria, de lo contrario lanza una Calculadora Exception diciendo que los numeros
     * no son validos, ademas que guarda un registro de la operacion realizada en la base de datos.
     * @exception co.megaterios.dominio.excepcion.CalculadoraException domain exception
     * @param numero1 numero 1 binario a operar
     * @param numero2 numero 2 binario a operar
     * @return resultado de la operacion
     */
    String sumarBinario(String numero1, String numero2);

}
