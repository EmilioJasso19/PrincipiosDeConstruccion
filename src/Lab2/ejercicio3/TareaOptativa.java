package Lab2.ejercicio3;

public class TareaOptativa extends Tarea {
    private int puntos;

    public TareaOptativa(String nombre, int puntos) {
        super(nombre);
        this.puntos = puntos;
    }
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}