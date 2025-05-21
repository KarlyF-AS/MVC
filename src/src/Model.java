import java.util.ArrayList;

public class Model {
    private static ArrayList<Coche> coches = new ArrayList<>();
    /**
     * Crea un nuevo coche si no existe la matrícula
     * @author Karly Albarrán
     */
    public static boolean crearCoche(String modelo, String matricula) {
        for (Coche c : coches) {
            if (c.getMatricula().equals(matricula)) return false;
        }
        coches.add(new Coche(modelo, matricula));
        return true;
    }
    /**
     * Cambia la velocidad de un coche
     */
    public static void cambiarVelocidad(String matricula, int velocidad) {
        for (Coche c : coches) {
            if (c.getMatricula().equals(matricula)) {
                c.setVelocidad(velocidad);
                break;
            }
        }
    }
    /**
     * Aumenta la velocidad del coche en 1
     */
    public static void acelerarCoche(String matricula) {
        for (Coche c : coches) {
            if (c.getMatricula().equals(matricula)) {
                c.acelerar();
                break;
            }
        }
    }
    /**
     * Disminuye la velocidad del coche en 1 (no baja de 0)
     */
    public static void bajarVelocidad(String matricula) {
        for (Coche c : coches) {
            if (c.getMatricula().equals(matricula)) {
                c.bajarVelocidad();
                break;
            }
        }
    }
    /**
     * Devuelve la velocidad de un coche o -1 si no existe
     */
    public static int getVelocidad(String matricula) {
        for (Coche c : coches) {
            if (c.getMatricula().equals(matricula)) return c.getVelocidad();
        }
        return -1;
    }
    /**
     * Devuelve la lista completa de coches
     */
    public static ArrayList<Coche> getTodosLosCoches() {
        return coches;
    }
}
