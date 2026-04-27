/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author pedro
 */
public class Plataforma {
    private String nombre;
    private Usuario[] usuarios;
    private int usuariosRegistrados;
    private Juego[] juegosDisponibles;
    private int juegosAgregados;
    private int max;
    
    public Plataforma(String n, int cantidadJuegosMaxima){
        this.nombre = n;
        this.max = cantidadJuegosMaxima;
        this.usuarios = new Usuario[5];
        this.juegosDisponibles = new Juego[cantidadJuegosMaxima];
        this.juegosAgregados = 0;
        this.usuariosRegistrados = 0;
        this.inicializarJ();
        this.inicializarU();
    }
    
    private void inicializarJ(){
        for (Juego j:juegosDisponibles){
            j= new Juego();
        }
    }
    
    private void inicializarU(){
        for (Usuario u:usuarios){
            u= new Usuario();
        }
    }
    
    public void registrarUsuario(Usuario u){
        if(this.usuariosRegistrados < 5){
            this.usuarios[this.usuariosRegistrados] = u;
            this.usuariosRegistrados++;
        }
    }
    
    
    public void agregarJuego(Juego j){
        if(this.juegosAgregados < max){    
            this.juegosDisponibles[this.juegosAgregados] = j;
            this.juegosAgregados++;
        }
    }
}
