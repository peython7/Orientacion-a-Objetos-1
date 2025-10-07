package ar.edu.unlp.objetos.uno.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Farola {

	private boolean encendida;
	private List<Farola> vecinas;
	
	public Farola() {
		this.encendida = false;
		this.vecinas = new ArrayList<Farola>();
	}
	
	public void pairWithNeighbor(Farola f) {
		if(!this.vecinas.contains(f)) {
			this.vecinas.add(f);
			f.pairWithNeighbor(this);
		}
	}
	
	public void turnOn() {
		if(!this.encendida) {
			this.encendida = true;
			for(Farola v: this.vecinas) {
				v.turnOn();
			}
		}
	}
	
	public void turnOff() {
		if(this.encendida) {
			this.encendida = false;
			for (Farola v:this.vecinas) {
				v.turnOff();
			}
		}
	}
	
	public List<Farola> getNeighbors(){
		return this.vecinas;
	}
	
	public boolean isOn() {
		if(this.encendida) {
			return true;
		}
		return false;
	}
	
	public boolean isOff() {
		if(!this.encendida) {
			return true;
		}
		return false;
	}
}
