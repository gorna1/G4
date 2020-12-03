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
public class EntrenadorTest {
    
    String sNmb, sApe, sFec, sDNI, sTel;
    ArrayList<String> listaClubsENtrenador = new ArrayList<String>() ;

    public EntrenadorTest() {
        sNmb = "Entrnador";
        sApe = "Apellido";
        sFec = "20/11/2020";
        sDNI = "12345678A";
        sTel = "123456789";
        listaClubsENtrenador.add("Valencia") ;
        listaClubsENtrenador.add("Murcia") ;
    }

    @Test
    public void testEntrenador() {
        Entrenador entrenador = new Entrenador(sNmb, sApe, sFec, sDNI, sTel, listaClubsENtrenador);

        assertEquals(entrenador.getsNmb(), sNmb);
        assertEquals(entrenador.getsApe(), sApe);
        assertEquals(entrenador.getsFec(), sFec);
        assertEquals(entrenador.getsDNI(), sDNI);
        assertEquals(entrenador.getsTel(), sTel);
        assertEquals(entrenador.getlistaClubsEntrenador(), listaClubsENtrenador);
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
    public void testGetsFec() {
    }

    @Test
    public void testSetsFec() {
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
    public void testSetsTel_String() {
    }

    @Test
    public void testGetlistaClubsEntrenador() {
    }

    @Test
    public void testSetsTel_ArrayList() {
    }
    
}

