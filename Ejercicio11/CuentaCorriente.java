package ar.edu.unlp.objetos.uno.ejercicio11;

public class CuentaCorriente extends Cuenta{
	private double limite;
	
	public CuentaCorriente() {
		super();
		this.limite = 0;
	}
	
	public void setLimite(double lim) {
		this.limite =  0 - lim;
	}
	
	public double getLimite() {
		return this.limite;
	}

	@Override
	protected boolean puedeExtraer(double monto) {
		 return ((this.getSaldo() - monto) >= (this.limite));

	}

	
}
