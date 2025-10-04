package ar.edu.unlp.objetos.uno.ejercicio7;

public class Cuerpo3D {
    private double altura;
    private Figura2D base;  
    
    public Cuerpo3D() {
        
    }
    
    public void setCaraBasal(Figura2D cara) {
    	this.base = cara;
    }

    public double getAltura() { 
      return altura; 
    }

    public void setAltura(double h) { 
      this.altura = h; 
    }
  
    public Figura2D getBase() { 
      return base; 
    }
  
    public void setBase(Figura2D b) { 
      this.base = b; 
    }

    public double getVolumen() {
        return base.getArea() * altura;
    }


    public double getSuperficieExterior() {
        return 2 * base.getArea() + base.getPerimetro() * altura;
    }
}

