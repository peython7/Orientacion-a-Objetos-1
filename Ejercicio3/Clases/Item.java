package ar.edu.unlp.objetos.uno.ejercicio3;

public class Item {

	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String d, int c, double costo) {
		this.cantidad = c;
		this.costoUnitario = costo;
		this.detalle = d;
	}
	
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	
	public double costo() {
		return this.costoUnitario * this.cantidad;
	}
}
