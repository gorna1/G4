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
public class Factory {
    
    public Factory(){}
    
    public Persona crearPersona(int iNum, String sNmb, String sDNI, ArrayList<String> listaArg, ArrayList<String> listaClubs){
        Persona p = null ;
        String sApe, sTel, sEdad, sElo, sClb ;
        String sFec ;
        String sNom, sIRPF ;
        switch(iNum){
            case 1: sApe = listaArg.get(1) ;
                    sTel = listaArg.get(2) ;
                    sEdad = listaArg.get(3) ;
                    sElo = listaArg.get(4) ;
                    sClb = listaArg.get(5) ;
                    
                    p = new Jugador(sNmb, sApe, sDNI, sTel, sEdad, sElo, sClb) ;
                    break ;
            
            case 2: sApe = listaArg.get(1) ;
                    sFec = listaArg.get(2) ;
                    sTel = listaArg.get(3) ;
                
                    p = new Entrenador(sNmb, sApe, sFec, sDNI, sTel, listaClubs) ;
                    break ;
            
            case 3: sNom = listaArg.get(1) ;
                    sIRPF = listaArg.get(2) ;
                    sClb = listaArg.get(3) ;
                    
                    p = new Gerente(sDNI, sNmb, sNom, sIRPF, sClb) ;
                    break ;
            
            default: break ;
        }
        
        return p ;
    }
}
