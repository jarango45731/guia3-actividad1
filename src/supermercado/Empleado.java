package supermercado;

public class Empleado {
    private String nombre;
    private String departamento;
    private String posicion;
    private double salario;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPosicion() {
        return this.posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Servicio/Departamento: " + this.getDepartamento());
        System.out.println("Posicion: " + this.getPosicion());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("------------------------------");
    }
}