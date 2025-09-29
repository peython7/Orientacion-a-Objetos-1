package ar.edu.unlp.objetos.uno.ejercicio4;

public class Producto {

	private double peso;
	private int precioKilo;
	private String descripcion;
	
	public Producto(String d, double peso, int precioKilo) {
		this.descripcion = d;
		this.precioKilo = precioKilo;
		this.peso = peso;
	}
	
	public double getPrecio() {
		return this.peso * this.precioKilo;
	}
	
	public int getPrecioPorKilo() {
		return this.precioKilo;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPrecioPorKilo(int valor) {
		this.precioKilo = valor;
	}
	
	public void setDescripcion(String d) {
		this.descripcion = d;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
}
