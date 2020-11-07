/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligaajedrez_Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

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
    //protected ArrayList<Entrenador> listaEntrenadores = new ArrayList<Entrenador>() ;
    //protected ArrayList<Gerente> listaGerentes = new ArrayList<Gerente>() ;
    
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
            datos = new File ("") ;
            fr = new FileReader (datos) ;
            br = new BufferedReader(fr) ;

            // Lectura del fichero
            sLin=br.readLine() ;
            while(!(sLin.equals("FIN TORNEOS"))){
                sLin=br.readLine() ;
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
            while(!(sLin.equals("FIN CLUBES"))){
                sLin=br.readLine() ;
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
            while(!(sLin.equals("FIN JUGADORES"))){
                sLin=br.readLine() ;
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
            while(!(sLin.equals("FIN ENTRENADORES"))){
                sLin=br.readLine() ;
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
                if(sLin.contains("/")){
                    i++ ;
                    while(sLin.charAt(i) != '/'){
                        sPlb_Aux5 += sLin.charAt(i) ;
                        i++ ;
                    }
                    for(int j=i+1; j<sLin.length(); j++){
                        sPlb_Aux6 += sLin.charAt(j) ;
                    }
                }
                else{
                    for(int j=i+1; j<sLin.length(); j++){
                        sPlb_Aux6 += sLin.charAt(j) ;
                    }
                }
                //Constructor de Entrenador pasando sPlb,sPlb_Aux,sPlb_Aux2,sPlb_Aux3,sPlb_Aux,4,sPlb_Aux5,sPlb_Aux6
                //Hay que tener en cuenta que sPlb_Aux5 y sPlb_Aux6 son ambos Strings clubes, ya que pueden estar en varios
                sLin=br.readLine() ;
            }
            
            sLin=br.readLine() ;
            while(!(sLin.equals("FIN GERENTES"))){
                sLin=br.readLine() ;
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
                for(int j=i+1; j<sLin.length(); j++){
                    sPlb_Aux3 += sLin.charAt(j) ;
                }
                //Gerente gerente = new Gerente((sPlb, sPlb_Aux, sPlb_Aux2, sPlb_Aux3) ;
                //listaGerentes.add(gerente) ;
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
    
    public void anyadirJugadores(Jugador jugador){
        //Si esta en la lista ya en lugar de crear se sobreescribe borrando y creando
        if(listaJugadores.contains(jugador)){
            listaJugadores.remove(jugador) ;
            listaJugadores.add(jugador) ;
        }
        //Si no esta en la lista se crea directamente
        else
            listaJugadores.add(jugador) ;
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
        for(Torneo t : listaTorneos)
            listaRivales = t.consultarEnfrentamiento(nombre);
    
        return listaRivales;
    }
    
    public void eliminarJugador(String sDNI){
        Jugador jugador = new Jugador() ;
        
        //Se busca si existe el jugador mediante el DNI
        jugador = buscarJugador(sDNI) ;
        
        //Se comprueba si el jugador esta en la lista de morosos
        if(listaMorosos.contains(jugador))
            System.out.println("El jugador con el DNI introducido esta en la lista de morosos") ;
        else{
            listaJugadores.remove(jugador) ;
            System.out.println("El jugador con el DNI introducido a sido eliminado") ;
        }
    }
    
    public void cambiarClubJugador(Jugador jugador, String sClb_Nvo){
        Club club = new Club() ;
        
        for(int i=0; i<listaClubs.size(); i++)
            if(listaClubs.get(i).getNombre().equals(sClb_Nvo))
                jugador.setsClb(sClb_Nvo) ;
            else
                System.out.println("El Club introducido no corresponde a ningun nombre") ;
        
    }
    
    public Jugador buscarJugador(String sDNI){
        Jugador jugador = new Jugador() ;
        
        for(int i=0; i<listaJugadores.size(); i++)
            if(listaJugadores.get(i).getsDNI().equals(sDNI))
                jugador = listaJugadores.get(i) ;
            else
                System.out.println("El DNI introducido no corresponde a ningun jugador") ;
        
        return jugador ;
    }
}
    




