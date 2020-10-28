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
    String ciudad;
    String sede;
    protected ArrayList<Jugador> jugadoresTorneo = new ArrayList<Jugador>();
    
    
    public Torneo (String ciudad){
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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
    
}
