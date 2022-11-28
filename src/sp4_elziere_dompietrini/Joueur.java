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
    private int nombreDesintegrateurs;
    private ArrayList <Jeton> reserveJetons = new ArrayList <Jeton>();

    public Joueur (String n) {
    nom=n;
    nombreJetonsRestants= 0;
    nombreDesintegrateurs=0;
    reserveJetons= null;}
    
    public void affecterCouleur(String c){
    couleur=c;
    }
    
    public boolean ajouterJeton (Jeton j){
        if (nombreJetonsRestants!=21){
            reserveJetons[nombreJetonsRestants]=j;
            return true;
        }else{
            return false;
        }     
    }
            
}
