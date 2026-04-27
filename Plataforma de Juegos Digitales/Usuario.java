/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author pedro
 */
public class Usuario {
    private String nombre; 
    private double saldo;
    private Juego[] juegos;
    private int juegosAgregados;
    
    public Usuario(double s, String n, int cantidadJuegosMaxima){
        this.nombre = n;
        this.juegos = new Juego[cantidadJuegosMaxima];
        this.saldo = s;
        this.inicializar();
        this.juegosAgregados = 0;
    }
    
    public Usuario (){
        
    }
    
    public void instalarJuego(String n){
        for(Juego j : juegos){
            if(j != null){
                if(j.getNombre().equals(n)){
                    j.instalar();
                  }
            }
        }
    }
    
    private void inicializar(){
        for (Juego j:juegos){
            j= new Juego();
        }
    }
    
    public String jugar(String nombreJuego){
        for(Juego j:this.juegos){
            if (j.getNombre().equals(nombreJuego)) {
                if(j.jugar()){
                    return "Iniciando juego " + nombreJuego + "...";
                }
                else{
                    return "Se debe instalar el juego " + nombreJuego + " para utilizarlo.";
                }
            }
        }
        return "No se ha hallado el juego buscado en la biblioteca.";
    }
    
    private void descontarSaldo(double total){
        this.saldo = this.saldo - total;
    }
    
    public String comprarJuego(Juego nuevoJuego){
        if(nuevoJuego.getPrecio() <= this.saldo){
            descontarSaldo(nuevoJuego.getPrecio());
            this.juegos[this.juegosAgregados] = nuevoJuego;
            this.juegosAgregados++;
            return "El juego ha sido comprado exitosamente.";
        }
        else{
            return "No ha podido efectuarse la compra.";
        }
    }
}
