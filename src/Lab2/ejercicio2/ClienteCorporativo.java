package Lab2.ejercicio2;

public class ClienteCorporativo extends Cliente {
    private String cuenta;

    public ClienteCorporativo(String nombre, String cuenta) {
        super(nombre);
        this.cuenta = cuenta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
}
