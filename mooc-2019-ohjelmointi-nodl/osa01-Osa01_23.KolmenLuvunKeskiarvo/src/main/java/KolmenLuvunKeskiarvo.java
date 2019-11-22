
import java.util.Scanner;

public class KolmenLuvunKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Syötä ensimmäinen luku!");
        double luku1 = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        double luku2 = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä kolmas luku!");
        double luku3 = Integer.valueOf(lukija.nextLine());
        double summa = ((luku1 + luku2 + luku3) / 3);
        System.out.println("Syötettyjen lukujen keskiarvo on " + summa);
    }
}
