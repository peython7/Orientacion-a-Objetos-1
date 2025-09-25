package ar.edu.unlp.objetos.uno.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {

	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String c) {
		this.fecha = LocalDate.now();
		this.items = new ArrayList<Item>();
		this.cliente = c;
	}
	
	public String getCliente() {
		return this.cliente;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		int total = 0;
		for(Item i: items) {
			total += i.costo();
		}
		return total;
	}
}
