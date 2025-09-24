package week02_numbers;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class Swap {
    public static void main(String[] args) {
        //in
        int a = 34;
        int b = 89;
        
        //varianta 1
        System.out.println(b + " " + a);
        
        //varianta 2
        int c = a;
        a = b;
        b = c;
        
        System.out.println(a + " " + b);
        
        //varianta 3
        a = a + b;
        b = a - b;
        a = a - b;
       
        System.out.println(a + " " + b);
        
        
    }
}
