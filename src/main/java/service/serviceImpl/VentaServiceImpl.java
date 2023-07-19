package service.serviceImpl;

import service.VentService;

import javax.swing.*;

public class VentaServiceImpl implements VentService {
    int total=0;




    @Override
    public void venta(Laboratory laboratory) {
        laboratory.getClienteService().getClientes().stream().forEach(cliente -> {
            if (cliente!= null) {
                total= cliente.getCantidad()*cliente.getPrecio();
                JOptionPane.showMessageDialog(null,total);
            }
        });

    }
}
