package app.model;

public class Cliente extends Persona{
    private int cantidad;
    private int precio;

    public Cliente(String nombre, String edad,int cantidad,int precio) {
        super(nombre, edad);
        this.cantidad=cantidad;
        this.precio=precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
