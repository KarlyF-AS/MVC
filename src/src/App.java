/**
 * Clase principal que lanza la aplicación de coches.
 * @author Karly Albarrán
 */
public class App {
    public static void main(String[] args) {
        Controller.crearCoche("LaFerrari", "SBC 1234");
        Controller.crearCoche("Alpine", "HYU 4567");
        Controller.crearCoche("Aston Martin", "FGH 3333");

        Controller.cambiarVelocidad("SBC 1234", 85);
        Controller.ponerGasolina("SBC 1234", -45); // para activar alerta
        Controller.avanzar("SBC 1234", 100); // consume gasolina y puede activar alerta
    }
}