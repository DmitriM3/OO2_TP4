package modelo;

public class Regular implements Empleado {

	private int sueldo;

	public Regular(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public void printEmpleadosACargo() {
		System.out.println("Empleado Regular");

	}

	@Override
	public double cacularMontoTotaldeSueldos() {
		return this.sueldo;
	}

}
