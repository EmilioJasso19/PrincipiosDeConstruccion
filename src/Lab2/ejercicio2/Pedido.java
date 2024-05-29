package Lab2.ejercicio2;

import java.util.Date;

public class Pedido {

    private int precio;
    private String fecha;

    public Pedido(int precio) {
        this.precio = precio;
        this.fecha = new Date().toString();
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }
}
