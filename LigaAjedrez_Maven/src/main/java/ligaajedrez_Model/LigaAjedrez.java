/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligaajedrez_Model;

import Controlador.Administrador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.TimeZone;
import javax.swing.JOptionPane;

/**
 *
 * @author Gor
 */


public class LigaAjedrez {
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
    protected Connection conexionBD;
    private ArrayList<String> listaArg= new ArrayList<String>() ;
    Factory fac = new Factory() ;
    Entrenador entrenador1 = new Entrenador() ;
    Gerente gerente1 = new Gerente() ;
    Jugador jugador1 = new Jugador() ;
    
    public LigaAjedrez(){}
    
    public LigaAjedrez(File datos){  
        String bd = "jdbc:mysql://localhost/practicaIS2?serverTimezone=" + TimeZone.getDefault().getID();
        try {
         Class.forName("com.mysql.cj.jdbc.Driver"); // Driver de mysql
            // Conexión usando usuario y clave de administrador de la BD
            conexionBD = DriverManager.getConnection(bd, "root", "3141632");
        } catch (Exception e) { // Error en la conexión con la BD
            System.out.println(e);
            System.out.println("Error de conexión");
        }
        
    }
    
    public void anyadirTorneo(Torneo torneo){
        listaTorneos.add(torneo);
    }
    
    public ArrayList<Torneo> consultarTorneo(){
        return listaTorneos;
    }
    
    public void anyadirClub(Club c) {
        listaClubs.add(c);
    }
    
    public ArrayList<Club> consultarClubs() {
        return listaClubs;
    }
    
    public void anyadirJugadorTorneo(Torneo t, Jugador j){
        for(Torneo lTorneos :listaTorneos)
            if(lTorneos == t)
                lTorneos.anyadirJugadorTorneo(j);
            }
                
    public ArrayList<Jugador> consultarJugadores(){
        return listaJugadores;
    }
    
    public ArrayList<Jugador> consultarEnfrentamiento(String nombre){
        listaRivales.removeAll(listaRivales);
        for(Torneo t : listaTorneos)
            listaRivales.addAll(t.consultarEnfrentamiento(nombre));
        return listaRivales;
    }
    
    public void anyadirJugadores(Jugador jugador) throws SQLException{
        //Si esta en la lista ya en lugar de crear se sobreescribe borrando y creando
        if(listaJugadores.contains(jugador)){
            listaJugadores.remove(jugador) ;
            listaJugadores.add(jugador) ;
            JOptionPane.showMessageDialog(null, "Jugador modificado") ;
        }
        //Si no esta en la lista se crea directamente
        else{
            listaJugadores.add(jugador) ;
        }
        Statement s = conexionBD.createStatement();
        String con = "INSERT INTO jugadores(nombre, apellidos, dni, telefono, edad, elo, club) VALUES('" 
                        + jugador.getsNmb() + "','"
                        + jugador.getsApe() + "','"
                        + jugador.getsDNI() + "','"
                        + jugador.getsTel()+ "','"
                        + jugador.getsEdad()+ ","
                        + jugador.getsElo()+ ","
                        + jugador.getsClb()+ "'"
                 + ")";
                PreparedStatement preparedStm = conexionBD.prepareStatement(con);
                preparedStm.executeUpdate();
    }
    
    public void addSedes(String ciudad,String sede){
        for(Club c: listaClubs)
            if(c.getNombre().equals(ciudad))
                c.anyadirSedes(sede);
                
    }
    
    public void eliminarJugador(String sDNI) throws SQLException{
        Jugador jugador = new Jugador() ;
        
        //Se busca si existe el jugador mediante el DNI
        jugador = buscarJugador(sDNI) ;
        
        if(jugador != null){
            //Se comprueba si el jugador esta en la lista de morosos
            if(listaMorosos.contains(jugador))
                JOptionPane.showMessageDialog(null, "El jugador esta en la lista de morosos") ;
            else{
                listaJugadores.remove(jugador) ;
                JOptionPane.showMessageDialog(null, "El jugador ha sido eliminado") ;
            }
            
        }
        String con = "DELETE FROM jugadores "
                + "WHERE dni == "+jugador.getsDNI()
                 + ")";
                PreparedStatement preparedStm = conexionBD.prepareStatement(con);
                preparedStm.executeUpdate();
        
    }
    
    public void cambiarClubJugador(Jugador jugador, String sClb_Nvo){
        Club club = new Club() ;
        boolean bCmp = false ;
        
        for(int i=0; i<listaClubs.size(); i++) {
            if(listaClubs.get(i).getNombre().equals(sClb_Nvo)) {
                jugador.setsClb(sClb_Nvo) ;
                bCmp = true ;
                break;
            }
        }
        if(!bCmp)
                JOptionPane.showMessageDialog(null, "El club introducido no existe") ;
    }
    
    public Jugador buscarJugador(String sDNI){
        Jugador jugador = new Jugador() ;
        boolean bCmp = false ;
        
        for (Jugador j : listaJugadores) {
            if (j.getsDNI().equals(sDNI)) {
                jugador = j;
                bCmp = true;
                break;
            }
        }
        if(!bCmp)
                JOptionPane.showMessageDialog(null, "El jugador no existe") ;
        
        return jugador ;
    }
    
