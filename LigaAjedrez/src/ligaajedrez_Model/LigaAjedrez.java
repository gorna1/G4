/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligaajedrez_Model;

import java.util.ArrayList;

/**
 *
 * @author Gor
 */


public class LigaAjedrez {
    protected ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
    protected ArrayList<Torneo> listaTorneos = new ArrayList<Torneo>();
    protected ArrayList<Jugador> listaRivales = new ArrayList<Jugador>();       
    
    
    public void anyadirJugadores(Jugador jugador){
        listaJugadores.add(jugador);
    }   
    
    public void anyadirTorneo(Torneo torneo){
        listaTorneos.add(torneo);
    }
    
    public ArrayList<Torneo> consultarTorneo(){
        return listaTorneos;
    }
    
    public void anyadirJugadorTorneo(Torneo t, Jugador j){
        for(Torneo lTorneos :listaTorneos)
            if(lTorneos == t)
                lTorneos.anyadirJugadorTorneo(j);
            }
                
    public ArrayList<Jugador> consultarJugadores(){
        return listaJugadores;
    }
    
    public ArrayList<Jugador> consultarEnfrentamiento(String nombre){
        
        for(Torneo t : listaTorneos)
            listaRivales = t.consultarEnfrentamiento(nombre);
    
        return listaRivales;
    }
    public void anyadirEnfrentamiento(Jugador j1, Jugador j2){
        for(Torneo lT: listaTorneos)
            lT.anyadirEnfrentamientos(j1, j2);  // es de prueba.
    }
    
    
}



