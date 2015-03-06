/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice_vendredi;

import java.util.Random;

/**
 *
 * @author Nicolas
 */
public class NombreAleatoire {

    public static void test(){
     
    }
    
    public static void main(String[] args) {
           Random rand = new Random();
        int nb1 = 0;
        int nb2 = 0;
        int nb3 = 0;
        int compteur = 1;
        do{
            nb1 = rand.nextInt(1000+ 1);
            nb2 = rand.nextInt(1000+ 1);
            nb3 = rand.nextInt(1000+ 1);
        
            System.out.println(nb1%2);
            System.out.println(nb2);
            System.out.println(nb3);
            compteur++;
        }while(nb1%2 != 0 && nb2%2 !=0 && nb3 == 0);
        System.out.println("il a fallu "+compteur+" essais pour avoir la combinaison PAIR PAIR IMPAIR");
        
    }
    
}
