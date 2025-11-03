package ar.edu.unlp.objetos.uno.ejercicio11;

public class CajaDeAhorro extends Cuenta{

	public CajaDeAhorro() {
		super();
	}
	
	@Override
	protected boolean puedeExtraer(double monto) {
		return ((this.getSaldo() - (monto * 1.02)) > 0);
	}

	
}
