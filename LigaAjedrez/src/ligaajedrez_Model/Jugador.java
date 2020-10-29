/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligaajedrez_Model;

/**
 *
 * @author alberto
 */
public class Jugador {
    private String sNmb ;
    private String sApe ;
    private String sDNI ;
    private String sTel ;
    private String sEdad ;
    private String sElo ;
    private String sFed ;
    
    public Jugador(){
        
    }
    
    public Jugador(String sNmb, String sApe, String sDNI, String sTel, String sEdad, String sElo, String sFed){
        this.sNmb = sNmb ;
        this.sApe = sApe ;
        this.sDNI = sDNI ;
        this.sTel = sTel ;
        this.sEdad = sEdad ;
        this.sElo = sElo ;
        this.sFed = sFed ;
    }

    public String getsNmb() {
        return sNmb;
    }
    
    public String getFed() {
        return sFed;
    }

    public void setsNmb(String sNmb) {
        this.sNmb = sNmb;
    }

    public String getsApe() {
        return sApe;
    }

    public void setsApe(String sApe) {
        this.sApe = sApe;
    }

    public String getsDNI() {
        return sDNI;
    }

    public void setsDNI(String sDNI) {
        this.sDNI = sDNI;
    }

    public String getsTel() {
        return sTel;
    }

    public void setsTel(String sTel) {
        this.sTel = sTel;
    }

    public String getsEdad() {
        return sEdad;
    }

    public void setsEdad(String sEdad) {
        this.sEdad = sEdad;
    }

    public String getsElo() {
        return sElo;
    }

    public void setsElo(String sElo) {
        this.sElo = sElo;
    }
}
