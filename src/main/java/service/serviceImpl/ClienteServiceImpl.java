package service.serviceImpl;

import app.model.Cliente;
import service.ClienteService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteServiceImpl  implements ClienteService {
    List<Cliente>clientes=new ArrayList<>();

    @Override
    public void agregarCliente(String nombre,String edad,int cantidad,int precio) {
        clientes.add(new Cliente(nombre,edad,cantidad,precio));
    }

    @Override
    public void buscarCliente(String nombre) {
        clientes.stream().forEach(cliente -> {
            if (cliente!=null && cliente.getNombre().equals(nombre)) {
                JOptionPane.showMessageDialog(null,"este cliente se encuentra en la base de datos \n"
                        +"EDAD: "+cliente.getEdad()+" CANTIDAD: "+cliente.getCantidad()+" PRECIO: "+cliente.getPrecio());
            }
        });
    }

    @Override
    public void modificar(String nombreN,String edad,int cantidadN,int precioN) {
        clientes.stream().forEach(cliente -> {
            if (cliente!=null) {
              cliente.setNombre(nombreN);
              cliente.setEdad(edad);
              cliente.setCantidad(cantidadN);
              cliente.setPrecio(precioN);
            }
        });
    }

    @Override
    public void eliminarCliente(String nombre) {
        for (int i=0;i<clientes.size();i++){
            if (clientes!=null && clientes.get(i).getNombre().equals(nombre)){
                clientes.remove(clientes.get(i));
            }
        }
    }

    @Override
    public void listar() {
        clientes.stream().forEach(cliente -> {
            if (cliente != null) {
                JOptionPane.showMessageDialog(null,"nombre: "+cliente.getNombre()+" edad: "+cliente.getEdad()+" cantidad: "+cliente.getCantidad()+" precio: "+cliente.getPrecio());
            }
        });
    }

    public List<Cliente> getClientes() {
        return clientes;
    }


}
