package modelo;

public class HogarSeguros implements Seguros {

	private double monto;

	public HogarSeguros(double monto) {
		super();
		this.monto = monto;
	}

	@Override
	public double calcularCosto() {
		return this.monto;
	}

}
