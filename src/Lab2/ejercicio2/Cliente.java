package Lab2.ejercicio2;

public class Cliente {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected void pagar(Pedido pedido) {
        System.out.println("Pedido realizado en: " + pedido.getFecha());
        System.out.println("Precio a pagar: " + pedido.getPrecio());
        System.out.println("Tarjetazo!!");
        pedido.setPrecio(0);
    }
}
