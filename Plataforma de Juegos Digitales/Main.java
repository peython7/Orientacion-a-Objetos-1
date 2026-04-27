/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author pedro
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Plataforma plataforma = new Plataforma("PeyGames", 100);
       
       Juego j1 = new Juego("FIFA 26", 69.99, "Futbol");
       Juego j2 = new Juego("NBA 2K26", 24.99, "Basquet");
       
       plataforma.agregarJuego(j1);
       plataforma.agregarJuego(j2);
       
       Usuario user1 = new Usuario(27, "Peython", 100);
       
       plataforma.registrarUsuario(user1);
       
       System.out.println(user1.comprarJuego(j1) + "\n");
       System.out.println(user1.comprarJuego(j2) + "\n");
       
       System.out.println(user1.jugar("NBA 2K26") + "\n");
       user1.instalarJuego("NBA 2K26");
       System.out.println(user1.jugar("NBA 2K26") + "\n");

    }
    
}
