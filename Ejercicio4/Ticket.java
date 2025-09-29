package ar.edu.unlp.objetos.uno.ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {

	private LocalDate fecha;
	private List<Producto> productos;
	private int precioTotal;
	private double pesoTotal;
	
	public Ticket(List<Producto> prod, double peso, int precio) {
		this.fecha = LocalDate.now();
		this.productos = new ArrayList<Producto>();
		this.productos.addAll(prod);
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
		return this.productos.size();
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public List<Producto> getProdutos(){
		return this.productos;
	}
}
