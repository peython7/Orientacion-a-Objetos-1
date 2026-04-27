/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author pedro
 */
public class Juego {
    private double precio;
    private String genero;
    private boolean instalado;
    private int horasJugadas;
    private String nombre;
    
    public Juego(){
        
    }
    
    public Juego(String n, double p, String g){
        this.nombre = n;
        this.precio = p;
        this.genero = g;
        this.instalado = false;
        this.horasJugadas = 0;
    }
    
    public boolean jugar(){
        if(this.estaInstalado()){
            this.horasJugadas++;
            return true;
        }
        return false;
    }
    
    public void instalar(){
        this.instalado = true;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return this.precio;
    }
    
    public boolean estaInstalado(){
        return this.instalado;
    }
    
    public void aumentarHoras(){
        this.horasJugadas++;
    }
}
