/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_elziere_dompietrini;

/**
 *
 * @author elena
 */
public class CelluleDeGrille {
    
    private Jeton jetonCourant;
    private boolean avoirTrouNoir;
    private boolean avoirDesintegrateur;
    
    
    public CelluleDeGrille(){
        jetonCourant=null;
        avoirTrouNoir=false;
        avoirDesintegrateur=false;
    }
    
     
    public boolean presenceJeton(Jeton unJeton){
        if (jetonCourant==null){
            jetonCourant=unJeton;
            return true;
        }
        else return false;
        
    }
    
     public void affecterJeton(Jeton unJeton){
            jetonCourant= unJeton;
                
     }
    
    public String lireCouleurDuJeton(){
        if (jetonCourant==null) return "vide";
        else{
            return jetonCourant.lireCouleur();
        }
           
    }
}





