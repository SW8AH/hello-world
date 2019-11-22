
import java.util.Scanner;

public class LukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

// Tehtävänä ykkösten lukumäärän säilöminen
        int lukuja = 0;

// Tehtävänä lukujen lukemisen toistaminen
        while (true) {
            System.out.println("Syötä luku ");
            // Tehtävänä yksittäisen luvun lukeminen
            int luku = Integer.valueOf(lukija.nextLine());

            // Tehtävänä toistolauseesta poistuminen kun
            // käyttäjä syöttää luvun nolla
            if (luku == 0) {
                break;
            }

            // Tehtävänä ykkösten lukumäärän kasvattaminen
            // yhdellä kun käyttäjä syöttää luvun yksi
            if (luku >= 1) {
                lukuja = lukuja + 1;
            }
            if (luku <= -1) {
                lukuja = lukuja + 1;
            }
        }
// Tehtävänä havainnoitujen ykkösten lukumäärän tulostaminen
        System.out.println("Lukuja yhteensä " + lukuja);
    }
}
