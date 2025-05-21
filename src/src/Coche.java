/**
 * Representa un coche con matrícula, modelo y velocidad
 */
public class Coche {
    private String matricula;
    private String modelo;
    private int velocidad;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public String getMatricula() { return matricula; }
    public String getModelo() { return modelo; }
    public int getVelocidad() { return velocidad; }

    public void setVelocidad(int velocidad) {
        if (velocidad >= 0) this.velocidad = velocidad;
    }

    public void acelerar() {
        velocidad++;
    }

    public void bajarVelocidad() {
        if (velocidad > 0) velocidad--;
    }

    public String toString() {
        return modelo + " (" + matricula + ") - " + velocidad + " km/h";
    }
}