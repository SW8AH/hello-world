
import java.util.Scanner;

public class Kertoma {
       
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna luku: ");
            int luku2 = Integer.valueOf(lukija.nextLine());
        
            int kertoma = 1;
            int i = 1;
            
            // 2# > ehtolause, annettu luku on pienempi tai yhtä suuri kuin 1
        while (i <= luku2) {
            // 1# > 1 * 1 * 2 * ...
            kertoma = kertoma * i;
                    i++;
        }
        System.out.println("Kertoma on " + kertoma);
    }
}