/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import ligaajedrez_Model.*;
import ligaajedrez_Model.LigaAjedrez;

/**
 *
 * @author alumno
 */
public class Administrador {
    
    private LigaAjedrez liga;
        
    
    
    
    public Administrador(LigaAjedrez liga){
        this.liga = liga;
    }
    
    public ArrayList<Jugador> consultarJugadores(){
        return liga.consultarJugadores();
    }
    
    public EnfrentamientoTorneo consultarEnfrentamientos(String uno, String dos){
        return liga.consultarInfoEnfrentamiento(uno, dos);
    }
    public ArrayList<Jugador> consultarEnfrentamiento(String uno){
        return liga.consultarEnfrentamiento(uno);
    }
    
    public ArrayList<Club> getClubs(String federacion){
        return liga.getClubs(federacion);
    }
    public void anyadirJugadorTorneo(Torneo t, Jugador j){
        liga.anyadirJugadorTorneo(t, j);
    }
    public ArrayList<Torneo> consultarTorneo(){
        return liga.consultarTorneo();
    }
    public void anyadirGerente(Gerente g){
        liga.anyadirGerente(g);
    }
    public Gerente buscarGerente(String sDNI){
        return liga.buscarGerente(sDNI);
    }
    public void eliminarGerente(String sDNI){
        liga.eliminarGerente(sDNI);
    }
    public void anyadirEntrenador(Entrenador e){
        liga.anyadirEntrenador(e);
    }
    public Entrenador buscarEntrenador(String sDNI){
        return liga.buscarEntrenador(sDNI);
    }
    public void eliminarEntrenador(String sDNI){
        liga.eliminarEntrenador(sDNI);
    }
    public void anyadirJugadores(Jugador j){
        liga.anyadirJugadores(j);
    }
    public void eliminarJugador(String sDNI){
        liga.eliminarJugador(sDNI);
    }
    public void cambiarClubJugador(Jugador jugador, String sClb_Nvo){
        liga.cambiarClubJugador(jugador, sClb_Nvo);
    }
    public Jugador buscarJugador(String sDNI){
        return liga.buscarJugador(sDNI);
    }
}

