package actividad2;

public class Main {

	public static void main(String[] args) {
		// Sistema de Vehículos y Descuentos Descripción: Crea un sistema que gestione vehículos y calcule el descuento aplicable. 
		// Los vehículos pueden ser de dos tipos: coches y motocicletas. Si el pago es en efectivo, para el auto es del 15% y la moto del 20%
		
		coche venta1 = new coche("Fiat", 2000000, true, 500);
		venta1.mostrarEstado();
		
		motocicleta venta2 =new motocicleta("Zanella", 800000, false, 250);
		venta2.mostrarEstado();
		
	}
}
