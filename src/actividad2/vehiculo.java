package actividad2;

public class vehiculo {
	
	protected String marca;
	protected double precio;
	protected boolean efectivo;

	public vehiculo(String marca, double precio, boolean efectivo) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.efectivo = efectivo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isEfectivo() {
		return efectivo;
	}

	public void setEfectivo(boolean efectivo) {
		this.efectivo = efectivo;
	}

	@Override
	public String toString() {
		return "vehiculo [marca=" + marca + ", precio=" + precio + ", efectivo=" + efectivo + "]";
	}
}
