
public class Coche {
    public String matricula;
    public String modelo;
    public Integer velocidad;
    public double gasolina;
    /**
     * Constructor del coche.
     *
     * @param modelo Nombre del modelo del coche.
     * @param matricula Matrícula única identificadora.
     */
    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.gasolina = 50.0;
    }
}