package ar.edu.unlp.objetos.uno.ejercicio6;

import java.time.LocalDate;

public class Factura {

	private LocalDate fecha;
	private boolean bonificacion;
	private double montoFinal;
	private int usuario;
	
	public Factura(double monto, double energiaReactiva, int idUsuario) {
		this.fecha = LocalDate.now();
		this.usuario = idUsuario;
		this.montoFinal = monto;
		if(energiaReactiva > 0.8) {
			this.bonificacion = true;
			this.montoFinal = monto - (monto * 0.1);
		}
	}
	
	
}
