package ar.edu.unlp.objetos.uno.ejercicio5;

import java.util.List;

public class Inversor {

	private List<Inversion> inversiones;
	
	public void agregarInversion(Inversion i) {
		inversiones.add(i);
	}
	
	public void quitarInversion(Inversion i) {
        if( this.inversiones.contains(i)) {
			inversiones.remove(i); 
        }
    }
	
	public double getValorTotalInversiones() {
		return inversiones.stream()
	            .mapToDouble(Inversion::valorActual)
	            .sum();
	}
}
