package controllers;

import service.serviceImpl.EmpleadoServiceImpl;
import service.serviceImpl.Laboratory;

import javax.swing.*;

public class EmpleadoController {
   // EmpleadoServiceImpl empleadoService=new EmpleadoServiceImpl();
    Laboratory laboratory=new Laboratory();
    public void agregarEmpleado(){
        String nombre= JOptionPane.showInputDialog("ingrese el nombre del empleado");
        String edad=JOptionPane.showInputDialog("ingrese la edad del empleado");
        int codigo=Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo del empleado"));
        int experiencia=Integer.parseInt(JOptionPane.showInputDialog("ingrese la experiencia del empleado"));
       // empleadoService.agregarEmpleado(nombre,edad,codigo,experiencia);
        laboratory.getEmpleadoService().agregarEmpleado(nombre,edad,codigo,experiencia);
    }
    public void buscarEmpleado(){
        String nombre=JOptionPane.showInputDialog("digite el nombre para buscar al empleado");
        //empleadoService.buscarEmpleado(nombre);
        laboratory.getEmpleadoService().buscarEmpleado(nombre);
    }
    public void eliminar(){
        String nombre=JOptionPane.showInputDialog("digite el nombre para eliminar al empleado");
        //empleadoService.eliminarEmpleado(nombre);
        laboratory.getEmpleadoService().eliminarEmpleado(nombre);
    }
    public void listar(){
        //empleadoService.listar();
        laboratory.getEmpleadoService().listar();
    }


}
