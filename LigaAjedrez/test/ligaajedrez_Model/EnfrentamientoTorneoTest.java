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
public class EnfrentamientoTorneoTest {
    Jugador j1,j2,j3;
    String ganador;
    EnfrentamientoTorneo e;
    
    public EnfrentamientoTorneoTest() {
        j1 = new Jugador("Gor", "Navasardyan", "X2752013V", "623105167", "24", "Principiante ", "Valencia" );
        j2 = new Jugador("Lucas", "Arroyo", "Y23718239", "623211567", "23", "Principiante ", "Valencia" );
        j3 = new Jugador("Alberto", "Jose", "Y23712339", "625431567", "22", "Principiante ", "Valencia" );
        e = new EnfrentamientoTorneo(j1,j2);
        e.setFecha("22/10/20");
        e.setDuracion("22");
 
    }

    @Test
    public void testGetJugador1() {

    }

    @Test
    public void testSetJugador1() {

    }

    @Test
    public void testGetJugador2() {

    }

    @Test
    public void testSetJugador2() {

    }

    @Test
    public void testConsultarEnfrentamiento() {
        assertEquals("Lucas",e.consultarEnfrentamiento("Gor")); 
        assertFalse("Lucas".equals(e.consultarEnfrentamiento("Gor"))); 
    }

    @Test
    public void testGetGanador() {

    }

    @Test
    public void testSetGanador() {

    }

    @Test
    public void testGetFecha() {

    }

    @Test
    public void testSetFecha() {

    }

    @Test
    public void testGetDuracion() {

    }

    @Test
    public void testSetDuracion() {

    }

    @Test
    public void testConsultarInfoEnfrentamiento() {
        EnfrentamientoTorneo et = new EnfrentamientoTorneo(j1,j2);
        EnfrentamientoTorneo et1 = new EnfrentamientoTorneo(j1,j3);
        assertSame(et,e.consultarInfoEnfrentamiento(j1.getsNmb(),j2.getsNmb()));
        assertNotSame(et1,e.consultarInfoEnfrentamiento(j1.getsNmb(),j2.getsNmb()));
        
    }
    
}
