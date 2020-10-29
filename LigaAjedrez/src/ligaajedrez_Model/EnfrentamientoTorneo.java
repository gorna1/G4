/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligaajedrez_Model;

/**
 *
 * @author Gor
 */
public class EnfrentamientoTorneo {
    private Jugador jugador1, jugador2;
    
    public EnfrentamientoTorneo(Jugador jugador1, Jugador jugador2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }
    
    public Jugador consultarEnfrentamiento(String nombre){
        if(nombre.equals(jugador1.getsNmb()))
            return jugador2;
        else 
            return jugador1;
    }
            
}


