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
public class Torneo {
    String federacion ;
    String nombreTorneo ;
    String sede;
    protected ArrayList<Jugador> jugadoresTorneo = new ArrayList<Jugador>();
    protected ArrayList<EnfrentamientoTorneo> listaEnfrentamientos = new ArrayList<EnfrentamientoTorneo>();
    protected ArrayList<Jugador> listaRivales = new ArrayList<Jugador>();
    
    
    public Torneo(String sNmb, String sFed){
        this.nombreTorneo = sNmb ;
        this.federacion = sFed ;
    }
    
    public String getNombreTorneo() {
        return nombreTorneo;
    }
    
    public Torneo (String federacion){
        this.federacion = federacion;
    }

    public String getFederacion() {
        return federacion;
    }

    public void setFederacion(String ciudad) {
        this.federacion = federacion;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
    
    public void anyadirJugadorTorneo(Jugador jugador){
        jugadoresTorneo.add(jugador);
    }
    
    public void anyadirEnfrentamientos(Jugador j1, Jugador j2){
        listaEnfrentamientos.add(new EnfrentamientoTorneo(j1,j2));
    }
    
    public ArrayList consultarEnfrentamiento(String nombre){
        
        for(EnfrentamientoTorneo et: listaEnfrentamientos)
            listaRivales.add(et.consultarEnfrentamiento(nombre));
        
        
        return listaRivales;
    }
            
    
}
