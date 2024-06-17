package actividad2;

public class motocicleta extends vehiculo{
	
	private int cilindrada;

	public motocicleta(String marca, double precio, boolean efectivo, int cilindrada) {
		super(marca, precio, efectivo);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
    public double calcularBonificacion() {
        double total=(precio - (precio * 0.20));
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
