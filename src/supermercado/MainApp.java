package supermercado;

import java.util.Scanner;

public class MainApp {
	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Base de datos de empleados");
		ejecutar();
	}

	private static void ejecutar() {
		String opcion = "";
		sc = new Scanner(System.in);
		ServicioEmpleado servicioEmpleado = new ServicioEmpleado();
		while (true) {
			imprimirOpciones();
			opcion = sc.nextLine();
			manejarOpcion(opcion, servicioEmpleado);
		}
	}

	private static void manejarOpcion(String opcion, ServicioEmpleado servicioEmpleado) {
		switch (opcion.toLowerCase()) {
		case "1":
			agregarEmpleado(servicioEmpleado);
			break;
		case "2":
			servicioEmpleado.imprimirLista();
			break;
		case "3":
			eliminarEmpleado(servicioEmpleado);
			break;
		case "x":
			System.out.println("Ha cerrado correctamente la base de datos.");
			System.exit(0);
		}
	}

	private static void imprimirOpciones() {
		System.out.println("Ingrese una opcion:");
		System.out.println("1 Ingresar empleado");
		System.out.println("2 Imprimir lista de empleados");
		System.out.println("3 Eliminar empleado");
		System.out.println("x para salir.");
	}

	private static void agregarEmpleado(ServicioEmpleado servicioEmpleado) {
		System.out.println("Ingrese el nombre:");
		String nombre = sc.nextLine();
		System.out.println("Ingrese el servicio/departamento:");
		String departamento = sc.nextLine();
		System.out.println("Ingrese la posicion:");
		String posicion = sc.nextLine();
		System.out.println("Ingrese el salario:");
		double salario = sc.nextDouble();

		Empleado empleado = new Empleado();
		empleado.setNombre(nombre);
		empleado.setDepartamento(departamento);
		empleado.setPosicion(posicion);
		empleado.setSalario(salario);
		servicioEmpleado.agregar(empleado);
		empleado.imprimirInformacion();
	}

	private static void eliminarEmpleado(ServicioEmpleado servicioEmpleado) {
		servicioEmpleado.imprimirLista();
		System.out.print("Ingrese el indice del empleado a eliminar:");
		int indice = sc.nextInt();
		servicioEmpleado.eliminar(indice);
	}
}
