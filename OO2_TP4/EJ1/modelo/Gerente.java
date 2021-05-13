package modelo;

import java.util.ArrayList;
import java.util.List;

public class Gerente implements Empleado {

	// Coleccion de hijos, especificos a mandos medios
	private final List<MandoMedio> empleadosHijos = new ArrayList<>();
	private int sueldo;

	public Gerente(int sueldo) {
		this.sueldo = sueldo;
	}

	public void add(MandoMedio unEmpleado) {
		empleadosHijos.add(unEmpleado);
	}

	@Override
	public void printEmpleadosACargo() {
		System.out.println("Gerente.");
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
