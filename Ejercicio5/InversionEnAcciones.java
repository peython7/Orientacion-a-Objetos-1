package ar.edu.unlp.objetos.uno.ejercicio5;

public class InversionEnAcciones implements Inversion{

	private int cantidad;
	private Accion accion;
	
	
	@Override
	public double valorActual() {
		return accion.getValor() * this.cantidad;
	}
	
	
}
