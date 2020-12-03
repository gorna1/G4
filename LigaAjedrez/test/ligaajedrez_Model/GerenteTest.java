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
public class GerenteTest {
    
    String sDNI, sNmb, sNom, sIRPF, sClb;

    public GerenteTest() {
        sDNI = "12345678A";
        sNmb = "Gerente";
        sNom = "1000";
        sIRPF = "20";
        sClb = "Valencia";
    }

    @Test
    public void testGerente() {
        Gerente gerente = new Gerente(sDNI, sNmb, sNom, sIRPF, sClb);

        assertEquals(gerente.getsDNI(), sDNI);
        assertEquals(gerente.getsNmb(), sNmb);
        assertEquals(gerente.getsNom(), sNom);
        assertEquals(gerente.getsIRPF(), sIRPF);
        assertEquals(gerente.getsClb(), sClb);
    }

    @Test
    public void testGetsDNI() {
    }

    @Test
    public void testSetsDNI() {
    }

    @Test
    public void testGetsNmb() {
    }

    @Test
    public void testSetsNmb() {
    }

    @Test
    public void testGetsNom() {
    }

    @Test
    public void testSetsNom() {
    }

    @Test
    public void testGetsIRPF() {
    }

    @Test
    public void testSetsIRPF() {
    }

    @Test
    public void testGetsClb() {
    }

    @Test
    public void testSetsClb() {
    }
    
}
