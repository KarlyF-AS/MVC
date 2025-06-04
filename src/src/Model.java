import java.util.ArrayList;

public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();
    /**
     * Notifica al observador de velocidad.
     * @author Karly Albarrán
     * @param coche Coche afectado.
     */
    public static void notifyObservers(Coche coche) {
        ObserverLimite.update(coche);
    }

    /**
     * Notifica al observador de gasolina.
     * @param coche Coche afectado.
     */
    public static void notifyObserversGasolina(Coche coche) {
        ObserverGasolina.update(coche);
    }

    public static Coche crearCoche(String modelo, String matricula) {
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    public static Coche getCoche(String matricula) {
        for (Coche e : parking) {
            if (e.matricula.equals(matricula)) {
                return e;
            }
        }
        return null;
    }
    /**
     * Cambia la velocidad de un coche y notifica al observador.
     *
     * @param matricula Matrícula del coche.
     * @param v Nueva velocidad.
     * @return Velocidad actualizada.
     */
    public static Integer cambiarVelocidad(String matricula, Integer v) {
        Coche c = getCoche(matricula);
        if (c != null) {
            c.velocidad = v;
            notifyObservers(c);
            return c.velocidad;
        }
        return -1;
    }

    public static void ponerGasolina(String matricula, double litros) {
        Coche c = getCoche(matricula);
        if (c != null) {
            c.gasolina += litros;
            notifyObserversGasolina(c);
        }
    }

    public static boolean avanzar(String matricula, double metros) {
        Coche c = getCoche(matricula);
        if (c != null) {
            double consumo = metros / 10.0;
            if (c.gasolina >= consumo) {
                c.gasolina -= consumo;
                notifyObserversGasolina(c);
                return true;
            }
        }
        return false;
    }
}
