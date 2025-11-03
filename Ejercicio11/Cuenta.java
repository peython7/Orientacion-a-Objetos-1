package ar.edu.unlp.objetos.uno.ejercicio11;

public abstract class Cuenta {

	private double saldo;
	
	
	public Cuenta() {
		this.saldo = 0;
	}
	
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	protected void extraerSinControlar(double valor) {
		this.saldo -= valor;
	}
	
	public boolean extraer(double monto) {
		if(puedeExtraer(monto)) {
			return true;
		}
		return false;
	}
	
	
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		if(this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
	protected abstract boolean puedeExtraer(double monto);
}
