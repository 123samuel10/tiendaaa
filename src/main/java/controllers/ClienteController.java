package controllers;

import service.serviceImpl.ClienteServiceImpl;
import service.serviceImpl.EmpleadoServiceImpl;
import service.serviceImpl.Laboratory;

import javax.swing.*;
import java.util.StringTokenizer;

public class ClienteController {
    //ClienteServiceImpl clienteService=new ClienteServiceImpl();
    Laboratory laboratory=new Laboratory();
    public void agregarCliente(){
        String nombre= JOptionPane.showInputDialog("ingrese el nombre del cliente");
        String edad=JOptionPane.showInputDialog("ingrese la edad del cliente");
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad"));
        int precio=Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio"));
        //clienteService.agregarCliente(nombre,edad,cantidad,precio);
        laboratory.getClienteService().agregarCliente(nombre,edad,cantidad,precio);
    }
    public void buscarCliente(){
        String nombre=JOptionPane.showInputDialog("digite el nombre para buscar al cliente");
       // clienteService.buscarCliente(nombre);
        laboratory.getClienteService().buscarCliente(nombre);
    }
    public void eliminar(){
        String nombre=JOptionPane.showInputDialog("digite el nombre para eliminar al cliente");
        //clienteService.eliminarCliente(nombre);
        laboratory.getClienteService().eliminarCliente(nombre);
    }
    public void listar(){
        //clienteService.listar();
        laboratory.getClienteService().listar();
    }

//    public ClienteServiceImpl getClienteService() {
//        return clienteService;
//    }
    public void modificar(){

        String nombre=JOptionPane.showInputDialog("ingrese el nombre nuevo");
        String edad=JOptionPane.showInputDialog("ingrese edad nueva");
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad nueva"));
        int precio=Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio nuevo"));
        laboratory.getClienteService().modificar(nombre,edad,cantidad,precio);
    }

    public Laboratory getLaboratory() {
        return laboratory;
    }
}
