/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_elziere_dompietrini;

import java.util.ArrayList;

/**
 *
 * @author elena
 */
public class Joueur {
    private String nom;
    private String couleur;
    private ArrayList <Jeton> reserveJetons = new ArrayList <Jeton>();
    private int nombreDesintegrateurs;
    
    
    public Joueur (String n) {
      nom=n;
      nombreDesintegrateurs=0;
      reserveJetons= null;}
    
    public void affecterCouleur(String c){
      couleur=c;
    }
    
    public int nombreDeJetons (){
      int nbJeton = reserveJetons.size();
      return nbJeton;
     }
    
    public void ajouterJeton (Jeton j){
       reserveJetons.add(j);   
    }
    
    public Jeton jouerJeton() {
       int n = nombreDeJetons();
       Jeton j =  reserveJetons.remove(n);
       return j;
       
    }
    
    public void obtenirDesintegrateur() {
       nombreDesintegrateurs+=1;
    }
    
    public void utiliserDesintegrateur() {
       nombreDesintegrateurs-=1;  
    }
}
