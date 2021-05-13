package modelo;

public class VidaSeguros implements Seguros {

	private double monto;

	public VidaSeguros(double monto) {
		super();
		this.monto = monto;
	}

	@Override
	public double calcularCosto() {
		return this.monto;
	}

}
