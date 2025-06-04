public class Controller {
    public static void iniciarAplicacion() {
        cargarDatosDePrueba();
        View.menu();
    }

    private static void cargarDatosDePrueba() {
        Model.crearCoche("Ferrari", "ABC1234");
        Model.cambiarVelocidad("ABC1234", 120);
        Model.ponerGasolina("ABC1234", 50);

        Model.crearCoche("BMW", "XYZ5678");
        Model.cambiarVelocidad("XYZ5678", 80);
        Model.ponerGasolina("XYZ5678", 40);

        Model.crearCoche("Audi", "DEF9012");
        Model.cambiarVelocidad("DEF9012", 60);
        Model.ponerGasolina("DEF9012", 30);
    }

    public static void mostrarVelocidadCoche(String matricula) {
        int velocidad = Model.getVelocidad(matricula);
        View.mostrarVelocidad(matricula, velocidad);
    }
}
