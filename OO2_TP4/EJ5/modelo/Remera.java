package modelo;

public abstract class Remera {

	private double precioUnitario;

	public Remera(double precio) {
		this.precioUnitario = precio;
	}

	abstract protected double calcularPrecioFinal();

	public double calcularPrecioVenta() {

		return this.calcularPrecioFinal();
	}

	protected double precioUnitario() {
		return this.precioUnitario;
	}

}
