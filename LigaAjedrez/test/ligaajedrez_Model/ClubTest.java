/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligaajedrez_Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alberto
 */
public class ClubTest {
    
    String sNom, sFed ;
    
    public ClubTest() {
        sNom = "Alberto" ;
        sFed = "Valencia" ;
    }

    @Test
    public void testClub() {
        Club club = new Club(sNom, sFed) ;

        assertEquals(club.getNombre() , sNom) ;
        
    }
    @Test
    public void testAnyadirSedes() {
    }

    @Test
    public void testCheckJugador() {
    }

    @Test
    public void testAnyadirJugador() {
    }

    @Test
    public void testEliminarJugador() {
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
