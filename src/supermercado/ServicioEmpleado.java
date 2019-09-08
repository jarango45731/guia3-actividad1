package supermercado;

import java.util.ArrayList;

public class ServicioEmpleado {
    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    public void agregar(Empleado empleado) {
        empleados.add(empleado);
    }

    public Empleado leer(int indice) {
        return empleados.get(indice);
    }

    public void eliminar(int indice) {
    	if (empleados.size() == 0 || indice < 0 || indice >= empleados.size()) {
    		return;
    	}
        empleados.remove(indice);
    }

    public void imprimirLista() {
    	Empleado empleado;
        for (int i = 0; i < empleados.size(); i++) {
            empleado = empleados.get(i);
            System.out.println(i + " - " + empleado.getNombre() + ", " + empleado.getDepartamento() + ", "
                    + empleado.getPosicion() + ", $" + empleado.getSalario());
        }
    }
}