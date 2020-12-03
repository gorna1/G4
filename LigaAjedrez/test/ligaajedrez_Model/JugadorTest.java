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
public class JugadorTest {
    
    String sNmb, sApe, sDNI, sTel, sEdad, sElo, sClb ;

    public JugadorTest() {
        sNmb = "Jugador";
        sApe = "Apellido";
        sDNI = "12345678A";
        sTel = "123456789";
        sEdad = "34";
        sElo = "Principiante";
        sClb = "Valencia";
    }

    @Test
    public void testJugador() {
        Jugador jugador = new Jugador(sNmb, sApe, sDNI, sTel, sEdad, sElo, sClb);

        assertEquals(jugador.getsNmb(), sNmb);
        assertEquals(jugador.getsApe(), sApe);
        assertEquals(jugador.getsDNI(), sDNI);
        assertEquals(jugador.getsTel(), sTel);
        assertEquals(jugador.getsEdad(), sEdad);
        assertEquals(jugador.getsElo(), sElo);
        assertEquals(jugador.getsClb(), sClb);
    }

    @Test
    public void testGetsNmb() {
    }

    @Test
    public void testSetsNmb() {
    }

    @Test
    public void testGetsApe() {
    }

    @Test
    public void testSetsApe() {
    }

    @Test
    public void testGetsDNI() {
    }

    @Test
    public void testSetsDNI() {
    }

    @Test
    public void testGetsTel() {
    }

    @Test
    public void testSetsTel() {
    }

    @Test
    public void testGetsEdad() {
    }

    @Test
    public void testSetsEdad() {
    }

    @Test
    public void testGetsElo() {
    }

    @Test
    public void testSetsElo() {
    }

    @Test
    public void testGetsClb() {
    }

    @Test
    public void testSetsClb() {
    }
    
}