package app.model;

public class Empleado extends Persona{
    private int codigo;
    private int experciencia;
    public Empleado(String nombre, String edad,int codigo,int experciencia) {
        super(nombre, edad);
        this.codigo=codigo;
        this.experciencia=experciencia;
    }

    public void setExperciencia(int experciencia) {
        this.experciencia = experciencia;
    }

    public int getExperciencia() {
        return experciencia;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
