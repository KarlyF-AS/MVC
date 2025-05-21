/**
 * Controlador principal que coordina el modelo y la vista
 * Carga datos iniciales y muestra el menú
 */
public class Controller {
    public static void iniciarAplicacion() {
        cargarDatosDePrueba();
        View.menu();
    }

    private static void cargarDatosDePrueba() {
        Model.crearCoche("Ferrari", "ABC 1234");
        Model.cambiarVelocidad("ABC 1234", 120);

        Model.crearCoche("BMW", "XYZ 5678");
        Model.cambiarVelocidad("XYZ 5678", 80);

        Model.crearCoche("Audi", "DEF 9012");
    }

    public static void mostrarVelocidadCoche(String matricula) {
        int velocidad = Model.getVelocidad(matricula);
        View.mostrarVelocidad(matricula, velocidad);
    }
}