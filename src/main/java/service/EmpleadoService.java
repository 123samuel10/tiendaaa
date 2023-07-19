package service;

public interface EmpleadoService {
    void agregarEmpleado(String nombre,String edad,int codigo,int experiencia);
    void buscarEmpleado(String nombre);
    void eliminarEmpleado(String nombre);
    void listar();
}
