/**
 * Observador que detecta si el coche tiene poca gasolina.
 */
public class ObserverGasolina {
    /**
     * Verifica si el coche tiene menos de 10 litros y lanza una alerta.
     * @author Karly Albarrán
     * @param coche Coche a evaluar.
     */
    public static void update(Coche coche) {
        if (coche.gasolina < 10) {
            View.alarmaGasolina(coche.matricula, coche.gasolina);
        }
    }
}
