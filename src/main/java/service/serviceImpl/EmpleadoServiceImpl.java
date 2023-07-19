package service.serviceImpl;

import app.model.Cliente;
import app.model.Empleado;
import service.EmpleadoService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoServiceImpl implements EmpleadoService {
    List<Empleado>empleadoList=new ArrayList<>();
    @Override
    public void agregarEmpleado(String nombre, String edad, int codigo, int experiencia) {
        empleadoList.add(new Empleado(nombre,edad,codigo,experiencia));
        System.out.printf("se agrego empleado");
    }

    @Override
    public void buscarEmpleado(String nombre) {
        empleadoList.stream().forEach(empleado -> {
            if (empleado!=null && empleado.getNombre().equals(nombre)) {
                JOptionPane.showMessageDialog(null,"este cliente se encuentra en la base de datos \n"

                        +"EDAD: "+empleado.getEdad()+" CODIGO: "+empleado.getCodigo()+" EXPERIENCIA: "+empleado.getExperciencia());
            }
        });
    }

    @Override
    public void eliminarEmpleado(String nombre) {
        for (int i=0;i<empleadoList.size();i++){
            if (empleadoList!=null && empleadoList.get(i).getNombre().equals(nombre)){
                empleadoList.remove(empleadoList.get(i));
            }
        }
    }

    @Override
    public void listar() {
        empleadoList.stream().forEach(empleado -> {
            if (empleado != null) {
                JOptionPane.showMessageDialog(null,"nombre: "+empleado.getNombre()+" edad: "+empleado.getEdad()+" codigo: "+empleado.getCodigo()+" experiencia: "+empleado.getExperciencia());
            }
        });

    }


    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }
}


