/**
 * Observador que detecta si el coche tiene poca gasolina.
 */
public class ObserverGasolina {
    /**
     * Verifica si el coche tiene menos de 10 litros y lanza una alerta.
     *
     * @param coche Coche a evaluar.
     * @author Karly Albarrán
     */
    public static void update(Coche coche) {
        if (coche.gasolina < 10) {
            View.alarmaGasolina(coche.matricula, coche.gasolina);
        }
    }
}

