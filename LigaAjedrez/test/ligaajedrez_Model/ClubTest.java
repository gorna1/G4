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
public class ClubTest {
    
    String sNom, sFed ;
    String sSede ;
    ArrayList<String> sedes = new ArrayList<String>();
    ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    Jugador jugador ;
    
    public ClubTest() {
        sNom = "Paterna" ;
        sFed = "Valencia" ;
        sSede = "Colegio Paterna" ;
    }

    @Test
    public void testClub() {
        Club club = new Club(sNom, sFed) ;

        assertEquals(club.getNombre(), sNom) ;
        assertEquals(club.getFederacion(), sFed) ;
        
    }
    @Test
    public void testAnyadirSedes() {
        /*Club club = new Club() ;
        sedes = club.getSedes() ;
        
        club.anyadirSedes(sSede) ;
        sedes.add(sSede) ;
        
        assertEquals(club.getSedes(), sedes) ;*/
    }

    @Test
    public void testCheckJugador() {
        /*Club club = new Club() ;
        
        assertTrue(club.checkJugador(jugador)) ;*/
    }

    @Test
    public void testAnyadirJugador() {
        /*Club club = new Club() ;
        jugadores = club.getJugadores() ;
        
        club.anyadirJugador(jugador) ;
        jugadores.add(jugador) ;
        
        assertEquals(club.getJugadores(), jugadores) ;*/
    }

    @Test
    public void testEliminarJugador() {
        /*Club club = new Club() ;
        club.anyadirJugador(jugador) ;
        
        jugadores = club.getJugadores() ;
        
        club.eliminarJugador(jugador) ;
        jugadores.remove(jugador) ;
        
        assertEquals(club.getJugadores(), jugadores) ;*/
    }

    @Test
    public void testSetNombre() {
    }

    @Test
    public void testSetFederacion() {
    }

    @Test
    public void testGetNombre() {
    }

    @Test
    public void testGetFederacion() {
    }
    
}