    public void anyadirGerente(Gerente gerente) throws SQLException{
        //Si esta en la lista ya en lugar de crear se sobreescribe borrando y
        //creando ya que el usuario ha debido modificar algun campo
        if(listaGerentes.contains(gerente)){
            listaGerentes.remove(gerente) ;
            listaGerentes.add(gerente) ;
            JOptionPane.showMessageDialog(null, "Gerente modificado") ;
        }
        //Si no esta en la lista se crea directamente
        else{
            listaGerentes.add(gerente) ;
            JOptionPane.showMessageDialog(null, "Gerente creado") ;
        }
        String con = "INSERT INTO gerentes(dni, nombre, nomina, irpf, club) VALUES('" 
                        + gerente.getsDNI() + "','"
                        + gerente.getsNmb() + "','"
                        + gerente.getsNom() + "','"
                        + gerente.getsIRPF()+ "','"
                        + gerente.getsClb()+ "'"
                 + ")";
                PreparedStatement preparedStm = conexionBD.prepareStatement(con);
                preparedStm.executeUpdate();
         
        
    }
    
    public void eliminarGerente(String sDNI) throws SQLException{
        Gerente gerente = new Gerente() ;
        
        //Se busca si existe el jugador mediante el DNI
        gerente = buscarGerente(sDNI) ;
        
        if(gerente.getsDNI() != null){
            listaGerentes.remove(gerente) ;
            JOptionPane.showMessageDialog(null, "El gerente ha sido eliminado") ;
        }
        String con = "DELETE FROM gerentes "
                + "WHERE dni == "+gerente.getsDNI()
                 + ")";
                PreparedStatement preparedStm = conexionBD.prepareStatement(con);
                preparedStm.executeUpdate();
        
        
    }
    
    public void cambiarClubGerente(Gerente gerente, String sClb_Nvo){
        Club club = new Club() ;
        
        for(int i=0; i<listaClubs.size(); i++)
            if(listaClubs.get(i).getNombre().equals(sClb_Nvo))
                gerente.setsClb(sClb_Nvo) ;
            else
                JOptionPane.showMessageDialog(null, "El club introducido no existe") ;
    }
    
    public Gerente buscarGerente(String sDNI){
        Gerente gerente = new Gerente() ;
        
        for(int i=0; i<listaGerentes.size(); i++)
            if(listaGerentes.get(i).getsDNI().equals(sDNI))
                gerente = listaGerentes.get(i) ;
            else{
                JOptionPane.showMessageDialog(null, "Gerente NO encontrado") ;
                return null ;
            }
        
        return gerente ;
    }
    
    public ArrayList<Club> getClubs(String federacion){
        
        for(Club c: listaClubs)
            if(c.getFederacion().equals(federacion))
                listaClubsGetter.add(c);
        
        return listaClubsGetter;
    }
    
    public void anyadirEntrenador(Entrenador entrenador) throws SQLException{
        //Si esta en la lista ya en lugar de crear se sobreescribe borrando y
        //creando ya que el usuario ha debido modificar algun campo
        if(listaEntrenadores.contains(entrenador)){
            listaEntrenadores.remove(entrenador) ;
            listaEntrenadores.add(entrenador) ;
            JOptionPane.showMessageDialog(null, "Entrenador modificado") ;
        }
        //Si no esta en la lista se crea directamente
        else{
            listaEntrenadores.add(entrenador) ;
            JOptionPane.showMessageDialog(null, "Entrenador creado") ;
        }
        Statement s = conexionBD.createStatement();
        String con = "INSERT INTO entrenadores(nombre, apellidos, fecha, dni, telefono) VALUES('" 
                        + entrenador.getsNmb() + "','"
                        + entrenador.getsApe() + "','"
                        + entrenador.getsFec() + "','"
                        + entrenador.getsDNI()+ "','"
                        + entrenador.getsTel()+ "'"
                 + ")";
                PreparedStatement preparedStm = conexionBD.prepareStatement(con);
                preparedStm.executeUpdate();
    }

    
    
    public void eliminarEntrenador(String sDNI) throws SQLException{
        Entrenador entrenador = new Entrenador() ;
        
        //Se busca si existe el jugador mediante el DNI
        entrenador = buscarEntrenador(sDNI) ;
        if(entrenador.getsDNI() != null){
            listaGerentes.remove(entrenador) ;
            JOptionPane.showMessageDialog(null, "Entrenador eliminado") ;
        }
        else{
            JOptionPane.showMessageDialog(null, "No se ha podido eliminar el entrenador") ;
        }
        String con = "DELETE FROM entrenadores "
                + "WHERE dni == "+entrenador.getsDNI()
                 + ")";
                PreparedStatement preparedStm = conexionBD.prepareStatement(con);
                preparedStm.executeUpdate();
        
    }
    
    public Entrenador buscarEntrenador(String sDNI){
        Entrenador entrenador = new Entrenador() ;
        
        for(int i=0; i<listaEntrenadores.size(); i++)
            if(listaEntrenadores.get(i).getsDNI().equals(sDNI))
                entrenador = listaEntrenadores.get(i) ;
            else{
                JOptionPane.showMessageDialog(null, "Entrenador NO encontrado") ;
                return null ;
            }
        
        return entrenador ;
    }

    public EnfrentamientoTorneo consultarInfoEnfrentamiento(String uno, String dos){
        EnfrentamientoTorneo et = new EnfrentamientoTorneo();
        for(Torneo t: listaTorneos)
            et = t.consultarInfoEnfrentamiento(uno,dos);
        return et;
    }
}
    




