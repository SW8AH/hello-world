
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
// Tehtävänä lukumäärän ja summan säilöminen
        int lukuja = 0;
        int yhteensa = 0;
// Tehtävänä lukujen lukemisen toistaminen
        while (true) {
            System.out.println("Syötä luku ");
            // Tehtävänä yksittäisen luvun lukeminen
            int luku = Integer.valueOf(lukija.nextLine());
            // Tehtävänä toistolauseesta poistuminen kun 0
            if (luku == 0) {
                break;
            }
            // Tehtävänä laskeminen kun käyttäjä syöttää luvun 
            if (luku >= 1) {
                lukuja = lukuja + luku;
                yhteensa = yhteensa + 1;
            }
            if (luku <= -1) {
                lukuja = lukuja + luku;
                yhteensa = yhteensa + 1;
            }
        }
        double summa = 1.0 * lukuja / yhteensa;
// Tehtävänä laskutoimituksen tulostaminen
        //System.out.println("Lukuja yhteensä " + yhteensa);
        //System.out.println("Lukujen summa " + lukuja);
        System.out.println("Lukujen keskiarvo " + summa);
    }
}
