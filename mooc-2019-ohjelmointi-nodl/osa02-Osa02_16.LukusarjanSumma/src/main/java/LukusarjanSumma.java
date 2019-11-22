
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        //lukusarjan alku 1 + ...
        int luku1 = 1;
        
        System.out.println("Mihin asti?");
            int luku2 = Integer.valueOf(lukija.nextLine());
        
        int summa = 0;
            
        while (luku1 <= luku2) {
            summa = summa + luku1;
            luku1++;
        }
        System.out.println("Summa on " + summa);
    }
}