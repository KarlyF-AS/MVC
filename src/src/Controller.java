public class Controller {
    public static void crearCoche(String modelo, String matricula) {
        Model.crearCoche(modelo, matricula);
    }
    /**
     * Cambia la velocidad de un coche dado.
     *
     * @param matricula Matrícula del coche.
     * @param velocidad Nueva velocidad.
     */
    public static void cambiarVelocidad(String matricula, Integer velocidad) {
        Integer nuevaVelocidad = Model.cambiarVelocidad(matricula, velocidad);
        View.muestraVelocidad(matricula, nuevaVelocidad);
    }
    /**
     * Añade o quita gasolina a un coche.
     *
     * @param matricula Matrícula del coche.
     * @param litros Litros a añadir (puede ser negativo).
     */
    public static void ponerGasolina(String matricula, double litros) {
        Model.ponerGasolina(matricula, litros);
    }
    /**
     * Hace que el coche avance cierta distancia si tiene gasolina.
     *
     * @param matricula Matrícula del coche.
     * @param metros Distancia a avanzar.
     */
    public static void avanzar(String matricula, double metros) {
        boolean c = Model.avanzar(matricula, metros);
        if (c) {
            View.mostrarAvance(matricula, metros);
        } else {
            View.mostrarErrorAvance(matricula);
        }
    }
}