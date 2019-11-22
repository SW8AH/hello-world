
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Ensimmäinen: ");
            int luku1 = Integer.valueOf(lukija.nextLine());
         
        System.out.println("Viimeinen: ");
            int luku2 = Integer.valueOf(lukija.nextLine());
        
            int summa = 0;
       
            while ( luku1 <= luku2 ) {
            summa = summa + luku1;
            luku1++;
            }
            System.out.println("Summa on " + summa);
            }
}