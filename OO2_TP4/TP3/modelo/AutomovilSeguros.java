package modelo;

public class AutomovilSeguros implements Seguros {

	private double monto;

	public AutomovilSeguros(double monto) {
		super();
		this.monto = monto;
	}

	@Override
	public double calcularCosto() {
		return this.monto;
	}

}
