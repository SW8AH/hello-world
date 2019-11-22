
import java.util.Scanner;

public class LukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

// Tehtävänä lukumäärän säilöminen
        int lukuja = 0;

// Tehtävänä lukujen lukemisen toistaminen
        while (true) {
            // Tehtävänä yksittäisen luvun lukeminen
            int luku = Integer.valueOf(lukija.nextLine());

            // Tehtävänä toistolauseesta poistuminen kun
            // käyttäjä syöttää luvun nolla
            if (luku == 0) {
                break;
            }

            // Tehtävänä lukujen summan kasvattaminen
            if (luku >= 1) {
                lukuja = lukuja + luku;
            }
            if (luku <= -1) {
                lukuja = lukuja + luku;
            }
        }
// Tehtävänä havainnoitujen lukujen summan tulostaminen
        System.out.println(lukuja);
    }
}