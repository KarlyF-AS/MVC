public class View {
    public static boolean muestraVelocidad(String matricula, Integer v) {
        System.out.println("Velocidad actual: "+ matricula + ": " + v + "km/hr");
        return true;
    }

    /**
     * Muestra una infracción de velocidad.
     *
     * @param matricula Matrícula del coche.
     * @param v Velocidad registrada.
     * @return true si se mostró.
     */
    public static boolean alarmaInfraccion(String matricula, Integer v) {
        System.out.println("INFRACCIÓN... Vas muy rápido!: " + matricula + " a " + v + "km/hr");
        return true;
    }

    /**
     * Muestra una alerta de gasolina baja.
     *
     * @param matricula Matrícula del coche.
     * @param gasolina Cantidad de gasolina.
     * @return true si se mostró.
     */
    public static boolean alarmaGasolina(String matricula, double gasolina) {
        System.out.println("===Alerta! Repostar === " + matricula + " con " + gasolina + " litros");
        return true;
    }

    /**
     * Muestra que el coche avanzó.
     *
     * @param matricula Matrícula del coche.
     * @param metros Metros avanzados.
     */
    public static void mostrarAvance(String matricula, double metros) {
        System.out.println("Avanzó: " + matricula + " " + metros + " metros");
    }

    /**
     * Muestra que el coche no pudo avanzar.
     * @param matricula Matrícula del coche.
     */
    public static void mostrarErrorAvance(String matricula) {
        System.out.println("No pudo avanzar: falta gasolina en " + matricula);
    }
}
