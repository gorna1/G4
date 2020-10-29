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
    protected ArrayList<Jugador> listaMorosos = new ArrayList<Jugador>();
    
    
    public void anyadirJugadores(Jugador jugador){
        //Anyadir es para Sprint 1, modificar no.
        /*if(listaJugadores.contains(jugador))
            listaJugadores.add(jugador);
        else
            listaJugadores.add(jugador);*/
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
    
    //Sprint 2
    public void eliminarJugador(String sDNI){
        Jugador jugador = new Jugador() ;
        
        for(int i=0; i<listaJugadores.size(); i++)
            if(listaJugadores.get(i).getsDNI().equals(sDNI))
                jugador = listaJugadores.get(i) ;
            else
                System.out.println("El DNI introducido no corresponde a ningun jugador") ;
        
        if(listaMorosos.contains(jugador))
            System.out.println("El jugador con el DNI introducido esta en la lista de morosos") ;
        else{
            listaJugadores.remove(jugador) ;
            System.out.println("El jugador con el DNI introducido a sido eliminado") ;
        }
            
    }
}
    




