package ar.edu.unlp.objetos.uno.ejercicio2;

import java.time.LocalDate;

public class Ticket {

	private LocalDate fecha;
	private int cantidadProductos;
	private int precioTotal;
	private double pesoTotal;
	
	public Ticket(int prod, double peso, int precio) {
		this.fecha = LocalDate.now();
		this.cantidadProductos = prod;
		this.precioTotal = precio;
		this.pesoTotal = peso;
	}
	
	public double impuesto() {
		return this.precioTotal * 0.21;
	}
	
	public int getPrecioTotal() {
		return this.precioTotal;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public int getCantidadDeProductos() {
		return this.cantidadProductos;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
}
