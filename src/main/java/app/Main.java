package app;

import controllers.ClienteController;
import controllers.EmpleadoController;
import controllers.VentaController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean bandera=true;
        EmpleadoController empleadoController=new EmpleadoController();
        ClienteController clienteController=new ClienteController();
        VentaController ventaController=new VentaController();

        while (bandera){
            switch (JOptionPane.showInputDialog("1.agregarEmpleado\n2.buscarEmpleado\n3.eliminarEmpleado\n4.listarEmpleado\n5.agregar cliente\n6.buscarCliente\n7.eliminarCliente\n8.listarCliente\n9.modificar\n10.venta")){
                case "1":
                   empleadoController.agregarEmpleado();
                    break;
                case "2":
                   empleadoController.buscarEmpleado();
                    break;
                case "3":
                    empleadoController.eliminar();

                    break;
                case "4":
                    empleadoController.listar();

                    break;
                case "5":
                    clienteController.agregarCliente();;
                    break;
                case "6":
                    clienteController.buscarCliente();;
                    break;
                case "7":
                    clienteController.eliminar();
                    break;
                case "8":
                    clienteController.listar();
                    break;
                case "9":
                    clienteController.modificar();
                case "10":
                    ventaController.venta(clienteController.getLaboratory());

            }
        }
    }
}