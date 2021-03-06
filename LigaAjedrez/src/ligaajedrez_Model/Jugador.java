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
public class Jugador extends Persona{
    private String sEdad ;
    private String sElo ;
    private String sClb ;
    private String sApe ;
    private String sTel ;
    protected ArrayList<Jugador> listaPartidas = new ArrayList<Jugador>();
    
    public Jugador(){
        
    }
    
    public Jugador(String sNmb, String sApe, String sDNI, String sTel, String sEdad, String sElo, String sClb){
        this.sNmb = sNmb ;
        this.sApe = sApe ;
        this.sDNI = sDNI ;
        this.sTel = sTel ;
        this.sEdad = sEdad ;
        this.sElo = sElo ;
        this.sClb = sClb ;
    }

    public String getsNmb() {
        return sNmb ;
    }

    public void setsNmb(String sNmb) {
        this.sNmb = sNmb ;
    }

    public String getsApe() {
        return sApe ;
    }

    public void setsApe(String sApe) {
        this.sApe = sApe ;
    }

    public String getsDNI() {
        return sDNI ;
    }

    public void setsDNI(String sDNI) {
        this.sDNI = sDNI ;
    }

    public String getsTel() {
        return sTel ;
    }

    public void setsTel(String sTel) {
        this.sTel = sTel ;
    }

    public String getsEdad() {
        return sEdad ;
    }

    public void setsEdad(String sEdad) {
        this.sEdad = sEdad ;
    }

    public String getsElo() {
        return sElo ;
    }

    public void setsElo(String sElo) {
        this.sElo = sElo ;
    }
    
    public String getsClb() {
        return sClb ;
    }
    
    public void setsClb(String sClb) {
        this.sClb = sClb ;
    }
    
}
