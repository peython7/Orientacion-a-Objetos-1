package ar.edu.unlp.objetos.uno.ejercicio7;

public class Cuadrado implements Figura2D{
    private double lado;

    public Cuadrado() {
    	
    }


    public double getLado() {
        return lado;
    }

    public void setLado(double valor) {
        this.lado = valor;
    }


    public double getPerimetro() {
        return 4 * lado;
    }

    public double getArea() {
        return lado * lado;
    }
}
