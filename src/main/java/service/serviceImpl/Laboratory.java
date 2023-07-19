package service.serviceImpl;

public class Laboratory {
    private ClienteServiceImpl clienteService;
    private EmpleadoServiceImpl empleadoService;
    private VentaServiceImpl ventaService;
    public Laboratory(){
        this.clienteService=new ClienteServiceImpl();
        this.empleadoService=new EmpleadoServiceImpl();
        this.ventaService=new VentaServiceImpl();
    }

    public VentaServiceImpl getVentaService() {
        return ventaService;
    }

    public EmpleadoServiceImpl getEmpleadoService() {
        return empleadoService;
    }

    public ClienteServiceImpl getClienteService() {
        return clienteService;
    }
}
