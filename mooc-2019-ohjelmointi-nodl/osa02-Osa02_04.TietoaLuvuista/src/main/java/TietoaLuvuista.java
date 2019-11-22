
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] main) {
        // Luodaan lukemiseen käytettävä Scanner-apuväline
        Scanner lukija = new Scanner(System.in);

        // Määritellään syötteet ja luetaan niihin arvot
        int eka = Integer.valueOf(lukija.nextLine());
        int toka = Integer.valueOf(lukija.nextLine());

        // toteutetaan ongelman vaativaa ehdollista toimintaa

        if (eka > toka) {
            System.out.println("Luku " + eka + " on suurempi kuin luku " + toka + ".");
        } else if (toka > eka) {
            System.out.println("Luku " + eka + " on pienempi kuin luku " + toka + ".");
        } else if (eka == toka) {
            System.out.println("Luku " + eka + " on yhtä suuri kuin luku " + toka + ".");
    }
    }
}
