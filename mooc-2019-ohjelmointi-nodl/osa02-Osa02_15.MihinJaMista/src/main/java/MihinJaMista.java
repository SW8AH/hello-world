
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Mihin asti?");
            int luku1 = Integer.valueOf(lukija.nextLine());

        System.out.println("Mistä lähtien?");
            int luku2 = Integer.valueOf(lukija.nextLine());

            while ( luku2 < luku1 + 1 ) {
                System.out.println( luku2 );
                luku2++;
        }
    }
}