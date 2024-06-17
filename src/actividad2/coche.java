package actividad2;

public class coche extends vehiculo {
	
	private int caballosDeFuerza;

	public coche(String marca, double precio, boolean efectivo, int caballosDeFuerza) {
		super(marca, precio, efectivo);
		this.caballosDeFuerza = caballosDeFuerza;
	}

	public int getCaballosDeFuerza() {
		return caballosDeFuerza;
	}

	public void setCaballosDeFuerza(int caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}
	
	    public double calcularBonificacion() {
	        double total=(precio-(precio * 0.15));
	        return total;
	    }

    public void mostrarEstado() {
        System.out.println("Vehiculo: " + marca + ", Precio: $" + precio);
        if (efectivo) {
        	double total=calcularBonificacion();
        	System.out.println("Por pagar en efectivo el precio final es de $ " + total);
        }
    }
}
