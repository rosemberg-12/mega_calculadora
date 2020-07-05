import co.megaterios.dominio.fachada.FachadaCalculadora;
import co.megaterios.dominio.servicio.ServicioCalculadora;
import co.megaterios.dominio.servicio.ServicioHistorial;
import co.megaterios.dominio.servicio.ServicioResta;
import co.megaterios.dominio.servicio.ServicioSuma;
import co.megaterios.dominio.servicioImp.ServicioCalculadoraImp;
import co.megaterios.dominio.servicioImp.ServicioHistorialRImp;
import co.megaterios.dominio.servicioImp.ServicioRestaImp;
import co.megaterios.dominio.servicioImp.ServicioSumaImp;
import co.megaterios.infraestructura.REST.API.CalculadoraAPI;
import co.megaterios.infraestructura.persistencia.sistema.SistemaDePersistencia;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;

import javax.servlet.DispatcherType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class EntryPoint {


    public static void main(String[] arg) {

        org.eclipse.jetty.util.log.Logger log= org.eclipse.jetty.util.log.Log.getLogger(EntryPoint.class);
        Server server = new Server(8085);
        ServletContextHandler ctx =
                new ServletContextHandler();

        FilterHolder filterHolder = ctx.addFilter(org.eclipse.jetty.servlets.CrossOriginFilter.class, "/*", EnumSet.of(DispatcherType.REQUEST));
        filterHolder.setInitParameter("allowedOrigins", "*");

        ctx.setContextPath("/");

        ServletHolder serHol = ctx.addServlet(ServletContainer.class, "/*");
        serHol.setInitOrder(1);

        serHol.setInitParameter("javax.ws.rs.Application",
                "EntryPoint$MyRestApp");

        server.setHandler(ctx);

        try {
            server.start();
            server.join();
        } catch (Exception ex) {
            log.warn("Error iniciando el server", ex);
        }
    }

    @ApplicationPath("/")
    public static class MyRestApp extends Application {

        @Override
        public Set<Class<?>> getClasses() {
            Set<Class<?>> set = new HashSet<>();
            set.add(CalculadoraAPI.class);
            return set;
        }

        @Override
        public Set<Object> getSingletons() {
            Set<Object> set = new HashSet<>();
            SistemaDePersistencia sistema = new SistemaDePersistencia();

            ServicioHistorial sHistoria = new ServicioHistorialRImp(sistema.obtenerRepositorioOperaciones());
            ServicioSuma sSuma = new ServicioSumaImp();
            ServicioResta sResta = new ServicioRestaImp();

            ServicioCalculadora sCalculadora = new ServicioCalculadoraImp(sSuma, sResta, sHistoria);
            FachadaCalculadora fachada = new FachadaCalculadora(sCalculadora, sHistoria);
            set.add(new CalculadoraAPI(fachada));
            return set;
        }

    }
}
