package week02_numbers;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author Vitvarova-J-31c9
 */
// Test: Filip 2010 a
public class Sentence {
    public static void main(String[] args) {
        //in
        String jmeno;
        int rokNarozeni;
        char trida;
        final int NASTUP = 6; //konstanta
        
        //testovaci data
//        jmeno = "Filip";
//        rokNarozeni = 2010;
//        trida = 'A';
        
        //nacitat od uzivatele
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej jmeno, rok narozeni a pismenko tridy");
        jmeno = sc.next(); //slovo
        rokNarozeni = sc.nextInt(); 
        trida = sc.next().charAt(0); //znak
        
        //algoritmus
        int rok = Year.now().getValue();
        int vek = rok - rokNarozeni;
        int cisloTridy = vek - NASTUP;
        
        //output
        System.out.println("Dite " + jmeno + " ma " + vek + " let a chodi do " 
                + cisloTridy + "." + Character.toUpperCase(trida) + ".");
    }
}
