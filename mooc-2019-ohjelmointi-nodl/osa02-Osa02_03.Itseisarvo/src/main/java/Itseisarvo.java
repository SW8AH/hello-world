
import java.util.Scanner;

public class Itseisarvo {

    public static void main(String[] main) {
        // Luodaan lukemiseen käytettävä Scanner-apuväline
        Scanner lukija = new Scanner(System.in);

        // Määritellään syötteet ja luetaan niihin arvot
        int eka = Integer.valueOf(lukija.nextLine());

        // Selvitetään laskuoperaatio ja luodaan laskuoperaation
        // tulokselle muuttuja
        int summa = eka;

        // toteutetaan ongelman vaativaa ehdollista toimintaa

        if (summa <= -1) { // jos summa on -1 tai vähemmän
            summa = summa * -1;
            System.out.println(summa);
        } else if (summa >= 1) { // jos summa on suurempi tai yhtä suuri kuin 1
            System.out.println(summa);
        }
    }
}