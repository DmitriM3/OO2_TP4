package modelo;

import java.util.ArrayList;
import java.util.List;

public class Director implements Empleado {
	// Coleccion de hijos, especificos a gerentes
	private final List<Gerente> empleadosHijos = new ArrayList<>();
	private int sueldo;

	public Director(int sueldo) {
		this.sueldo = sueldo;
	}

	public void add(Gerente unEmpleado) {
		empleadosHijos.add(unEmpleado);
	}

	@Override
	public void printEmpleadosACargo() {
		System.out.println("Director.");
		for (Empleado empleados : empleadosHijos) {
			empleados.printEmpleadosACargo();
		}
	}

	@Override
	public double cacularMontoTotaldeSueldos() {
		double sueldo = this.sueldo;
		for (Empleado empleados : empleadosHijos) {
			sueldo += empleados.cacularMontoTotaldeSueldos();
		}
		return sueldo;
	}

}
