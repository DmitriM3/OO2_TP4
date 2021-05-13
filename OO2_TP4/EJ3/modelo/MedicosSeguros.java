package modelo;

public class MedicosSeguros implements Seguros {

	private double monto;

	public MedicosSeguros(double monto) {
		super();
		this.monto = monto;
	}

	@Override
	public double calcularCosto() {
		return this.monto;
	}

}
