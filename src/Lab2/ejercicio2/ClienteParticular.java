package Lab2.ejercicio2;

public class ClienteParticular extends Cliente {

    private String tarjeta;

    public ClienteParticular(String nombre, String tarjeta) {
        super(nombre);
        this.tarjeta = tarjeta;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

}
