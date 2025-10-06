package ar.edu.unlp.objetos.uno.ejercicio8;

public class Mamifero {
	private Mamifero madre;
	private Mamifero padre;
	private String especie;
	private String Identificador;
	
	
	public Mamifero(String id) {
		this.Identificador = id;
	}
	
	public Mamifero() {
		
	}
	
	public void setIdentificador(String id) {
		this.Identificador = id;
	}
	
	public String getIdentificador() {
		return this.Identificador;
	}
	
	public void setEspecie(String e) {
		this.especie = e;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setPadre(Mamifero p) {
		this.padre = p;
	}
	
	public void setMadre(Mamifero m) {
		this.madre = m;
	}
	
	public Mamifero getPadre() {
		return this.padre;
	}
	
	public Mamifero getMadre() {
		return this.madre;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.madre == null) {
			return this.madre;
		}
		return this.madre.getMadre();
	}
	
	public Mamifero getAbuelaPaterna() {
		if(this.padre == null) {
			return null;
		}
		return this.padre.getMadre();
	}
	
	public Mamifero getAbueloMaterno() {
		if(this.madre == null) {
			return null;
		}
		return this.madre.getPadre();
	}
	
	public Mamifero getAbueloPaterno() {
		if(this.padre == null) {
			return null;
		}
		return this.padre.getPadre();
	}
	
	public boolean tieneComoAncestroA(Mamifero m) {
	    return tieneComoAncestroA2(this.madre, m) || tieneComoAncestroA2(this.padre, m);
	}

	private boolean tieneComoAncestroA2(Mamifero actual, Mamifero m) {
	    if (actual == null || m.getIdentificador() == null) return false;
	    if (m.getIdentificador().equals(actual.getIdentificador())) return true;
	    // sigo buscando por las dos ramas del actual
	    if (tieneComoAncestroA2(actual.getMadre(), m)) {
	    	return true;
	    }else {
	    	if (tieneComoAncestroA2(actual.getPadre(), m)) {
	    		return true;
	    	}
	    }
	    return false;    
	}
}

