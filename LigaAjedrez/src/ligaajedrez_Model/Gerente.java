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
public class Gerente extends Persona{
    private String sNom ;
    private String sIRPF ;
    private String sClb ;
    
    public Gerente(){}
    
    public Gerente(String sDNI, String sNmb, String sNom, String sIRPF, String sClb){
        this.sDNI = sDNI ;
        this.sNmb = sNmb ;
        this.sNom = sNom ;
        this.sIRPF = sIRPF ;
        this.sClb = sClb ;
    }
    
    public String getsDNI(){
        return sDNI ;
    }
    
    public void setsDNI(String sDNI){
        this.sDNI = sDNI ;
    }
    
    public String getsNmb(){
        return sNmb ;
    }
    
    public void setsNmb(String sNmb){
        this.sNmb = sNmb ;
    }
    
    public String getsNom(){
        return sNom ;
    }
    
    public void setsNom(String sNom){
        this.sNom = sNom ;
    }
    
    public String getsIRPF(){
        return sIRPF ;
    }
    
    public void setsIRPF(String sIRPF){
        this.sIRPF = sIRPF ;
    }
    
    public String getsClb(){
        return sClb ;
    }
    
    public void setsClb(String sClb){
        this.sClb = sClb ;
    }
}
