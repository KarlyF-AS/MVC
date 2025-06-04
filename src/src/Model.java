import java.util.ArrayList;

public class Model {
    private static ArrayList<Coche> coches = new ArrayList<>();

    /**
     * Crea un nuevo coche si no existe la matrícula
     */
    public static boolean crearCoche(String modelo, String matricula) {
        for (Coche c : coches) {
            if (c.getMatricula().equals(matricula)) return false;
        }
        coches.add(new Coche(modelo, matricula));
        return true;
    }

    public static void cambiarVelocidad(String matricula, int velocidad) {
        for (Coche c : coches) {
            if (c.getMatricula().equals(matricula)) {
                c.setVelocidad(velocidad);
                break;
            }
        }
    }

    public static void acelerarCoche(String matricula) {
        for (Coche c : coches) {
            if (c.getMatricula().equals(matricula)) {
                c.acelerar();
                break;
            }
        }
    }

    public static void bajarVelocidad(String matricula) {
        for (Coche c : coches) {
            if (c.getMatricula().equals(matricula)) {
                c.bajarVelocidad();
                break;
            }
        }
    }

    public static int getVelocidad(String matricula) {
        for (Coche c : coches) {
            if (c.getMatricula().equals(matricula)) return c.getVelocidad();
        }
        return -1;
    }

    public static ArrayList<Coche> getTodosLosCoches() {
        return coches;
    }

    /**
     * Intenta avanzar el coche, devuelve true si lo logró
     */
    public static boolean avanzar(String matricula, double metros) {
        for (Coche c : coches) {
            if (c.getMatricula().equals(matricula)) {
                return c.avanzar(metros);
            }
        }
        return false;
    }

    /**
     * Intenta poner gasolina, devuelve true si lo logró
     */
    public static boolean ponerGasolina(String matricula, double litros) {
        for (Coche c : coches) {
            if (c.getMatricula().equals(matricula)) {
                if (litros > 0) {
                    c.aumentarGasolina(litros); // Método que debes agregar en Coche
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
