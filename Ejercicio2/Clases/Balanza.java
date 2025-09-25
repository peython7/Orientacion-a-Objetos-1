package ar.edu.unlp.objetos.uno.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private double pesoTotal;
	private int precioTotal;
	private int cantidadProductos;
	private List<Producto> productos;
	
	public Balanza() {
		this.productos = new ArrayList<Producto>();
	}
	
	public void ponerEnCero()
	{
		this.pesoTotal= 0;
		this.precioTotal = 0;
		this.cantidadProductos = 0;
	}
	
	public void agregarProducto(Producto p) {
		this.productos.add(p);
		this.pesoTotal += p.getPeso();
		this.precioTotal += p.getPrecio();
		this.cantidadProductos++;
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.cantidadProductos,this.pesoTotal,this.precioTotal);
		return ticket;
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
}
