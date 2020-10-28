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
    
    public Jugador(String sNmb, String sApe, String sDNI, String sTel, String sEdad, String sElo){
        this.sNmb = sNmb ;
        this.sApe = sApe ;
        this.sDNI = sDNI ;
        this.sTel = sTel ;
        this.sEdad = sEdad ;
        this.sElo = sElo ;
    }
}
