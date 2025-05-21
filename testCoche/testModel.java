import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase Model.
 * @author Karly Albarrán
 * Se usan pruebas parametrizadas para hacer más eficiente el testing.
 */
public class testModel {

    /**
     * Limpia la lista de coches antes de cada prueba,
     * para asegurar que cada test empiece con un estado limpio.
     */
    @BeforeEach
    public void limpiarParking() {
        Model.getTodosLosCoches().clear();
    }

    /**
     * Prueba: Crear un coche exitosamente
     * - Debe agregarlo al listado
     * - El tamaño del parking debe aumentar en 1
     */    @Test
    @DisplayName("Crear coche exitosamente")
    public void crearCocheExitoso() {
        assertTrue(Model.crearCoche("Toyota", "1234ABC"));
        assertEquals(1, Model.getTodosLosCoches().size());
    }

    /**
     * Prueba: No crear coche con matrícula duplicada
     * - Si ya existe, no se debe permitir crear otro
     * - El tamaño del parking debe seguir siendo 1
     */
    @Test
    @DisplayName("No crear coche con matrícula duplicada")
    public void crearCocheDuplicado() {
        Model.crearCoche("Toyota", "1234ABC");
        assertFalse(Model.crearCoche("Honda", "1234ABC")); // Debe fallar
        assertEquals(1, Model.getTodosLosCoches().size());
    }

    /**
     * Prueba: Cambiar velocidad de un coche exitosamente
     * - Creamos el coche, cambiamos su velocidad y verificamos
     */
    @Test
    @DisplayName("Cambiar velocidad exitosamente")
    public void cambiarVelocidadExitoso() {
        Model.crearCoche("Toyota", "1234ABC");
        Model.cambiarVelocidad("1234ABC", 100);
        assertEquals(100, Model.getVelocidad("1234ABC"));
    }

    /**
     * Prueba parametrizada: Acelerar un coche desde diferentes velocidades
     *
     * @param modelo       Modelo del coche
     * @param matricula    Matrícula del coche
     * @param velocidadIni Velocidad inicial
     * @param velocidadFin Velocidad después de acelerar (+1)
     */
    @ParameterizedTest(name = "{index} => {0}, {1}, {2} -> {3}")
    @CsvSource({
            "Toyota, 1234ABC, 50, 51",
            "Ford, XYZ789, 0, 1",
            "BMW, TEST123, 120, 121"
    })
    @DisplayName("Acelerar coche aumenta velocidad en 1")
    public void acelerarCocheParametrizado(String modelo, String matricula, int velocidadIni, int velocidadFin) {
        Model.crearCoche(modelo, matricula);
        Model.cambiarVelocidad(matricula, velocidadIni);
        Model.acelerarCoche(matricula);
        assertEquals(velocidadFin, Model.getVelocidad(matricula));
    }

    /**
     * Prueba parametrizada: Bajar velocidad solo si es > 0
     *
     * @param modelo       Modelo del coche
     * @param matricula    Matrícula del coche
     * @param velocidadIni Velocidad inicial
     * @param velocidadFin Velocidad después de bajar (si aplica)
     */
    @ParameterizedTest(name = "{index} => {0}, {1}, {2} -> {3}")
    @CsvSource({
            "Toyota, 1234ABC, 50, 49",
            "Ford, XYZ789, 1, 0",
            "BMW, TEST123, 0, 0" // No baja porque ya está en 0
    })
    @DisplayName("Bajar velocidad reduce en 1 si es mayor a 0")
    public void bajarVelocidadParametrizado(String modelo, String matricula, int velocidadIni, int velocidadFin) {
        Model.crearCoche(modelo, matricula);
        Model.cambiarVelocidad(matricula, velocidadIni);
        Model.bajarVelocidad(matricula);
        assertEquals(velocidadFin, Model.getVelocidad(matricula));
    }

    /**
     * Prueba: Obtener velocidad de un coche inexistente
     * - Debe devolver -1
     */
    @Test
    @DisplayName("Obtener velocidad de coche inexistente")
    public void obtenerVelocidadCocheInexistente() {
        assertEquals(-1, Model.getVelocidad("NO_EXISTE")); // -1 indica no encontrado
    }
}
