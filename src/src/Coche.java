/**
 * Representa un coche con matrícula, modelo y velocidad
 */
public class Coche {
    private String matricula;
    private String modelo;
    private double avanzar;
    private double ponerGasolina;
    private int velocidad;

    /**
     * Inplementando nuevos metodos "Avanzar" y "PonerGasolina"
     *
     * @author Karly Albarrán
     */
    public Coche(String modelo, String matricula, double avanzar, double ponerGasolina) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.avanzar = avanzar;
        this.ponerGasolina = ponerGasolina;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public double getAvanzar() {
        return avanzar;
    }

    public double getPonerGasolina() {
        return ponerGasolina;
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

    public void setPonerGasolina() {
        if (ponerGasolina >= 1) ponerGasolina++;
        else System.out.println("No se puede poner gasolina, debe ser mayor a 1.");
    }

    public String toString() {
        return modelo + " (" + matricula + ") - " + velocidad + " km/h";

    }
}
