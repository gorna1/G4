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
    private String ganador;
    private String fecha;
    private float duracion;
  
    public EnfrentamientoTorneo(Jugador jugador1, Jugador jugador2){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;        
    }
    public EnfrentamientoTorneo(){
        ;
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
        
        Jugador rival;
        if(nombre.equals(jugador1.getsNmb()))
            rival = jugador2;
        else 
            rival = jugador1;
        return rival;
    }
    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
    
    public EnfrentamientoTorneo consultarInfoEnfrentamiento(String uno, String dos){
        EnfrentamientoTorneo et = null;
        if(uno.equals(jugador1.getsNmb()) && dos.equals(jugador2.getsNmb()))
            et = this;
        return et;
    }
}


