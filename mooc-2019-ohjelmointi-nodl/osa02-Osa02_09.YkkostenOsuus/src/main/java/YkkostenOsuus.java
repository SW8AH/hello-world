
import java.util.Scanner;

public class YkkostenOsuus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

// Tehtävänä lukujen tallentaminen
        int ykkosia = 0;
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
            // Tehtävänä ykkösten lukumäärä jaettuna
            // syötettyjen lukujen lukumäärällä.
            if (luku == 1) {
                ykkosia = ykkosia + 1;
            }
            if (luku <= -1) {
                lukuja = lukuja + 1;
            }
            if (luku >= 1) {
                lukuja = lukuja + 1;
            }
        }
        // vaihtoehtoinen toiminta keskiarvon perusteella
        if (lukuja == 0) {
            System.out.println("ykkösten osuutta ei voida laskea");
        } else {
            // keskiarvon laskeminen
            double keskiarvo = 1.0 * ykkosia / lukuja;
            System.out.println(keskiarvo);
        }
    }
}
