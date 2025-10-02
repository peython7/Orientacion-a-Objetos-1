package ar.edu.unlp.objetos.uno.ejercicio6;

import java.time.LocalDate;

public class Consumo {
	private LocalDate fecha;
	private double energiaActiva;
	private double energiaReactiva;
	private CuadroTarifario cuadroT;
	
	
	public double getCostoDelConsumo() {
		return this.energiaActiva * this.cuadroT.getKwh();
	}
	
	public double getEnergiaReactiva() {
		return this.energiaReactiva;
	}
	
}
