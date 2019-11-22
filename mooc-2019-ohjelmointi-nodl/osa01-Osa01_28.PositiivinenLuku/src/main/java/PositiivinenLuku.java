
import java.util.Scanner;

public class PositiivinenLuku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna luku:");
                int l = Integer.valueOf(lukija.nextLine());
        if (l >= 1) {
            System.out.println("Luku on positiivinen.");        
        }
        if (l <= 0) {
            System.out.println("Luku ei ole positiivinen.");        
        }
    }
}