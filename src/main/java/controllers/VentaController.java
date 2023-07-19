package controllers;

import service.serviceImpl.ClienteServiceImpl;
import service.serviceImpl.Laboratory;
import service.serviceImpl.VentaServiceImpl;

public class VentaController {

    //VentaServiceImpl ventaService=new VentaServiceImpl();
    public void venta(Laboratory laboratory){
        laboratory.getVentaService().venta(laboratory);
        //ventaService.venta(clienteService);
    }


}
