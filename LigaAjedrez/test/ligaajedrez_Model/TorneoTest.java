/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligaajedrez_Model;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alberto
 */
public class TorneoTest {
    String nomb, federacion;
    Torneo t;
    protected ArrayList<Jugador> jugadoresTorneo = new ArrayList<Jugador>();
    protected ArrayList<EnfrentamientoTorneo> listaEnfrentamientos = new ArrayList<EnfrentamientoTorneo>();
    protected ArrayList<Jugador> listaRivales = new ArrayList<Jugador>();
    Jugador j1,j2,j3;
    
    public TorneoTest() {
        nomb = "Torneo de prueba";
        federacion = "Valencia";
        t = new Torneo(nomb,federacion);
        t.setSede("Burjassot");
        j1 = new Jugador("Gor", "Navasardyan", "X2752013V", "623105167", "24", "Principiante ", "Valencia" );
        j2 = new Jugador("Lucas", "Arroyo", "Y23718239", "623211567", "23", "Principiante ", "Valencia" );
        j3 = new Jugador("Alberto", "Jose", "Y23712339", "625431567", "22", "Principiante ", "Valencia" );
        jugadoresTorneo.add(j1);
        listaEnfrentamientos.add(new EnfrentamientoTorneo(j1, j2)) ;
        listaRivales.add(j2);
          
    }

    @Test
    public void testGetNombreTorneo() {

    }

    @Test
    public void testGetFederacion() {

    }

    @Test
    public void testSetFederacion() {

    }

    @Test
    public void testGetSede() {

    }

    @Test
    public void testSetSede() {

    }

    @Test
    public void testAnyadirJugadorTorneo() {
        j1 = new Jugador("Gor", "Navasardyan", "X2752013V", "623105167", "24", "Principiante ", "Valencia" );
        ArrayList<Jugador> jugadoresTorneo1 = new ArrayList<Jugador>();
        jugadoresTorneo1.add(j1);
        
        j2 = new Jugador("Lucas", "Arroyo", "Y23718239", "623211567", "23", "Principiante ", "Valencia" );
        ArrayList<Jugador> jugadoresTorneo2 = new ArrayList<Jugador>();
        jugadoresTorneo2.add(j2);
        
        assertArrayEquals(jugadoresTorneo,jugadoresTorneo1);
        assertArrayEquals(jugadoresTorneo,jugadoresTorneo2); // va a dar false porque no son iguales.
        
    }

    @Test
    public void testAnyadirEnfrentamientos() {
        j2 = new Jugador("Lucas", "Arroyo", "Y23718239", "623211567", "23", "Principiante ", "Valencia" );
        j1 = new Jugador("Gor", "Navasardyan", "X2752013V", "623105167", "24", "Principiante ", "Valencia" );
        ArrayList<EnfrentamientoTorneo> listaEnfrentamientos1 = new ArrayList<EnfrentamientoTorneo>();
        ArrayList<EnfrentamientoTorneo> listaEnfrentamientos2 = new ArrayList<EnfrentamientoTorneo>();
        listaEnfrentamientos1.add(new EnfrentamientoTorneo(j1,j2));
        listaEnfrentamientos2.add(new EnfrentamientoTorneo(j1,j3));
        
        assertArrayEquals(listaEnfrentamientos,listaEnfrentamientos1);
        assertArrayEquals(listaEnfrentamientos,listaEnfrentamientos2); // no va a funcionar, son arrays diferentes.
        
        
    }

    @Test
    public void testConsultarEnfrentamiento() {
        assertArrayEquals(listaRivales,t.consultarEnfrentamiento("Gor"));
    }

    @Test
    public void testConsultarInfoEnfrentamiento() {
        j2 = new Jugador("Lucas", "Arroyo", "Y23718239", "623211567", "23", "Principiante ", "Valencia" );
        j1 = new Jugador("Gor", "Navasardyan", "X2752013V", "623105167", "24", "Principiante ", "Valencia" );
        ArrayList<EnfrentamientoTorneo> listaEnfrentamientos1 = new ArrayList<EnfrentamientoTorneo>();
        listaEnfrentamientos1.add(new EnfrentamientoTorneo(j1,j2));
        
        assertArrayEquals(listaEnfrentamientos1,t.consultarInfoEnfrentamiento("Gor","Lucas"));
        
    }
    
}
