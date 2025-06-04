/**
 * Representa un coche con matrícula, modelo, velocidad y gasolina
 */
public class Coche {
    private String matricula;
    private String modelo;
    private int velocidad;
    private double gasolina; // litros disponibles

    /**
     * Constructor básico sin parámetros avanzar o ponerGasolina,
     * ahora gasolina empieza en 0
     */
    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.gasolina = 0;
    }

    // Getters y setters básicos
    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setVelocidad(int velocidad) {
        if (velocidad >= 0) this.velocidad = velocidad;
    }

    public void acelerar() {
        velocidad++;
    }

    public void bajarVelocidad() {
        if (velocidad > 0) velocidad--;
    }

    /**
     * Aumenta la gasolina disponible en litros
     * @param litros cantidad a añadir, debe ser > 0
     */
    public void aumentarGasolina(double litros) {
        if (litros > 0) {
            gasolina += litros;
        }
    }

    /**
     * Avanza el coche una distancia en metros.
     * Consume gasolina proporcional a la distancia y velocidad.
     * Fórmula ejemplo: consumo = metros * velocidad * 0.0001
     * Devuelve true si pudo avanzar (gasolina suficiente), false si no.
     *
     * @param metros distancia a avanzar
     * @return boolean si avanzó o no
     */
    public boolean avanzar(double metros) {
        if (metros <= 0) return false;
        double consumo = metros * velocidad * 0.0001; // ajustar factor consumo a gusto

        if (gasolina >= consumo) {
            gasolina -= consumo;
            return true;
        } else {
            return false; // no hay gasolina suficiente
        }
    }

    @Override
    public String toString() {
        return modelo + " (" + matricula + ") - " + velocidad + " km/h - Gasolina: " + String.format("%.2f", gasolina) + " litros";
    }
}

