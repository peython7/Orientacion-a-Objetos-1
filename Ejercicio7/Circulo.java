package ar.edu.unlp.objetos.uno.ejercicio7;

public class Circulo implements Figura2D{
    private double radio;

    
    public Circulo() {
    	
    }

    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double valor) {
        this.radio = valor;
    }

    public double getDiametro() {
        return radio * 2;
    }

    public void setDiametro(double valor) {
        this.radio = valor / 2;
    }


    public double getPerimetro() {
        return Math.PI * getDiametro();
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }
}

