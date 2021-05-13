package modelo;

import java.util.ArrayList;
import java.util.List;

public class MandoMedio implements Empleado {

	// Coleccion de hijos, especificos a lideres de proyectos
	private final List<LiderDeProyecto> empleadosHijos = new ArrayList<>();
	private int sueldo;

	public MandoMedio(int sueldo) {
		this.sueldo = sueldo;
	}

	public void add(LiderDeProyecto unEmpleado) {
		empleadosHijos.add(unEmpleado);
	}

	@Override
	public void printEmpleadosACargo() {
		System.out.println("Mandos Medios.");
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
