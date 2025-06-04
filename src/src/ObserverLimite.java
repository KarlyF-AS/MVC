/**
 * Detecta si la velocidad del coche está fuera del rango permitido.
 */
public class ObserverLimite {
    final static int LIMITE = 200;
    final static int MINIMO = 90;
    /**
     * Verifica si hay infracción de velocidad y lanza alerta.
     * @author Karly Albarrán
     * @param coche Coche a evaluar.
     */
    public static void update(Coche coche) {
        if (coche.velocidad > LIMITE || coche.velocidad < MINIMO) {
            View.alarmaInfraccion(coche.matricula, coche.velocidad);
        }
    }
   /* public static(Coche coche){
        if (coche.velocidad > LIMITE || coche.velocidad < MINIMO){
            View.alarmaGasolina(coche.matricula, coche.velocidad);
        }
    }*/
}