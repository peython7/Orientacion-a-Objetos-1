
package ar.edu.unlp.objetos.uno.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private double pesoTotal;
	private int precioTotal;
	private List<Producto> productos;
	
	public Balanza() {
		this.productos = new ArrayList<Producto>();
	}
	
	public void ponerEnCero()
	{
		this.pesoTotal= 0;
		this.precioTotal = 0;
		this.productos.clear();
	}
	
	public void agregarProducto(Producto p) {
		this.productos.add(p);
		this.pesoTotal += p.getPeso();
		this.precioTotal += p.getPrecio();
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.productos, this.pesoTotal,this.precioTotal);
		return ticket;
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
	
	public List<Producto> getProdutos(){
		return this.productos;
	}
}
