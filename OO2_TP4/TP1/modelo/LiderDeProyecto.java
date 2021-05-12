package modelo;

import java.util.ArrayList;
import java.util.List;

public class LiderDeProyecto implements Empleado {

	// Coleccion de hijos, especificos a empleados regulares
	private final List<Regular> empleadosHijos = new ArrayList<>();
	private int sueldo;

	public LiderDeProyecto(int sueldo) {
		this.sueldo = sueldo;
	}

	public void add(Regular unEmpleado) {
		empleadosHijos.add(unEmpleado);
	}

	@Override
	public void printEmpleadosACargo() {
		System.out.println("Lider de Proyecto.");
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
