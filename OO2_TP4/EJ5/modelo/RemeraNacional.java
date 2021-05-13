package modelo;

public class RemeraNacional extends Remera {

	public RemeraNacional(double precio) {
		super(precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calcularPrecioFinal() {
		return (this.calcularRecargoTransporte(this.precioUnitario())
				+ this.calcularImpuestoBonificacion(this.precioUnitario())
				+ this.calcularImpuestoComercial(this.precioUnitario()) + this.precioUnitario());
	}

	private double calcularRecargoTransporte(double precio) {
		return (precio * 0.015);
	}

	private double calcularImpuestoBonificacion(double precio) {
		return (precio * 0.20);
	}

	private double calcularImpuestoComercial(double precio) {
		return (precio * 0.15);
	}

}
