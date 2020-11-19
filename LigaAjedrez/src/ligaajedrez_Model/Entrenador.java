/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligaajedrez_Model;

import java.util.ArrayList;

/**
 *
 * @author alberto
 */
public class Entrenador extends Persona{
    private String sFec ;
    private ArrayList<String> listaClubsEntrenador = new ArrayList<String>() ;
    
    public Entrenador(){}
    
    public Entrenador(String sNmb, String sApe, String sFec, String sDNI, String sTel, ArrayList<String> listaClubsEntrenador){
        this.sNmb = sNmb ;
        this.sApe = sApe ;
        this.sFec = sFec ;
        this.sDNI = sDNI ;
        this.sTel = sTel ;
        this.listaClubsEntrenador = listaClubsEntrenador ;
    }
    
    public String getsNmb(){
        return this.sNmb ;
    }
    
    public void setsNmb(String sNmb){
        this.sNmb = sNmb ;
    }
    
    public String getsApe(){
        return this.sApe ;
    }
    
    public void setsApe(String sApe){
        this.sApe = sApe ;
    }
    
    public String getsFec(){
        return this.sFec ;
    }
    
    public void setsFec(String sFec){
        this.sFec = sFec ;
    }
    
    public String getsDNI(){
        return this.sDNI ;
    }
    
    public void setsDNI(String sDNI){
        this.sDNI = sDNI ;
    }
    
    public String getsTel(){
        return this.sTel ;
    }
    
    public void setsTel(String sTel){
        this.sTel = sTel ;
    }
    
    public ArrayList<String> getlistaClubsEntrenador(){
        return this.listaClubsEntrenador ;
    }
    
    public void setsTel(ArrayList<String> listaClubsEntrenador){
        this.listaClubsEntrenador = listaClubsEntrenador ;
    }
}
