package service;

public interface ClienteService {
    void agregarCliente(String nombre,String edad,int cantidad,int precio);
    void buscarCliente(String nombre);
    void  modificar(String nombreN,String edad,int cantidadN,int precioN);
    void eliminarCliente(String nombre);
    void listar();
}
