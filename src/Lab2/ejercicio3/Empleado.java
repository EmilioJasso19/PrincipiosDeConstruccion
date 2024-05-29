package Lab2.ejercicio3;

public class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void hacerTarea(Tarea t) {
        System.out.println(t.getNombre());
        try {
            System.out.println("Realizando...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Se durmioo:((");;
        };
    }
}