
import java.util.Scanner;

public class SamatSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen merkkijono:");
        String mj_1 = lukija.nextLine();
        System.out.println("Syötä toinen merkkijono:");
        String mj_2 = lukija.nextLine();
        
        if (mj_1.equalsIgnoreCase(mj_2)) {
            System.out.println("Samat sanat");
        } else {
            System.out.println("Ei sitten");
        }
    }
}
