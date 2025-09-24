
package week02_numbers;

import java.util.Scanner;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class Farm {
    public static void main(String[] args) {
        //in
        int pocetHus;
        int pocetKraliku;   
       final int POCET_NOHOU_KRALIKA = 4;
       final int POCET_NOHOU_HUSY = 2; 
        
       //nacitani
        Scanner sc = new Scanner(System.in);
        System.out.print("Pocet hus:");
        pocetHus = sc.nextInt();
        System.out.print("Pocet kraliku:");
        pocetKraliku = sc.nextInt();

        //algoritmus
        int pocetZvirat;
        int pocetNohou;
        pocetZvirat = pocetHus  + pocetKraliku;
        pocetNohou = (POCET_NOHOU_HUSY *pocetHus + POCET_NOHOU_KRALIKA* pocetKraliku);
        
        //output
        System.out.println("na farme je " + pocetZvirat + " zvirat a pocet nohou je " + pocetNohou);
    } 
}
