package ar.edu.unlp.objetos.uno.ejercicio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	
	private LocalDate fechaConstitucion;
	private double montoInicial;
	private double tasaDiaria;

	@Override
	public double valorActual() {
		return this.montoInicial + (this.montoInicial * this.interesesDiariosAcumulados());
	}

	
	private double interesesDiariosAcumulados() {
		return this.tasaDiaria * this.diasHastaHoy();
	}
	
	private int diasHastaHoy() {
		LocalDate hoy = LocalDate.now();
        return (int) Math.max(0, ChronoUnit.DAYS.between(this.fechaConstitucion, hoy));
	}
}
