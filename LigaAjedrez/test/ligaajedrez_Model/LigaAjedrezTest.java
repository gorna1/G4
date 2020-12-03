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
public class LigaAjedrezTest {
    protected ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
    protected ArrayList<Torneo> listaTorneos = new ArrayList<Torneo>();
    protected ArrayList<Jugador> listaRivales = new ArrayList<Jugador>();
    protected ArrayList<Jugador> listaMorosos = new ArrayList<Jugador>();
    protected ArrayList<Club> listaClubs = new ArrayList<Club>();
    protected ArrayList<Club> listaClubsGetter = new ArrayList<Club>();
    protected ArrayList<Entrenador> listaEntrenadores = new ArrayList<Entrenador>() ;
    protected ArrayList<String> listaClubsEntrenador = new ArrayList<String>() ;
    protected ArrayList<Gerente> listaGerentes = new ArrayList<Gerente>() ;
    protected ArrayList<EnfrentamientoTorneo> listaEnfrentamientos = new ArrayList<EnfrentamientoTorneo>() ;
    Torneo t;
    LigaAjedrez l;
    
    public LigaAjedrezTest() {
        l = new LigaAjedrez();
        t = new Torneo ("Torneo de prueba","Valencia");
        listaTorneos.add(t);
    }

    @Test
    public void testAnyadirTorneo() {
        t = new Torneo ("Torneo de juju","Valencia");
        ArrayList<Torneo> listaTorneos1 = new ArrayList<Torneo>();
        listaTorneos1.add(t);
        
        assertArrayEquals(listaTorneos,listaTorneos1);
        
        
    }

    @Test
    public void testConsultarTorneo() {
        Torneo t1 = new Torneo ("Torneo de prueba","Valencia");
        ArrayList<Torneo> listaTorneos1 = new ArrayList<Torneo>();
        listaTorneos1.add(t1);
        assertArrayEquals(listaTorneos1,l.consultarTorneo());
    }

    @Test
    public void testAnyadirClub() {
        
    }

    @Test
    public void testConsultarClubs() {
        
    }

    @Test
    public void testAnyadirJugadorTorneo() {
    }

    @Test
    public void testConsultarJugadores() {
    }

    @Test
    public void testConsultarEnfrentamiento() {
    }

    @Test
    public void testAnyadirJugadores() throws Exception {
    }

    @Test
    public void testAddSedes() {
    }

    @Test
    public void testEliminarJugador() throws Exception {
    }

    @Test
    public void testCambiarClubJugador() {
    }

    @Test
    public void testBuscarJugador() {
    }

    @Test
    public void testAnyadirGerente() throws Exception {
    }

    @Test
    public void testEliminarGerente() throws Exception {
    }

    @Test
    public void testCambiarClubGerente() {
    }

    @Test
    public void testBuscarGerente() {
    }

    @Test
    public void testGetClubs() {
    }

    @Test
    public void testAnyadirEntrenador() throws Exception {
    }

    @Test
    public void testEliminarEntrenador() throws Exception {
    }

    @Test
    public void testBuscarEntrenador() {
    }

    @Test
    public void testConsultarInfoEnfrentamiento() {
    }
    
}

