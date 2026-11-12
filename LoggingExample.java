import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExample {
    private static final Logger LOGGER = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Sistema: módulo de carga inicializado.");

        try {
            ejecutarCargaCritica();
        } catch (Exception exception) {
            LOGGER.log(Level.SEVERE, "Fallo crítico: la carga de datos no se completó.", exception);
        }

        LOGGER.info("Sistema: proceso finalizado.");
    }

    private static void ejecutarCargaCritica() throws Exception {
        throw new Exception("El nodo de almacenamiento no responde.");
    }
}
