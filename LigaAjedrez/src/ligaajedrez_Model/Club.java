/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligaajedrez_Model;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Club {
    protected ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
    protected ArrayList<String> sedes = new ArrayList<String>();
    private String nombre;
    private String federacion;
    
    public Club(String nombre, String federacion) {
        this.nombre = nombre;
        this.federacion = federacion;
    }

    Club() { }
    
    public void anyadirSedes(String sede){
        boolean res = false;
        for (String jAux : sedes) {
            if (jAux.equals(sede)) {
                res = true;
            }
        }
        if(res == false)
            sedes.add(sede);
        
    }
    
    public boolean checkJugador(Jugador j) {
        boolean res = false;
        for (Jugador jAux : listaJugadores) {
            if (jAux.getsDNI().equals(j.getsDNI())) {
                res = true;
            }
        }
        return res;
    }
    
    public boolean anyadirJugador(Jugador j) {
        boolean res = true;
        for (Jugador jAux : listaJugadores) {
            if (jAux.getsDNI().equals(j.getsDNI())) {
                res = false;
            }
        }
        if (res) {
            listaJugadores.add(j);
        }
        return res;
    }
    
    public boolean eliminarJugador(Jugador j) {
        boolean res = false;
        for (Jugador jAux : listaJugadores) {
            if (jAux.getsDNI().equals(j.getsDNI())) {
                listaJugadores.remove(jAux);
                res = true;
            }
        }
        return res;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setFederacion(String federacion) {
        this.federacion = federacion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getFederacion() {
        return federacion;
    }
    
    public ArrayList<String> getSedes() {
        return sedes ;
    }
    
    public ArrayList<Jugador> getJugadores() {
        return listaJugadores ;
    }
    
}
