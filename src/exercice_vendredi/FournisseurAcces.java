/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice_vendredi;

/**
 *
 * @author Nicolas
 */
public class FournisseurAcces {
    
    
    
    private static void DetectionFournisseur(String tab[]) {
        String[] fournisseur = new String[tab.length];
        
        for (int i = 0; i < tab.length; i++ ) {
            int pos = tab[i].lastIndexOf("@");
            fournisseur[i] = tab[i].substring(pos+1, tab[i].length());
        }
        FournisseurAcces.CompteurFournisseur(fournisseur);
    }
    
    public static void CompteurFournisseur(String tableau[]) {
        String nom = null;
        int compteur = 0;
        int pointeur = 0;
        for (int i = 0; i < tableau.length; i++ ){
            System.out.print(tableau [i] + " a une part de marché de "); 
            compteur = 0;
            
            for(int j = 0; j < tableau.length; j++){
                if(tableau[i].equalsIgnoreCase(tableau [j]))
                    compteur++;
            }
            pointeur = i;
            if(tableau[i].equalsIgnoreCase(tableau[++pointeur]))
                i = ++i;
            
            System.out.println(compteur*10+"%");
        }
                
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mail[] = {"1@free.fr", "2@orange.fr", "3@free.fr", "4@free.fr", "5@free.fr", "6@free.fr", "7@free.fr", "8@free.fr", "9@free.fr", "10@free.fr"};
        FournisseurAcces.DetectionFournisseur(mail);
    }
    
}
