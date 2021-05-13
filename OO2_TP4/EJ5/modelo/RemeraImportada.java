package modelo;

public class RemeraImportada extends Remera {

	public RemeraImportada(double precio) {
		super(precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double calcularPrecioFinal() {
		return (this.calcularRecargo(this.precioUnitario()) + this.calcularImpuestoAduanero(this.precioUnitario())
				+ this.calcularImpuestoComercial(this.precioUnitario()) + this.precioUnitario());

	}

	private double calcularRecargo(double precio) {
		return (precio * 0.03);
	}

	private double calcularImpuestoAduanero(double precio) {
		return (precio * 0.05);
	}

	private double calcularImpuestoComercial(double precio) {
		return (precio * 0.25);
	}

}
