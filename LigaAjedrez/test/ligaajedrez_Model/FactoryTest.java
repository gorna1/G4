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
public class FactoryTest {
    
    int iNum;
    String sNmb, sDNI;
    ArrayList<String> listaArg;
    ArrayList<String> listaClubs = new ArrayList<String>();
    
    public FactoryTest() {
        iNum = 1;
        sNmb = "Nombre";
        sDNI = "12345678A";
        listaArg.add("Apellido");
        listaArg.add("123456789");
        listaArg.add("50");
        listaArg.add("Principiante");
        listaArg.add("Valencia");
    }

    @Test
    public void testFactory() {
        
    }
    
    @Test
    public void testCrearPersona(){
        
    }
}

