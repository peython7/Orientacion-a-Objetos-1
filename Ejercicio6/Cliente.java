package ar.edu.unlp.objetos.uno.ejercicio6;

import java.util.List;

public class Cliente {
	private String nombre;
	private String apellido;
	private String domicilio;
	private int id;
	private List<Consumo> consumos;
	
	public void agregarConsumo(Consumo c) {
		consumos.add(c);
	}
	
	public Factura emitirFactura() {
		Consumo ultimo = this.consumos.get(this.consumos.size() - 1);
		Factura f = new Factura(ultimo.getCostoDelConsumo(), ultimo.getEnergiaReactiva(),this.id);
		return f;
	}
}
