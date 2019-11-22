
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        Scanner lukija = new Scanner(System.in);

        // OSA 1: Lukujen lukeminen
        // tallentaa syötetyt luvut
        int lukuja = 0;
        int lukuja1 = 0;
        int parillisia = 0;
        int parittomia = 0;

        System.out.println("Syötä luvut: ");

        while (true) {
            //OSA1
            int luku = Integer.valueOf(lukija.nextLine());
            //OSA 2: lukujen summa
            if (luku >= 1) {
                lukuja = lukuja + luku;
            }
            if (luku <= -2) {
                lukuja = lukuja + luku;
            }
            //OSA 3: lukujen määrä
            if (luku >= 1) {
                lukuja1 = lukuja1 + 1;
            }
            if (luku <= -2) {
                lukuja1 = lukuja1 + 1;
                // OSA 5: Parillisia ja parittomia
            }
            if (luku % 2 == 0) {
                parillisia = parillisia + 1;
            }
            if (luku % 2 == 1) {
                parittomia = parittomia + 1;
            }
            // lopetus komento
            if (luku == -1) {
                break;
            }
        }
        double keskiarvo = 1.0 * lukuja / lukuja1;
        //OSA 1, 2, 3, 4 ja 5
        System.out.println("Kiitos ja näkemiin! ");
        System.out.println("Summa: " + lukuja);
        System.out.println("Lukuja " + lukuja1);
        System.out.println("Keskiarvo: " + keskiarvo);   
        System.out.println("Parillisia: " + parillisia);
        System.out.println("Parittomia " + parittomia);
    }
}
