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
import java.util.ArrayList;
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
    
    public LigaAjedrez(){}
    
    public LigaAjedrez(File datos){  
        FileReader fr = null ;
        BufferedReader br = null ;
        String sLin ;
        char cCar ;
        String sPlb = "" , sPlb_Aux = "", sPlb_Aux2 = "", sPlb_Aux3 = "" ;
        String sPlb_Aux4 = "", sPlb_Aux5 = "", sPlb_Aux6 = "" ;
        int i=0 ;
        
        try{
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            fr = new FileReader (datos) ;
            br = new BufferedReader(fr) ;

            // Lectura del fichero
            sLin=br.readLine() ;
            sLin=br.readLine() ;
            
            while(!(sLin.equals("FIN TORNEOS"))){
                i = 0;
                sPlb = "";
                sPlb_Aux = "";
                while(sLin.charAt(i) != ','){
                    sPlb += sLin.charAt(i) ;
                    i++ ;
                }
                for(int j=i+1; j<sLin.length(); j++){
                    sPlb_Aux += sLin.charAt(j) ;
                }
                Torneo torneo = new Torneo(sPlb, sPlb_Aux) ;
                listaTorneos.add(torneo) ;
                sLin=br.readLine() ;
            }
            sLin=br.readLine() ;
            sLin=br.readLine() ;
            
            while(!(sLin.equals("FIN CLUBES"))){
                i = 0;
                sPlb = "";
                sPlb_Aux = "";
                while(sLin.charAt(i) != ','){
                    sPlb += sLin.charAt(i) ;
                    i++ ;
                }
                for(int j=i+1; j<sLin.length(); j++){
                    sPlb_Aux += sLin.charAt(j) ;
                }
                Club club = new Club(sPlb, sPlb_Aux) ;
                listaClubs.add(club) ;
                sLin=br.readLine() ;
            }
            sLin=br.readLine() ;
            sLin=br.readLine() ;
            
            while(!(sLin.equals("FIN JUGADORES"))){
                i = 0;
                sPlb = "";
                sPlb_Aux = "";
                sPlb_Aux2 = "";
                sPlb_Aux3 = "";
                sPlb_Aux4 = "";
                sPlb_Aux5 = "";
                sPlb_Aux6 = "";
                while(sLin.charAt(i) != ','){
                    sPlb += sLin.charAt(i) ;
                    i++ ;
                }
                i++ ;
                while(sLin.charAt(i) != ','){
                    sPlb_Aux += sLin.charAt(i) ;
                    i++ ;
                }
                i++ ;
                while(sLin.charAt(i) != ','){
                    sPlb_Aux2 += sLin.charAt(i) ;
                    i++ ;
                }
                i++ ;
                while(sLin.charAt(i) != ','){
                    sPlb_Aux3 += sLin.charAt(i) ;
                    i++ ;
                }
                i++ ;
                while(sLin.charAt(i) != ','){
                    sPlb_Aux4 += sLin.charAt(i) ;
                    i++ ;
                }
                i++ ;
                while(sLin.charAt(i) != ','){
                    sPlb_Aux5 += sLin.charAt(i) ;
                    i++ ;
                }       
                for(int j=i+1; j<sLin.length(); j++){
                    sPlb_Aux6 += sLin.charAt(j) ;
                }
                Jugador jugador = new Jugador(sPlb, sPlb_Aux, sPlb_Aux2, sPlb_Aux3, sPlb_Aux4, sPlb_Aux5, sPlb_Aux6) ;
                listaJugadores.add(jugador) ;
                sLin=br.readLine() ;
            }
            sLin=br.readLine() ;
            sLin=br.readLine() ;
            
            while(!(sLin.equals("FIN ENTRENADORES"))){
                i = 0;
                sPlb = "";
                sPlb_Aux = "";
                sPlb_Aux2 = "";
                sPlb_Aux3 = "";
                sPlb_Aux4 = "";
                sPlb_Aux5 = "";
                sPlb_Aux6 = "";
                while(sLin.charAt(i) != ','){
                    sPlb += sLin.charAt(i) ;
                    i++ ;
                }
                i++ ;
                while(sLin.charAt(i) != ','){
                    sPlb_Aux += sLin.charAt(i) ;
                    i++ ;
                }
                i++ ;
                while(sLin.charAt(i) != ','){
                    sPlb_Aux2 += sLin.charAt(i) ;
                    i++ ;
                }
                i++ ;
                while(sLin.charAt(i) != ','){
                    sPlb_Aux3 += sLin.charAt(i) ;
                    i++ ;
                }
                i++ ;
                while(sLin.charAt(i) != ','){
                    sPlb_Aux4 += sLin.charAt(i) ;
                    i++ ;
                }
                if(sLin.contains("-")){
                    i++ ;
                    while(sLin.charAt(i) != '-'){
                        sPlb_Aux5 += sLin.charAt(i) ;
                        i++ ;
                    }
                    listaClubsEntrenador.add(sPlb_Aux5) ;
                    for(int j=i+1; j<sLin.length(); j++){
                        sPlb_Aux6 += sLin.charAt(j) ;
                    }
                    listaClubsEntrenador.add(sPlb_Aux6) ;
                }
                else{
                    for(int j=i+1; j<sLin.length(); j++){
                        sPlb_Aux6 += sLin.charAt(j) ;
                    }
                    listaClubsEntrenador.add(sPlb_Aux6) ;
                }
                //Constructor de Entrenador pasando sPlb,sPlb_Aux,sPlb_Aux2,sPlb_Aux3,sPlb_Aux,4,sPlb_Aux5,sPlb_Aux6
                //Hay que tener en cuenta que sPlb_Aux5 y sPlb_Aux6 son ambos Strings clubes, ya que pueden estar en varios
                Entrenador entrenador = new Entrenador(sPlb, sPlb_Aux, sPlb_Aux2, sPlb_Aux3, sPlb_Aux4, listaClubsEntrenador) ;
                listaEntrenadores.add(entrenador) ;
                listaClubsEntrenador.clear() ;
                sLin=br.readLine() ;
            }
            
            sLin=br.readLine() ;
            sLin=br.readLine() ;
            
            while(!(sLin.equals("FIN GERENTES"))){
                i = 0;
                sPlb = "";
                sPlb_Aux = "";
                sPlb_Aux2 = "";
                sPlb_Aux3 = "";
                sPlb_Aux4 = "";
                while(sLin.charAt(i) != ','){
                    sPlb += sLin.charAt(i) ;
                    i++ ;
                }
                i++ ;
                while(sLin.charAt(i) != ','){
                    sPlb_Aux += sLin.charAt(i) ;
                    i++ ;
                }
                i++ ;
                while(sLin.charAt(i) != ','){
                    sPlb_Aux2 += sLin.charAt(i) ;
                    i++ ;
                }
                i++ ;
                while(sLin.charAt(i) != ','){
                    sPlb_Aux3 += sLin.charAt(i) ;
                    i++ ;
                }
                for(int j=i+1; j<sLin.length(); j++){
                    sPlb_Aux4 += sLin.charAt(j) ;
                }
                Gerente gerente = new Gerente(sPlb, sPlb_Aux, sPlb_Aux2, sPlb_Aux3, sPlb_Aux4) ;
                listaGerentes.add(gerente) ;
                sLin=br.readLine() ;
            }
            sLin=br.readLine() ;
            sLin=br.readLine() ;
            while (!(sLin.equals("FIN ENFRENTAMIENTOS"))) {
                i = 0;
                sPlb = "";
                sPlb_Aux = "";
                while(sLin.charAt(i) != ','){
                    sPlb += sLin.charAt(i) ;
                    i++ ;
                }
                for(int j = i+1; j<sLin.length(); j++)
                    sPlb_Aux += sLin.charAt(j) ;
                Jugador j1;
                Jugador j2;
                j1 = buscarJugador(sPlb);
                j2 = buscarJugador(sPlb_Aux);
                listaEnfrentamientos.add(new EnfrentamientoTorneo(j1, j2));
                sLin=br.readLine() ;
            }
            
        }
        catch(Exception e){
            e.printStackTrace() ;
        }
        finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
                if(null != fr)
                   fr.close() ;     
            
            }
            catch (Exception e2){ 
                e2.printStackTrace() ;
            }
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
    
    public void anyadirJugadores(Jugador jugador){
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
    }
    
    public void addSedes(String ciudad,String sede){
        for(Club c: listaClubs)
            if(c.getNombre().equals(ciudad))
                c.anyadirSedes(sede);
                
    }
    
    public void eliminarJugador(String sDNI){
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
    
    public void anyadirGerente(Gerente gerente){
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
    }
    
    public void eliminarGerente(String sDNI){
        Gerente gerente = new Gerente() ;
        
        //Se busca si existe el jugador mediante el DNI
        gerente = buscarGerente(sDNI) ;
        
        if(gerente.getsDNI() != null){
            listaGerentes.remove(gerente) ;
            JOptionPane.showMessageDialog(null, "El gerente ha sido eliminado") ;
        }
        
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
    
    public void anyadirEntrenador(Entrenador entrenador){
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
    }
    
    public void eliminarEntrenador(String sDNI){
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
    




