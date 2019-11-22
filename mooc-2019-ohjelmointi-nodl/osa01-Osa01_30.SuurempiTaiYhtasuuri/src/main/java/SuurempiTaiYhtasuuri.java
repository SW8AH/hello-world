
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna ensimmäinen luku:");
        int e = Integer.valueOf(lukija.nextLine());
        System.out.println("Anna toinen luku:");
        int t = Integer.valueOf(lukija.nextLine());
        if (e == t) {
          //  System.out.println("Anna ensimmäinen luku: " + (e));
           // System.out.println("Anna toinen luku: " + (t));
            System.out.println("Luvut ovat yhtä suuret!");
        } else if (e >= t) {
            System.out.println("Suurempi luku: " + e);
        } else if (e <= t) {
            System.out.println("Suurempi luku: " + t);
        }
    }
}
