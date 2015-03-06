/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice_vendredi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class PlusOuMoins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int nb1 = 0;
        nb1 = rand.nextInt(1000+ 1);
        int nbu = 0;
        Scanner sc= new Scanner(System.in);
        System.out.print("rentrer un chiffre entre 1 et 1000 pour trouver le chiffre mystère : ");
        nbu = sc.nextInt();
        
        while(nbu>1000){
            System.err.print("Votre chiffre est supérieur a 1000 recommencer :) :");
            nbu = sc.nextInt();
        }
        while(nbu<0){
            System.err.print("Votre chiffre est inférieur à 0 recommencer :) :");
            nbu = sc.nextInt();
        }
        
        while(nbu != nb1){
            if(nbu>nb1)
                System.out.println("Trop grand");
            if(nbu<nb1)
                System.out.println("Trop petit");
            System.out.print("recommencer :) : ");
            nbu = sc.nextInt();
        }
        System.out.println("Bravo vous avez trouver :"+nb1);
    }
    
}