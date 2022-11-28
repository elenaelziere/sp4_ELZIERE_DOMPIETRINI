/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_elziere_dompietrini;

/**
 *
 * @author elena
 */
public class Partie {
    private Joueur[] listeJoueurs;
    private Joueur joueurCourant;
    PlateauDeJeu plateau;
    
    
    public Partie(Joueur Joueur1, Joueur Joueur2){
        listeJoueurs = new Joueur[2];
        listeJoueurs [0]=Joueur1;
        listeJoueurs [1]=Joueur2;
        }
    
    public void  attribuerCouleurAuxJoueurs(){
        
        listeJoueurs [0].affecterCouleur("rouge");
        listeJoueurs [1].affecterCouleur("jaune");
    }
    
  public void creerEtAffecterJeton(Joueur j){
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void initialiserPartie(){
        plateau=new PlateauDeJeu();
        
        for (int i=0;i<21;i++){
            if (listeJoueurs[0].couleur=="rouge"){
                Jeton JetonJoueur1=new Jeton ("rouge");
                listeJoueurs[0].ajouterJeton(JetonJoueur1);
                Jeton JetonJoueur2=new Jeton ("jaune");
                listeJoueurs[1].ajouterJeton(JetonJoueur2);
            }
            else{
                Jeton JetonJoueur1=new Jeton ("jaune");
                listeJoueurs[0].ajouterJeton(JetonJoueur1);
                Jeton JetonJoueur2=new Jeton ("rouge");
                listeJoueurs[1].ajouterJeton(JetonJoueur2);
            }
        }            
    }
    public void debuterPartie(){
        boolean gagne=false;
        int nbrtour=0;
        Scanner sc= new Scanner(System.in);
        while(gagne==false){
            if (nbrtour%2==0){
                joueurCourant=listeJoueurs [0];
            } else joueurCourant=listeJoueurs [1];
            
            Jeton un_jeton= new Jeton(joueurCourant.couleur);
            if (joueurCourant.ajouterJeton (un_jeton)==true){
                int colonne=10;
                while (colonne<0 ||colonne>6){
                    System.out.println("Choisissez une colonne entre 0 et 6");
                    colonne=sc.nextInt();
                }
                grilleJeu.ajouterJetonsDansColonne(un_jeton, colonne);
            }
            else {
                System.out.println("Vous n'avez plus de jetons");
            }
            grilleJeu.afficherGrilleSurConsole();
            gagne=grilleJeu.etreGagantePourJoueur(joueurCourant);
            if (grilleJeu.etreRemplie()==true){
                System.out.println("La grille est remplie, aucun joueur n'a gagné");
                break;
            }
        }  
    }  
}
